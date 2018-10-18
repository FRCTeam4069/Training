package frc.team4069.robot

import edu.wpi.first.wpilibj.TimedRobot
import edu.wpi.first.wpilibj.command.Scheduler

class Robot : TimedRobot() {
    override fun teleopPeriodic() {
        Scheduler.getInstance().run() // Run the command scheduler, this will update inputs and run existing commands
    }
}