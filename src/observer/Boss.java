package observer;

import java.util.ArrayList;

public class Boss implements Subject{
    private ArrayList<Observer> obs = new ArrayList<>();
    private String state;

    @Override
    public void attach(Observer observer) {
        obs.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        obs.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer ob : obs){
            ob.update();
        }
    }

    @Override
    public Object getState() {
        return state;
    }

    @Override
    public void setState(Object state) {
        this.state = (String)state;
    }
}
