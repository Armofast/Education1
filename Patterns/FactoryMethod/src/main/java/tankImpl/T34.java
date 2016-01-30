package tankImpl;

import interfaces.Tank;

/**
 * Created by dirty on 29.01.16.
 */
public class T34 implements Tank {
    @Override
    public void shoot() {
        System.out.println("T34 shoots");
    }

    @Override
    public String getDescription() {
        return "T34 tank";
    }
}
