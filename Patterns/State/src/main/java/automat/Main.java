package automat;

/**
 * Created by dirty on 01.02.16.
 */
public class Main {
    private static final double CHEEPS_COST=10.50;
    public static void main(String[] args) {
Context context=new Context();
      AutomatState state= buy(10.5,context);
        System.out.println(state);
    }
    public static AutomatState buy(double money,Context context){
        if (CHEEPS_COST-money==0) {
            CashLessState cashLessState = new CashLessState();
            cashLessState.doAction(context);

        } else{
            CashState cashState=new CashState();
            cashState.doAction(context);
        }
        return context.getState();
    }
}
