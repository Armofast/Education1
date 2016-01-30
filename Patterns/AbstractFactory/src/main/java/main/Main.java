package main;

import factoriesImpl.UsaArmoFactory;
import interfaces.Airplane;
import interfaces.ArmoFactory;
import interfaces.Tank;

/**
 * Created by dirty on 29.01.16.
 */
public class Main {
    public static void main(String[] args) {
        ArmoFactory armoFactory=new UsaArmoFactory();
        Airplane airplane=armoFactory.createAirplane();
        System.out.println(airplane.getDesciption());
        Tank tank=armoFactory.createTank();
        System.out.println(tank.getDesciption());
    }
}
