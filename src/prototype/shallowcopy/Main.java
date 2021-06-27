package prototype.shallowcopy;
/**
 * 原型模式：cloneable接口实现浅拷贝
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teather t = new Teather("赵老师",38);
        Student s = new Student("张三",18,t);
        System.out.println(s == s.clone());
        System.out.println(s.clone());
    }
}
