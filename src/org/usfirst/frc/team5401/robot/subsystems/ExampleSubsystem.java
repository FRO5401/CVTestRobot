package org.usfirst.frc.team5401.robot.subsystems;

import org.usfirst.frc.team5401.robot.commands.ExampleCommand;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.*;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	  static NetworkTable RioTable;
	  double NetworkX = 0;
	  double NetworkY = 0;
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new ExampleCommand());
	}
	
	public void DisplayTables() {
	   NetworkX =  RioTable.getNumber("Y",-99);
	   NetworkY = RioTable.getNumber("X",-99);
		System.out.println(NetworkX);
		System.out.println(NetworkY);
	}
}
