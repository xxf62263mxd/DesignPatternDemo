package templatemethod;

public class StudentTestPaperB extends TestPaper{
    @Override
    protected String TestAnswer1() {
        return "Tom";
    }

    @Override
    protected String TestAnswer2() {
        return "20";
    }

    @Override
    protected String TestAnswer3() {
        return "America";
    }
}
