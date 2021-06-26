package decorator;

public class Pants extends Finery{

    public Pants(Person person){
        super(person);
    }

    @Override
    public void show() {
        System.out.print("穿了裤子的 ");
        super.show();
    }
}
