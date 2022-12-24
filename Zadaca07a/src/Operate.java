public class Operate <T extends Number> extends Calculator <T> {
    public double add (T first, T second) {
        // Unboxing
        return first.doubleValue() + second.doubleValue();
    }

    public double subtract (T first, T second) {
        // Unboxing
        return first.doubleValue() - second.doubleValue();
    }

    public double multiply (T first, T second) {
        // Unboxing
        return first.doubleValue() * second.doubleValue();
    }

    public double divide (T first, T second) {
        // Unboxing
        return first.doubleValue() / second.doubleValue();
    }

    public void calculate (char operation) {
        System.out.println("\n" + first + " " + operation + " " + second + ": ");

        switch (operation) {
            case ('+'):
                System.out.println(add(first, second));
                break;
            case ('-'):
                System.out.println(subtract(first, second));
                break;
            case ('*'):
                System.out.println(multiply(first, second));
                break;
            case ('/'):
                System.out.println(divide(first, second));
                break;
            default:
                System.out.println("Krivo unesen operator.");
        }
    }

}