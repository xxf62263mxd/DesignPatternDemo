package state;

public class OvertimeWorkState implements State{
    @Override
    public void handle(Work work) {
        System.out.println("加班工作了，效率没了");
    }
}
