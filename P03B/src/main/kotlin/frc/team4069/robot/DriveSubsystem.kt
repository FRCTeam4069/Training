package frc.team4069.robot

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.drive.DifferentialDrive

object DriveSubsystem : Subsystem() {
    override fun initDefaultCommand() {
    }
    // Create the master talons with values from RobotMap

    // Fill in these values with the motor controllers
    lateinit var drive: DifferentialDrive

    init {
        // Use TalonSRX.follow() with the master talon to create the followers
        // Ids are in RobotMap

        // Construct an instance of DifferentialDrive here and store it in drive
    }

    fun drive(forwardSpeed: Double, turn: Double) {
        // Implement this function. Remember how differential drive works
        drive.arcadeDrive(forwardSpeed, turn)
    }
}