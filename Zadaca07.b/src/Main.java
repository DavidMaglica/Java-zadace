public class Main {
    public static void main (String[] args) {
        Calculator <Double> operation = new Operate <Double> () {
            @Override
            public double add(double first, double second) {
                return first + second;
            }
            public double subtract(double first, double second) {
                return first - second;
            }
            public double multiply(double first, double second) {
                return first * second;
            }
            public double divide(double first, double second) {
                return first / second;
            }
        };
        // Ispis anonimne klase
        System.out.println(((Operate<Double>)operation).add(12.0,2.0));
        System.out.println(((Operate<Double>)operation).subtract(12.0,2.0));
        System.out.println(((Operate<Double>)operation).multiply(12.0,2.0));
        System.out.println(((Operate<Double>)operation).divide(12.0,2.0));

//        Down-casting
//        Operate operator = (Operate) operation;
//        Scanner sc = new Scanner(System.in);
//        boolean calculator = true;
//
//        while (calculator) {
//            System.out.println("Unesite prvi broj: ");
//            operation.setFirst(sc.nextDouble());
//
//            System.out.println("Unesite drugi broj: ");
//            operation.setSecond(sc.nextDouble());
//
//            System.out.println("Unesite zeljeni operator: ");
//            operator.calculate(sc.next().charAt(0));
//
//            System.out.println("\nZelite li jos koju operaciju izvest? (da/ne)");
//            String decider = sc.next();
//            if (decider.equalsIgnoreCase("da")) calculator = true;
//            else calculator = false;
//        }
    }
}