package pizza;

/**
 * Created by dirty on 29.01.16.
 */
public  class Pizza implements PizzaInterface {
    public Pizza(){
        System.out.println("Pizza");
    }
    @Override
    public int getPrice() {
        return 85;
    }

}
