package observable;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dirty on 31.01.16.
 */
public class Subject {
    List<Observer> observers=new ArrayList<>();
    public Subject(){

    }
    public void notifyAllObservers(){
        for (Observer observer:observers){
            observer.update();
        }
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
}
