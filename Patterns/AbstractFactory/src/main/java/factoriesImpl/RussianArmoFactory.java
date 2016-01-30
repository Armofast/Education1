package factoriesImpl;

import airplains.RussianAirplane;
import interfaces.Airplane;
import interfaces.ArmoFactory;
import interfaces.Tank;
import tanks.RussianTank;

/**
 * Created by dirty on 29.01.16.
 */
public class RussianArmoFactory implements ArmoFactory {
    @Override
    public Airplane createAirplane() {
        return new RussianAirplane();
    }

    @Override
    public Tank createTank() {
        return new RussianTank();
    }
}
