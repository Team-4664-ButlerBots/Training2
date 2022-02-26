package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Controller {
    
    private final Joystick m_stick = new Joystick(0);

    //left stick input
    public double leftStick(){
        return  m_stick.getRawAxis(1);
    }

    //right stick input
    public double rightStick(){
        return m_stick.getRawAxis(3);
    }

    //button 1
    public boolean button1(){
        return m_stick.getRawButtonPressed(1);
    }
}
