package frc.team4069.robot

import edu.wpi.first.wpilibj.XboxController

object OI {
    private val controller = XboxController(0)

    val driveAxis: Double
        get() {
            // We want this to be the triggers. RT is forward, LT is backwards
            // LT is getRawAxis(2). RT is getRawAxis(3)
            TODO()
        }


    val turnAxis: Double
        get() = controller.getRawAxis(0)
}