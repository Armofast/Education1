package pizza;

/**
 * Created by dirty on 29.01.16.
 */
public class PizzaCheese extends PizzaDecorator {
    public PizzaCheese(PizzaInterface component) {
        super(component);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+10;
    }

    @Override
    public void getDescription() {
        System.out.println("Pizza with cheese");
    }
}
