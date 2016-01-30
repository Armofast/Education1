package main;

import interfaces.Tank;
import interfaces.TankCreator;
import tankImpl.UssrTankCreator;

/**
 * Created by dirty on 29.01.16.
 */
public class Main {
    public static void main(String[] args) {
        TankCreator tankCreator=new UssrTankCreator();
        Tank tank=tankCreator.createTank("t28");
        System.out.println(tank.getDescription()+" ");
        tank.shoot();
    }
}
