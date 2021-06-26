package factory.simplefactory;

import java.util.Scanner;

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
