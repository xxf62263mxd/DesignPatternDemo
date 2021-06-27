package templatemethod;

public abstract class TestPaper {

    public void TestQuestion1(){
        System.out.println("Question:What is your name?");
        System.out.println("Answer:"+TestAnswer1());
    }

    protected abstract String TestAnswer1();

    public void TestQuestion2(){
        System.out.println("Question:How old are you?");
        System.out.println("Answer:"+TestAnswer2());
    }

    protected abstract String TestAnswer2();

    public void TestQuestion3(){
        System.out.println("Question:Where are you from?");
        System.out.println("Answer:"+TestAnswer3());
    }

    protected abstract String TestAnswer3();

}
