package pizza;

/**
 * Created by dirty on 29.01.16.
 */
public class Main {
    public static void main(String[] args) {
        PizzaDecorator pizzaDecorator=new PizzaBacon(new PizzaCheese(new Pizza()));
        System.out.println(pizzaDecorator.getPrice()+"end");
    }
}
