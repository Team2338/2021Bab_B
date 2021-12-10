
package team.gif.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import team.gif.robot.subsystems.drivers.LimitSwitch;
import team.gif.robot.subsystems.drivers.Pigeon;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  public static OI oi;
  public static LimitSwitch limSwitch;
  public static Pigeon runPig;
  public static WPI_TalonSRX talon1;

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    // instantiate talon1
    talon1 = new WPI_TalonSRX(RobotMap.MOTOR_TALON_ONE);

    // Instantiate our RobotContainer.  This will perform all our button bindings, and put our
    System.out.println("robot init");
    // autonomous chooser on the dashboard.

    // LimitSwitch Object
    limSwitch = new LimitSwitch(RobotMap.DEVICE_ID);

    // Pigeon object
    runPig = new Pigeon(talon1); // talon1 is the talon variable from the CIM motor
  }

  /**
   * This function is called every robot packet, no matter the mode. Use this for items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {

    CommandScheduler.getInstance().run();

    // print limit switch status
    System.out.println(limSwitch.getState());

    // print Pigeon heading
    System.out.println(runPig.get360Heading());

    // Shuffleboard updated limit switch command
    SmartDashboard.putBoolean("Limit Switch", limSwitch.getState());

    // Shuffleboard updated compass widget
    SmartDashboard.putNumber("Heading", runPig.get360Heading());
  }

  /**
   * This function is called once each time the robot enters Disabled mode.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
    System.out.println("teleop init");

    oi = new OI();
  }

  @Override
  public void teleopPeriodic() {

  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

  @Override
  public void simulationInit() {
  }

  @Override
  public void simulationPeriodic(){
  }
}