package tankImpl;

import interfaces.Tank;
import interfaces.TankCreator;

/**
 * Created by dirty on 29.01.16.
 */
public class UssrTankCreator implements TankCreator {
    @Override
    public Tank createTank(String tankType) {
        tankType=tankType.toUpperCase();
        switch (tankType){
            case "T34": return new T34();
            case  "T28": return new T28();
            case  "T64": return new T64();
            default:return null;
        }
    }
}
