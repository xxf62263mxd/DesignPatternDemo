package strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strategy = sc.nextLine();
        CashContext cc = new CashContext(strategy);

        Double cash = Double.parseDouble(sc.nextLine());

        Double result = cc.getResult(cash);
        System.out.println(result);
    }
}
