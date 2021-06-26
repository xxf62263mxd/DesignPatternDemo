package prototype.deepcopy.serializable;

import java.io.Serializable;

public class Teather implements Serializable {
    private String name;
    private int age;

    public Teather(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teather{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
