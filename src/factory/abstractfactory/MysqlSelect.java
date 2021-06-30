package factory.abstractfactory;

public class MysqlSelect implements ISelect{
    @Override
    public void select() {
        System.out.println("Mysql select");
    }
}
