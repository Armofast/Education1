/**
 * Created by dirty on 01.02.16.
 */
public class Main {
    public static void main(String[] args) {
        Context context=new Context();

        State state1=new FirstState();
        state1.doAction(context);
        System.out.println(context.getState());

        State state2=new SecondState();
        state2.doAction(context);
        System.out.println(context.getState());
    }
}
