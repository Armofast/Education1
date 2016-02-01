package automat;

/**
 * Created by dirty on 01.02.16.
 */
public class Context {
    AutomatState state;

    public AutomatState getState() {
        System.out.println("Return goods to consumer");
        return state;
    }

    public void setState(AutomatState state) {
        this.state = state;
    }
}
