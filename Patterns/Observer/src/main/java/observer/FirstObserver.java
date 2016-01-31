package observer;

import observable.Subject;

/**
 * Created by dirty on 31.01.16.
 */
public class FirstObserver extends Observer {
    public FirstObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("I'm first Observer");
    }
}
