package builder;

/**
 *
 * 建造者模式
 *
 * 满足一下条件可以用建造者模式
 * 1.构造一个对象需要 多个组件 且 每个组件 都可能有 不同的 创建方式
 * 2.使用各个组件构造该对象的步骤时固定的
 *
 *
 * 工厂模式 注重的是 对象的创建 与 客户端代码 分离
 * 建造者模式 注重的是 构建对象的步骤 与 构建对象的组件的创建 分离 并且 由指挥者 把客户端代码 与 对象的创建 分离
 *
 */
public class Main {
    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();
        PersonBuilder thinPersonBuilder = new ThinPersonBuilder();
        PersonBuilder fatPersonBuilder = new FatPersonBuilder();

        personDirector.buildPerson(thinPersonBuilder);
        Person thinPerson = thinPersonBuilder.getPerson();

        personDirector.buildPerson(fatPersonBuilder);
        Person fatPerson = fatPersonBuilder.getPerson();

        System.out.println(thinPerson);
        System.out.println(fatPerson);
    }
}
