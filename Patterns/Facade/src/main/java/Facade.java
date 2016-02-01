import shapes.Shape;

/**
 * Created by dirty on 01.02.16.
 */
public class Facade {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public Facade(Shape circle, Shape square, Shape rectangle) {
        this.circle = circle;
        this.square = square;
        this.rectangle = rectangle;
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
