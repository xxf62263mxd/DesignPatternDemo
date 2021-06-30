package state;

public class RestState implements State{
    @Override
    public void handle(Work work) {
        System.out.println("晚上下班了，回家休息");
    }
}
