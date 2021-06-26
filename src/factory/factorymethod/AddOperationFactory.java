package factory.factorymethod;

public class AddOperationFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
