package car;

/**
 * Created by dirty on 29.01.16.
 */
public class Car  implements CentralInterface{
    @Override
    public int getPrice() {
        return 280000;
    }
    public void move(){
        System.out.println("I'm a car, I can move");
    }
}
