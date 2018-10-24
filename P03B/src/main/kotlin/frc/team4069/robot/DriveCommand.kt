package frc.team4069.robot

import edu.wpi.first.wpilibj.command.Command

class DriveCommand : Command() {

    init {
        requires(DriveSubsystem)
    }

    // Recall the lifecycle of a command
    override fun execute() {
        val forward = OI.driveAxis
        val turn = OI.turnAxis
        // Use these values in conjunction with DriveSubsystem to make the robot move
    }

    override fun isFinished(): Boolean {
        return false
    }
}