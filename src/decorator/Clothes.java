package decorator;

public class Clothes extends Finery{

    public Clothes(Person person){
        super(person);
    }

    @Override
    public void show() {
        System.out.print("穿了衣服的 ");
        super.show();
    }
}
