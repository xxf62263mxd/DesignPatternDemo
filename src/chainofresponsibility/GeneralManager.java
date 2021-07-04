package chainofresponsibility;

public class GeneralManager extends Manager{
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(int requestType) {
        if(requestType<15){
            System.out.println("总经理批准了");
        }else{
            System.out.println("没得谈");
        }
    }
}
