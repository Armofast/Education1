package automat;

/**
 * Created by dirty on 01.02.16.
 */
public class CashLessState implements AutomatState {
    @Override
    public void doAction(Context context) {
            System.out.println("");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "CashLessState{}";
    }
}
