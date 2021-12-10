
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
public class LimitSwitch {
  DigitalInput limSwitch;

  public LimitSwitch(int id) {
    // creates new limit switch object
    limSwitch = new DigitalInput(id);
  }

  public boolean getState() {
    return !limSwitch.get();
  }

}
