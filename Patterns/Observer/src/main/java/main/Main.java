package main;

import observable.Subject;
import observer.FirstObserver;
import observer.SecondObserver;

/**
 * Created by dirty on 31.01.16.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject=new Subject();
        FirstObserver firstObserver=new FirstObserver(subject);
        SecondObserver secondObserver=new SecondObserver(subject);
        subject.notifyAllObservers();
    }
}
