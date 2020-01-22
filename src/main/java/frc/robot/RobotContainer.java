/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.DriveTrainCommand;
import frc.robot.motors.TitanFX;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.TankDrive;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */

public class RobotContainer {

	// Declare the robot's components here
	private TitanFX leftFrontMotor;
	private TitanFX leftBackMotor;
	private TitanFX rightFrontMotor;
	private TitanFX rightBackMotor;
	// see

	// The robot's subsystems and commands are defined here...
	private final DriveTrain driveTrain = new TankDrive();

	private final DriveTrainCommand autonomousCommand = new DriveTrainCommand(driveTrain);

	private OI oi;


	/**
	 * The container for the robot.  Contains subsystems, OI devices, and commands.
	 */
	public RobotContainer() {
		leftFrontMotor = new TitanFX(0, false);
		leftBackMotor = new TitanFX(0, false);
		rightFrontMotor = new TitanFX(0, false);
		rightBackMotor = new TitanFX(0, false);
		// Configure the button bindings
		configureButtonBindings();
	}

	/**
	 * Use this method to define your button->command mappings.  Buttons can be created by
	 * instantiating a {@link GenericHID} or one of its subclasses ({@link
	 * edu.wpi.first.wpilibj.Joystick Joystick} or {@link XboxController}), and then passing it to a
	 * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton JoystickButton}.
	 */
	private void configureButtonBindings() {
		oi = new OI();
	}


	/**
	 * Use this to pass the autonomous command to the main {@link Robot} class.
	 *
	 * @return the command to run in autonomous
	 */
	public Command getAutonomousCommand() {
		// An ExampleCommand will run in autonomous
		return autonomousCommand;
	}
}
