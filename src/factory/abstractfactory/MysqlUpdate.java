package factory.abstractfactory;

public class MysqlUpdate implements IUpdate{
    @Override
    public void update() {
        System.out.println("Mysql Update");
    }
}
