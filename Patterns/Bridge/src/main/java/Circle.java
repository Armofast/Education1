/**
 * Created by dirty on 30.01.16.
 */
public class Circle extends Shape {
    public Circle(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        drawing.draw();
    }
}
