package car;

/**
 * Created by dirty on 29.01.16.
 */
public class DarkWindows extends Decorator {
    public DarkWindows(CentralInterface centralInterface) {
        super(centralInterface);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1500;
    }

    public String getNameParameter() {
        return "Тонировочка";

    }
}
