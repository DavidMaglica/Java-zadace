/**
 * @author David Maglica
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-----KALKULATOR-----\n");

        Scanner sc = new Scanner(System.in);
        int decider = 0;
        boolean test = true;

        do {
            while (decider == 0) {
                System.out.println("\nKoju operaciju želite izvesti?");
                System.out.println("\t1. Zbrajanje");
                System.out.println("\t2. Oduzimanje");
                System.out.println("\t3. Množenje");
                System.out.println("\t4. Dijeljenje");
                System.out.println("\t9. Izlaz");
                decider = sc.nextInt();
            }

            // Addition
            if (decider == 1) {
                System.out.println("-- Zbrajanje --");
                int len;

                System.out.println("Koliko brojeva želite zbrojiti?" +
                        "(Brojevi će se zbrojiti redosljedom kojim ih upisujete.)");
                len = sc.nextInt();

                Double[] numbers = new Double[len];
                for (int counter = 0; counter < numbers.length; counter++) {
                    System.out.println("\t" + (counter+1) + ". broj: ");
                    numbers[counter] = sc.nextDouble();
                }

                Add add = new Add(len, numbers);
                add.addition();

                // decider vraćamo
                // na 0 kako bi nam se ponovo pojavio meni
                decider = 0;
            }

            // Subtraction
            if (decider == 2) {
                System.out.println("-- Oduzimanje --");
                int len;

                System.out.println("S Koliko brojeva želite napraviti oduzimanje?" +
                        "(Brojevi će se oduzeti redosljedom kojim ih upisujete.)");
                len = sc.nextInt();

                Double[] numbers = new Double[len];
                for (int counter = 0; counter < numbers.length; counter++) {
                    System.out.println("\t" + (counter+1) + ". broj: ");
                    numbers[counter] = sc.nextDouble();
                }

                Subtract subtract = new Subtract(len, numbers);
                subtract.subtraction();

                // decider vraćamo na 0 kako bi nam se ponovo pojavio meni
                decider = 0;
            }

            // Multiplication
            if (decider == 3) {
                System.out.println("-- Množenje --");
                int len;

                System.out.println("Koliko brojeva želite pomnožiti?" +
                        "(Brojevi će se množiti redosljedom kojim ih upisujete.)");
                len = sc.nextInt();

                Double[] numbers = new Double[len];
                for (int counter = 0; counter < numbers.length; counter++) {
                    System.out.println("\t" + (counter+1) + ". broj: ");
                    numbers[counter] = sc.nextDouble();
                }

                Multiply multiply = new Multiply(len, numbers);
                multiply.multiplication();

                // decider vraćamo na 0 kako bi nam se ponovo pojavio meni
                decider = 0;
            }

            // Dividing
            if (decider == 4) {
                System.out.println("-- Dijeljenje --");
                int len;

                System.out.println("Koliko brojeva želite podijeliti?" +
                        "(Brojevi će se dijeliti redosljedom kojim ih upisujete.)");
                len = sc.nextInt();

                Double[] numbers = new Double[len];
                for (int counter = 0; counter < numbers.length; counter++) {
                    System.out.println("\t" + (counter+1) + ". broj: ");
                    numbers[counter] = sc.nextDouble();
                }

                Divide divide = new Divide(len, numbers);
                divide.division();

                // decider vraćamo na 0 kako bi nam se ponovo pojavio meni
                decider = 0;
            }

            // Exit
            if (decider == 9) {
                System.out.println("Doviđenja!");
                // test = false nas izbacuje iz do...while petlje
                test = false;
                break;
            }
        } while (test);
    }
}