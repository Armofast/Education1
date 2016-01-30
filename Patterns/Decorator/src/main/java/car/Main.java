package car;

/**
 * Created by dirty on 29.01.16.
 */
public class Main {
    public static void main(String[] args) {
        Decorator decorator=new GetLow(new DarkWindows(new Car()));
        System.out.println(decorator.getPrice());
        System.out.println(decorator.getNameParameter());
    }
}
