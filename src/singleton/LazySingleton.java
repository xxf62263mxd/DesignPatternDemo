package singleton;

public class LazySingleton {

    private volatile LazySingleton instance;

    public LazySingleton getInstance(){

        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;

    }



}
