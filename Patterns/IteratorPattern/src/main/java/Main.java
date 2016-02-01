import container.Container;
import iterator.Iterator;

/**
 * Created by dirty on 01.02.16.
 */
public class Main {
    public static void main(String[] args) {
        String[] names={"Sanya","Anya","Vanya","Petya"};
        Container container=new Container(names);
        Iterator iterator=container.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
