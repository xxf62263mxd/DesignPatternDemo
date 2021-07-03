package singleton;

public class HungrySingleton {

    private HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public HungrySingleton getInstance(){
        return instance;
    }

}
