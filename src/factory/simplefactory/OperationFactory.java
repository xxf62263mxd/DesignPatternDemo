package factory.simplefactory;

/**
 * 简单工厂模式 负责根据条件创建对象
 */
public class OperationFactory {

    public static Operation createOperation(String oper){
        switch (oper){
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
        }
        return null;
    }

}
