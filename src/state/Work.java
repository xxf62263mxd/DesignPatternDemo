package state;

public class Work {

    private boolean finishWork = false;
    private int hour = 0;

    private State state;

    public Work(){
        this.state = new MorningState();
    }

    public void handle(){
        state.handle(this);
    }

    public boolean isFinishWork() {
        return finishWork;
    }

    public void setFinishWork(boolean finishWork) {
        this.finishWork = finishWork;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
