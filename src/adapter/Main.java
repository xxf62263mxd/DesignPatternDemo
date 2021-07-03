package adapter;


/**
 *
 * 适配器模式
 *
 * 可以用于转换接口
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        Player forwards = new Forwards();
        Player guards = new Guards();
        Player center = new Translator(new ForeignCenter());

        forwards.attack();
        center.attack();
        guards.attack();

    }
}
