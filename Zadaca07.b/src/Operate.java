public abstract class Operate <T extends Number> extends Calculator <T> {
    public double add (T first, T second) {
        // Unboxing
        return first.doubleValue() + second.doubleValue();
    }
    public abstract double add(double first, double second);

    public double subtract (T first, T second) {
        // Unboxing
        return first.doubleValue() - second.doubleValue();
    }
    public abstract double subtract(double first, double second);

    public double multiply (T first, T second) {
        // Unboxing
        return first.doubleValue() * second.doubleValue();
    }
    public abstract double multiply(double first, double second);

    public double divide (T first, T second) {
        // Unboxing
        return first.doubleValue() / second.doubleValue();
    }
    public abstract double divide(double first, double second);


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