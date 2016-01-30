package tankImpl;

import interfaces.Tank;

/**
 * Created by dirty on 29.01.16.
 */
public class T64 implements Tank {
    @Override
    public void shoot() {
        System.out.println("T64 shoots");
    }

    @Override
    public String getDescription() {
        return "T64 tank";
    }
}
