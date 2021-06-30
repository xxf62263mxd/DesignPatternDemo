package state;

public class MorningState implements State{

    @Override
    public void handle(Work work) {
        if(work.getHour()<5){
            System.out.println("早上状态不错");
        }else{
            work.setState(new AfternoonState());
            work.handle();
        }
    }
}
