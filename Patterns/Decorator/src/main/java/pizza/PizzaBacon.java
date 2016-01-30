package pizza;

/**
 * Created by dirty on 29.01.16.
 */
public class PizzaBacon extends PizzaDecorator {
    public PizzaBacon(PizzaInterface component) {
        super(component);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+17;
    }

    @Override
    public void getDescription() {
        System.out.println("Pizza bacon");
    }
}
