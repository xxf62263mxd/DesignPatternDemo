package observer;

public class ZhangSan implements Observer{

    private Subject subject;

    public ZhangSan(Subject subject){
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("张三收到通知："+subject.getState());
    }
}
