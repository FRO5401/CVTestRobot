package org.usfirst.frc.team5401.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5401.robot.Robot;

/**
 *
 */
public class ExampleCommand extends Command {
	
	private int i;
	private boolean done;
	
	public ExampleCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.exampleSubsystem);
		i = 0;
		done = false;
	}

	// Called just before this Command runs the first time
	@Override

	protected void initialize() {
		i = 0;
		done = false;

	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.exampleSubsystem.DisplayTables();
		i = i+1;;
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		if (i > 1000) {
			done = true;
		}
		return done;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
