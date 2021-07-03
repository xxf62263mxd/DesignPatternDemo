package bridge;


/**
 *
 * 桥接模式
 *
 * 可以用于抽象与实现分离（比如 手机运行软件 和 具体的软件 分离），并用组合的模式进行组合，可以大大减少类的数量。
 * 继承只用在“is-a”的关系上
 *
 * 在抽象分类是多维度时，也可以使用桥接模式，把他们组合在一起
 * 比如：手机可以抽象为 手机硬件 和 手机软件，手机硬件可能有很多牌子，手机软件可以有很多款
 *
 */
public class Main {
    public static void main(String[] args) {
        PhoneHardware phoneA = new PhoneHardwareA();

        phoneA.setSoftware(new PhoneSoftwareB());
        phoneA.runSoftware();

        PhoneHardware phoneB = new PhoneHardwareB();

        phoneB.setSoftware(new PhoneSoftwareA());
        phoneB.runSoftware();


    }
}
