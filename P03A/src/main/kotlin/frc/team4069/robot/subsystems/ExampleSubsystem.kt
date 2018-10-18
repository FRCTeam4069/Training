package frc.team4069.robot.subsystems

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import edu.wpi.first.wpilibj.command.Subsystem

object ExampleSubsystem : Subsystem() {
    // The motor controller we're using
    private val talon = TalonSRX(1)

    // Function for commands to use
    fun setSpeed(newSpeed: Double) {
        // Set that speed to the talon, recall last lesson
        talon.set(ControlMode.PercentOutput, newSpeed)
    }

    override fun initDefaultCommand() {
        // This subsystem has no default command, nothing needed here.
    }
}
