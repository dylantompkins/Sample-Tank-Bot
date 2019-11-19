package org.usfirst.frc1591.SampleTankBot.subsystems;


import org.usfirst.frc1591.SampleTankBot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.RobotDrive;

import edu.wpi.first.wpilibj.GenericHID;

/**
 *
 */
public class DriveTrain extends Subsystem {

    private WPI_TalonSRX leftMotor;
    private WPI_TalonSRX rightMotor;
    private DifferentialDrive arcadeDrive;

    public DriveTrain() {
        leftMotor = new WPI_TalonSRX(1);
        
        rightMotor = new WPI_TalonSRX(2);
        
        arcadeDrive = new DifferentialDrive(leftMotor, rightMotor);
        
        arcadeDrive.setSafetyEnabled(true);
        arcadeDrive.setExpiration(0.1);
        arcadeDrive.setMaxOutput(1.0);

    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new ManualDrive());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    public void arcadeDrive(double xSpeed, double zRotation) {
        arcadeDrive.arcadeDrive(xSpeed, zRotation);
    }
}

