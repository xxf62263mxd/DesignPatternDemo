package chainofresponsibility;

/**
 *
 *
 * 责任链模式
 *
 * 客户端无需知道到底是哪个类完成了请求，增强了对象指派的灵活性
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        Manager common = new CommonManager("经理");
        Manager majordomo = new Majordomo("主管");
        Manager generalManager = new GeneralManager("总经理");

        common.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        common.requestApplications(20);

    }
}
