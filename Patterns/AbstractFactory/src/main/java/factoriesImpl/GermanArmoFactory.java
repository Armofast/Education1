package factoriesImpl;

import airplains.GermanAirplane;
import interfaces.Airplane;
import interfaces.ArmoFactory;
import interfaces.Tank;
import tanks.GermanTank;

/**
 * Created by dirty on 29.01.16.
 */
public class GermanArmoFactory implements ArmoFactory {
    @Override
    public Airplane createAirplane() {
        return new GermanAirplane();
    }

    @Override
    public Tank createTank() {
        return new GermanTank();
    }
}
