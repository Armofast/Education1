package observer;

import observable.Subject;

/**
 * Created by dirty on 31.01.16.
 */
public abstract class Observer {
    Subject subject;
    public Observer(Subject subject){
        this.subject=subject;
        this.subject.attach(this);

    }
    public abstract void update();
}
