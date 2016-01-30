/**
 * Created by dirty on 30.01.16.
 */
public abstract class Shape {
    Drawing drawing;
    public Shape(Drawing drawing){
        this.drawing=drawing;
    }
    public abstract void draw();
}
