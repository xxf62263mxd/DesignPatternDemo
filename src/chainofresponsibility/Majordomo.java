package chainofresponsibility;

public class Majordomo extends Manager{
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(int requestType) {
        if(requestType<10){
            System.out.println("总监批准了");
        }else{
            System.out.println("总监没权限批准");
            getSuperior().requestApplications(requestType);
        }
    }
}
