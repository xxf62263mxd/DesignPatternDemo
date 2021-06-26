package decorator;

public class Main {
    public static void main(String[] args) {
        Person person = new Pants(new Clothes(new Person("大猪")));
        person.show();
    }
}
