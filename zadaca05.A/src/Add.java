// TODO apstraktna klasa extends operate
public class Add extends Operate {
    int len;
    Double[] numbers = new Double[len];

    public Add(int len, Double[] numbers) {
        this.len = len;
        this.numbers = numbers;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public Double[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Double[] numbers) { this.numbers = numbers; }

    public void addition () {
        // ovdje suma može biti 0 jer zbrajamo i neće nastati problemi
        Double sum = 0.0;
        for (Double number : numbers) sum += number;

        System.out.println("Rezultat Vašeg zbroja je " + sum);
    }
}
