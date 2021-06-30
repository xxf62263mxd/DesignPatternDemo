package state;

public class EveningState implements State{
    @Override
    public void handle(Work work) {
        if(work.isFinishWork()){
            work.setState(new RestState());
        }else{
            work.setState(new OvertimeWorkState());
        }
        work.handle();
    }
}
