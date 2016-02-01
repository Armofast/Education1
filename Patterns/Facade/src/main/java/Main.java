import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

/**
 * Created by dirty on 01.02.16.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Square square=new Square();
        Rectangle rectangle=new Rectangle();
        Facade facade=new Facade(circle,square,rectangle);
        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();
    }
}
