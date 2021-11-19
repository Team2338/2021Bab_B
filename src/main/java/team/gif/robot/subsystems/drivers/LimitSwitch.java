
package team.gif.robot.subsystems.drivers;

import edu.wpi.first.wpilibj.DigitalInput;
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
 *
 */
public class LimitSwitch extends SubsystemBase {
  private static LimitSwitch instance = null;

  // creates a singleton class (only 1 instance can be instantiated)
  public static LimitSwitch getInstance() {
    if (instance == null) {
      instance = new LimitSwitch();
    }
    return instance;
  }
  // creates new limit switch object
  DigitalInput lim1 = new DigitalInput(RobotMap.DEVICE_ID);

  public boolean limSwitchStatus() {
    if (lim1.get())
      return true;
    else
      return false;
  }

}
