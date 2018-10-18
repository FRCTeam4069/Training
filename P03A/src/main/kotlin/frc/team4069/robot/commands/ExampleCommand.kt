package frc.team4069.robot.commands

import edu.wpi.first.wpilibj.command.Command
import frc.team4069.robot.subsystems.ExampleSubsystem

class ExampleCommand : Command() {

    var startTime = -1L
    var lastSpeed = 0.0

    // Called when an instance of ExampleCommand is constructed
    init {
        // Indicates that this command acts on ExampleSubsystem
        requires(ExampleSubsystem)
    }

    override fun initialize() {
        println("Command starting.")
        // Set the start time when the command starts
        startTime = System.currentTimeMillis()
    }

    override fun execute() {
        // Increment lastSpeed, making sure it stays within the acceptable range
        lastSpeed += 0.01
        lastSpeed.coerceIn(-1.0..1.0)

        // Instruct the subsystem what to do
        ExampleSubsystem.setSpeed(lastSpeed)
    }

    // This command finishes instantly
    override fun isFinished(): Boolean {
        return (System.currentTimeMillis() - startTime) > 2000 // At least 2 seconds have passed
    }

    override fun end() {
        super.end()
    }
}