package factory.factorymethod;

import java.util.Scanner;


/**
 *
 * 工厂方法模式
 *
 * 保留了简单工厂可以封装 对象创建过程 的优点，又实现了开闭原则，即不修改原有工厂，而是扩展新的工厂。
 * 但是分支判断被留到了客户端。可以用反射处理。
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        String oper = sc.next();
        double num2 = sc.nextDouble();

        OperationFactory operationFactory = null;
        Operation operation = null;
        if(oper.equals("add")){
            operationFactory = new AddOperationFactory();
        }else if (oper.equals("sub")){
            operationFactory = new SubOperationFactory();
        }
        operation = operationFactory.createOperation();
        System.out.println(operation.getResult(num1,num2));

    }
}
