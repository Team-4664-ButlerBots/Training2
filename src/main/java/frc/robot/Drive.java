// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//import javax.sound.sampled.SourceDataLine;
//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Victor;

/** Add your docs here. */
public class Drive {
    private final Victor m_leftDrive = new Victor(6);
    private final Victor m_rightDrive = new Victor(7);
    private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftDrive, m_rightDrive);
    private double speedMultiplier = 0.5;
    public Controller Manager;

    public Drive(Controller referenceManager){
        Manager = referenceManager;
    }

    public void operationalDrive() { 
        speed();
        m_robotDrive.tankDrive(Manager.getLeftAxis() * speedMultiplier, Manager.getRightAxis() * speedMultiplier);
    }

    //changes speedMultiplier by checking if button 1 is pressed...?
    public void speed(){                    //is constantly ran in Robot class
        boolean buttonPressed1 = Manager.getSpeedToggle();
        if (buttonPressed1){
            if (speedMultiplier == 0.5)
                speedMultiplier = 0.8;
            else
                speedMultiplier = 0.5;
        }
    }
}
