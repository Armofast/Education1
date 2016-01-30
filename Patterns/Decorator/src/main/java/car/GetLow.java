package car;

/**
 * Created by dirty on 29.01.16.
 */
public class GetLow extends Decorator {
    public GetLow(CentralInterface centralInterface) {
        super(centralInterface);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1278;
    }
    public String getNameParameter(){
        return "Посадочка";

    }
}
