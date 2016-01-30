package tankImpl;

import interfaces.Tank;

/**
 * Created by dirty on 29.01.16.
 */
public class T28 implements Tank {
    @Override
    public void shoot() {
        System.out.println("T28 shoots");
    }

    @Override
    public String getDescription() {
        return "T28 tank";
    }
}
