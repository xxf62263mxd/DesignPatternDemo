package templatemethod;

/**
 *
 * 模板方法模式：
 *
 * 当不变和可变行为混合出现在子类中，可以把不变的行为抽取到父类。
 *
 *
 */
public class Main {
    public static void main(String[] args) {

        TestPaper t1 = new StudentTestPaperA();
        t1.TestQuestion1();t1.TestQuestion2();t1.TestQuestion3();

        TestPaper t2 = new StudentTestPaperB();
        t2.TestQuestion1();t2.TestQuestion2();t2.TestQuestion3();


    }
}
