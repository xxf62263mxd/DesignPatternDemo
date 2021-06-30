package state;

public class AfternoonState implements State{
    @Override
    public void handle(Work work) {
        if(work.getHour()<10){
            System.out.println("下午效率比较低了");
        }else{
            work.setState(new EveningState());
            work.handle();
        }
    }
}
