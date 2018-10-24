package frc.team4069.robot

import edu.wpi.first.wpilibj.command.Command

class ElevatorCommand : Command() {

    init {
        requires(ElevatorSubsystem)
    }

    override fun execute() {
        // Get the joystick from OI, write it to the elevator
        ElevatorSubsystem.set(TODO())
    }

    // This command should never finish, fill in the blanks
    override fun isFinished() = TODO()
}