package observer;

import observable.Subject;

/**
 * Created by dirty on 31.01.16.
 */
public class SecondObserver extends Observer {
    @Override
    public void update() {
        System.out.println("I'm second observer");
    }

    public SecondObserver(Subject subject) {
        super(subject);
    }
}
