package strategy;

/**
 * Created by dirty on 01.02.16.
 */
public class OperationAdd implements StrategyCalculating {
    @Override
    public double calculate(int a, int b) {
        return a+b;
    }
}
