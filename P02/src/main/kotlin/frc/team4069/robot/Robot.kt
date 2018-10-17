package frc.team4069.robot

import com.ctre.phoenix.motorcontrol.can.TalonSRX
import edu.wpi.first.wpilibj.TimedRobot

class Robot : TimedRobot() {
    // The motor controller we're going to be using
    lateinit var talon: TalonSRX

    // Called once when user code is started
    override fun robotInit() {
        // The number is the ID of the motor controller on CAN.
        talon = TalonSRX(1)
    }

    // Called frequently during teleoperated mode
    override fun teleopPeriodic() {
    }

    // Called when autonomous mode is started
    override fun autonomousInit() {
        // Want to make the motor spin forwards at top speed here
        // What to do?
    }
}