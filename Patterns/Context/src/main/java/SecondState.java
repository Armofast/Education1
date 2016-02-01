/**
 * Created by dirty on 01.02.16.
 */
public class SecondState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Setting second state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "SecondState{}";
    }
}
