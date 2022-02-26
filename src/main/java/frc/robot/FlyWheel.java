package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
public class FlyWheel {
    private final Victor leftWheelC = new Victor(8);
    private final Victor rightWheelC = new Victor(9);
    public Controller cManager;
    private double speed = 0;
    private double flyWheelSpeed = 0.2;
    
    public FlyWheel(Controller refeController){
        this.cManager = refeController;
    }

    public void operationalWheels(){
        //speedCheck();
        speed();
        System.out.println(speed);
        leftWheelC.set(speed);
        rightWheelC.set(speed);
    }
    
    int state = 0;
    int speedMult = 0;
    public void speed(){
        if(cManager.flyWheelToggle()){
            state++;
        }
        if(cManager.flyWheelSpeedToggle()){
            speedMult = (speedMult + 1)%2;
        }
        switch(state){
            case 0:
                speed = 0.2 * speedMult;
                break;
            case 1:
                speed = 0.5 * speedMult;
                break;
            case 2:
                state = 0;
                break;
        }
    } 

   /*
    public double speed(){
        boolean check = cManager.flyWheelToggle();
        if (check){
            if (speed==0)
                speed = flyWheelSpeed;
            else
                speed = 0;
        }
        return speed;
    }

    public double speedCheck(){
        boolean speedCheck = cManager.flyWheelSpeedToggle();
        if (speedCheck){
            if (flyWheelSpeed==0.2)
                flyWheelSpeed = 0.5;
            else
                flyWheelSpeed = 0.2;
        }
        return flyWheelSpeed;
    }
    */
}
