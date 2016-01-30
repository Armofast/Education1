package car;

/**
 * Created by dirty on 29.01.16.
 */
public abstract class Decorator implements CentralInterface {
    CentralInterface centralInterface;
    public Decorator(CentralInterface centralInterface){
        this.centralInterface=centralInterface;
    }
    @Override
    public int getPrice() {
        return centralInterface.getPrice();
    }
    public abstract String getNameParameter() ;
}
