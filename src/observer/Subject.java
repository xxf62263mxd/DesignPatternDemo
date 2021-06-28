package observer;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
    Object getState();
    void setState(Object state);

}
