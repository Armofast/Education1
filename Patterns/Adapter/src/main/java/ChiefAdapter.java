/**
 * Created by dirty on 29.01.16.
 */
public class ChiefAdapter implements Chief {
    Intern intern = new Intern();

    @Override
    public void makeBreakfast() {
        intern.makeBreakfast();
    }

    @Override
    public void makeDinner() {
        intern.makeDinner();
    }

    @Override
    public void makeSupper() {
        intern.makeSupper();
    }
}
