package frc.team4069.robot

import edu.wpi.first.wpilibj.XboxController
import edu.wpi.first.wpilibj.buttons.JoystickButton

object OI {
    // Reference to the controller, number from the driver station
    private val controller = XboxController(0)

    init {
        // Button that we can bind commands to
        val aButton = JoystickButton(controller, 1)

        // How do we get ExampleCommand to run when we press the A button?
    }
}