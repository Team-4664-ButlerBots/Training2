// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc;

import edu.wpi.first.wpilibj.Controller;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Victor;

/** Add your docs here. */
public class Drive {
    private final Victor m_leftDrive = new Victor(6);
    private final Victor m_rightDrive = new Victor(7);
    private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftDrive, m_rightDrive);
    private final Joystick m_stick = new Joystick(0);

    public Drive() {

    }

    public void operationalDrive() {
        m_robotDrive.tankDrive(-m_stick.getRawAxis(1) * 0.6, m_stick.getRawAxis(3) * 0.6);

    }
}
