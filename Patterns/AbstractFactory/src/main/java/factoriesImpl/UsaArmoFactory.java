package factoriesImpl;

import airplains.UsaAirplane;
import interfaces.Airplane;
import interfaces.ArmoFactory;
import interfaces.Tank;
import tanks.UsaTank;

/**
 * Created by dirty on 29.01.16.
 */
public class UsaArmoFactory implements ArmoFactory {
    @Override
    public Airplane createAirplane() {
        return new UsaAirplane();
    }

    @Override
    public Tank createTank() {
        return new UsaTank();
    }
}
