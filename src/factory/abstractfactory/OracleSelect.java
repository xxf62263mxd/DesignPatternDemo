package factory.abstractfactory;

public class OracleSelect implements ISelect{
    @Override
    public void select() {
        System.out.println("Oracle Select");
    }
}
