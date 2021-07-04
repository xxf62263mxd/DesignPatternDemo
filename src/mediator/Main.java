package mediator;


/**
 *
 * 中介者模式
 *
 * 当有一组对象他们之间互相通信，使得他们耦合度很高，这时可以使用中介者模式
 * 所有对象只与中介沟通，由中介来接受以及转发消息
 * 中介可以站在一个全局的角度去处理消息
 * 但是这样中介的耦合度会很高
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        USA usa = new USA();
        Ireq ireq = new Ireq();

        UnitedNationsSecurityCouncil securityCouncil = new UnitedNationsSecurityCouncil();
        securityCouncil.setUsa(usa);
        securityCouncil.setIreq(ireq);
        usa.setUnitedNations(securityCouncil);
        ireq.setUnitedNations(securityCouncil);

        usa.send("你们有核武器，在这样我们要制裁你们了！");
        ireq.send("我们没有核武器，我们也不怕你们的侵略");


    }
}
