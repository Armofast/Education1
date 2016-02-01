package automat;

/**
 * Created by dirty on 01.02.16.
 */
public class CashState implements AutomatState {
    @Override
    public void doAction(Context context) {
        System.out.println("Return cash");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "CashState{}";
    }
}
