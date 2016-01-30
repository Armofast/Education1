/**
 * Created by dirty on 29.01.16.
 */
public class Main {
    public static void main(String[] args) {
        Seller seller=new TomatoSellerProxy();
        System.out.println(seller.sellTomatos());
    }
}
