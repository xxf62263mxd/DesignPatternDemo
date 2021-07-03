package memento;

public class Player {
    private int hp;
    private int mp;
    private int exp;

    public void readyFight(){
        hp = 100;
        mp = 100;
        exp = 100;
    }

    public void fight(){
        hp = 50;
        mp = 20;
        exp = 150;
    }


    public Record saveRecord(){
        return new Record(hp,mp,exp);
    }

    public void loadRecord(Record record){
        this.hp = record.getHp();
        this.mp = record.getMp();
        this.exp = record.getExp();
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Player{" +
                "hp=" + hp +
                ", mp=" + mp +
                ", exp=" + exp +
                '}';
    }

    public void showState(){
        System.out.println(toString());
    }
}
