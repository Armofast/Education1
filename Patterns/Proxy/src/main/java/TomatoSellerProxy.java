/**
 * Created by dirty on 29.01.16.
 */
public class TomatoSellerProxy implements Seller {
    TomatoSeller tomatoSeller=new TomatoSeller();
    @Override
    public String sellTomatos() {
        return tomatoSeller.sellTomatos()+" и еще подарочек";
    }
}
