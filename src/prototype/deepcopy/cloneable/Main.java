package prototype.deepcopy.cloneable;



public class Main {
    public static void main(String[] args) throws Exception {
        Teather t = new Teather("赵老师",38);
        Student s = new Student("张三",18,t);

        System.out.println(s == s.clone());
        System.out.println(t == ((Student) s.clone()).getTeather().clone());
        System.out.println(s.clone());
    }
}
