/**
 * Created by dirty on 01.02.16.
 */
public class FirstState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Setting first state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "FirstState{}";
    }
}
