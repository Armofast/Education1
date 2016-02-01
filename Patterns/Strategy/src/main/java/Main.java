import strategy.OperationAdd;
import strategy.OperationSub;

/**
 * Created by dirty on 01.02.16.
 */
public class Main {
    public static void main(String[] args) {
        OperationAdd operation1=new OperationAdd();
        OperationSub operation2=new OperationSub();

        Context context1=new Context(operation1);
        context1.calculate(4,5);

        Context context2=new Context(operation2);
        context2.calculate(56,78);
    }
}
