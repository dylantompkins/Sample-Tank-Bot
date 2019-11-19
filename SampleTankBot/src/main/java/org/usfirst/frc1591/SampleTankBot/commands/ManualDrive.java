package org.usfirst.frc1591.SampleTankBot.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1591.SampleTankBot.Robot;
import org.usfirst.frc1591.SampleTankBot.subsystems.DriveTrain;

/**
 *
 */
public class ManualDrive extends Command {

    public ManualDrive() {
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        double xSpeed = Robot.oi.joystick.getY();
        double zRotation = Robot.oi.joystick.getX();

        Robot.driveTrain.arcadeDrive(xSpeed, zRotation);
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
        end();
    }
}
