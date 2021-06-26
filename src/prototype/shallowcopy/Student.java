package prototype.shallowcopy;

public class Student implements Cloneable{
    private String name;
    private int age;
    private Teather teather;

    public Student(String name, int age, Teather teather) {
        this.name = name;
        this.age = age;
        this.teather = teather;
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

    public Teather getTeather() {
        return teather;
    }

    public void setTeather(Teather teather) {
        this.teather = teather;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teather=" + teather +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
