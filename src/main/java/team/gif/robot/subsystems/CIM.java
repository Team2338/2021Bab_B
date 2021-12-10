
package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

/**
 * Subsystems describe functionality of a particular feature of
 * the robot. It contains methods for commands (and other methods)
 *    to interact with the subsystem.
 * Example: An Elevator subsysytem might have commands which
 *    set a zero position setZeroPosition()
 *    get position getPosition()
 *    move hanger to a specific height setHeight()
 *
 * Describe the Subsystem functionality here
 */
public class CIM extends SubsystemBase {
  private static CIM instance = null;

  // creates a singleton class (only 1 instance can be instantiated)
  public static CIM getInstance() {
    if (instance == null) {
      instance = new CIM();
    }
    return instance;
  }
  private static final TalonSRX talon1 = new TalonSRX(RobotMap.MOTOR_TALON_ONE);
  public CIM(){
    talon1.setNeutralMode(NeutralMode.Brake);
  }
  public void setspeed(double speed) {

    talon1.set(ControlMode.PercentOutput, speed);


  }
}
