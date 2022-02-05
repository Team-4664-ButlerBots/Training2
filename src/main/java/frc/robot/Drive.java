// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import javax.sound.sampled.SourceDataLine;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Victor;

/** Add your docs here. */
public class Drive {
    private final Victor m_leftDrive = new Victor(6);
    private final Victor m_rightDrive = new Victor(7);
    private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftDrive, m_rightDrive);
    private final Joystick m_stick = new Joystick(0);
    private double speedMultiplier = 0.5;


    public void operationalDrive() { 
        m_robotDrive.tankDrive(-m_stick.getRawAxis(1) * speedMultiplier, m_stick.getRawAxis(3) * speedMultiplier);
    }

    public void speed(){
        boolean buttonPressed = m_stick.getRawButtonPressed(1);
        if (buttonPressed){
            if (speedMultiplier == 0.5)
                speedMultiplier = 0.8;
            else
                speedMultiplier = 0.5;
        }
    }
}
