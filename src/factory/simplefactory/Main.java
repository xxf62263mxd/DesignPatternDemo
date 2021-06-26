package factory.simplefactory;

import java.util.Scanner;


/**
 *
 * 简单工厂模式
 *
 * 可以封装 对象创建过程。客户端只需直接从工厂中获取对象，无需知道对象如何创建。
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        String oper = sc.next();
        double num2 = sc.nextDouble();
        Operation operation = OperationFactory.createOperation(oper);
        operation.setNum1(num1);operation.setNum2(num2);
        System.out.println(operation.getResult());

    }
}
