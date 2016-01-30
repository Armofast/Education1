package pizza;

/**
 * Created by dirty on 29.01.16.
 */
public abstract class PizzaDecorator implements PizzaInterface {
    PizzaInterface component;

    public PizzaDecorator(PizzaInterface component) {
        this.component = component;
    }

    @Override
    public int getPrice() {
        return component.getPrice() ;
    }
    public abstract void getDescription();
}
