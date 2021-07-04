package chainofresponsibility;

public class CommonManager extends Manager{

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(int requestType) {
        if(requestType<5){
            System.out.println("经理批准了");
        }else{
            System.out.println("经理没权限批准");
            getSuperior().requestApplications(requestType);
        }
    }
}
