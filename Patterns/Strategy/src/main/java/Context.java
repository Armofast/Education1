import strategy.StrategyCalculating;

/**
 * Created by dirty on 01.02.16.
 */
public class Context {
    StrategyCalculating strategy;

    public Context(StrategyCalculating strategy) {
        this.strategy = strategy;
    }
    public void calculate(int a,int b){
        System.out.println(strategy.calculate(a,b));
    }
}
