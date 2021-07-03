package memento;

public class Record {
    private int hp;
    private int mp;
    private int exp;

    public Record(int hp, int mp, int exp) {
        this.hp = hp;
        this.mp = mp;
        this.exp = exp;
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
}
