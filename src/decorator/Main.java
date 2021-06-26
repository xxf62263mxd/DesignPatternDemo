package decorator;

/**
 * 装饰器模式
 *
 * 用于给 原有类，添加装饰功能。要什么装饰，就new什么装饰，在把原有类塞进去。
 * 装饰过后的类，也可以作为原有类，塞进别的装饰类中。所以装饰类与原有类从根本上继承同一个接口。
 *
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Pants(new Clothes(new Person("大猪")));
        person.show();
    }
}
