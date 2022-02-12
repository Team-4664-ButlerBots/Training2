package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
public class Controller {
    final Joystick m_stick = new Joystick(0);

    public double getLeftAxis(){
        double laxis = -m_stick.getRawAxis(1);
        return laxis;
    }

    public double getRightAxis(){
        double raxis = m_stick.getRawAxis(3);
        return raxis;
    }

    public boolean getSpeedToggle(){
        boolean speedCheck = m_stick.getRawButtonPressed(1);
        return speedCheck;
    }

}