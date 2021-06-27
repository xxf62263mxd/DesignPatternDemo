package templatemethod;

public class StudentTestPaperA extends TestPaper{

    @Override
    protected String TestAnswer1() {
        return "张三";
    }

    @Override
    protected String TestAnswer2() {
        return "18";
    }

    @Override
    protected String TestAnswer3() {
        return "中国";
    }
}
