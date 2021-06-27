package prototype.deepcopy.serializable;


import java.io.*;

/**
 * 原型模式：serializable接口实现深拷贝
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);

        Teather t = new Teather("赵老师",38);
        Student s = new Student("张三",18,t);
        oos.writeObject(s);

        ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bai);
        Student student = (Student) ois.readObject();

        System.out.println(student == s);
        System.out.println(t == student.getTeather());
        System.out.println(student);


    }
}
