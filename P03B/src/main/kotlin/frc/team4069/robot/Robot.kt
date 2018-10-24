package frc.team4069.robot

import edu.wpi.first.wpilibj.TimedRobot

class Robot : TimedRobot() {
    override fun robotInit() {
        // Initialize the subsystems and OI interface
        DriveSubsystem
        OI
    }

    override fun teleopInit() {
        // Remember, called when TELEOPERATED begins. This is when drivers will move the robot
        // Make DriveCommand start executing here
    }
}