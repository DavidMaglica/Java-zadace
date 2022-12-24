import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Down-casting
        Calculator <Double> operation = new Operate();

        // Down-casting
        Operate operator = (Operate) operation;
        Scanner sc = new Scanner(System.in);
        boolean calculator = true;

        while (calculator) {
            System.out.println("Unesite prvi broj: ");
            operation.setFirst(sc.nextDouble());

            System.out.println("Unesite drugi broj: ");
            operation.setSecond(sc.nextDouble());

            System.out.println("Unesite zeljeni operator: ");
            operator.calculate(sc.next().charAt(0));

            System.out.println("\nZelite li jos koju operaciju izvest? (da/ne)");
            String decider = sc.next();
            if (decider.equalsIgnoreCase("da")) calculator   = true;
            else calculator = false;
        }
    }
}