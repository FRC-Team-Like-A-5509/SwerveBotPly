// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5509.SwerveBotPly.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5509.SwerveBotPly.Robot;
import org.usfirst.frc5509.SwerveBotPly.subsystems.DriveTrain;

/**
 *
 */
public class Drive extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public Drive() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	Robot.driveTrain.initTurnMode();
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	double rotation;
    	double x;
    	double y;
    	
    	rotation = Robot.oi.getJoystick1().getRawAxis(4);
    	x = Robot.oi.getJoystick1().getRawAxis(0);
    	y = Robot.oi.getJoystick1().getRawAxis(1) * -1;
    	
    	if(Math.abs(rotation) < .1) {
    		rotation = 0;
    	}
    	if(Math.abs(x) < .1) {
    		x = 0;
    	}
    	if(Math.abs(y) < .1) {
    		y = 0;
    	}
    	
    	Robot.driveTrain.drive(rotation, x, y);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
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
