// TODO apstraktna klasa extends operate
public class Divide {
    int len;
    Double[] numbers = new Double[len];

    public Divide(int len, Double[] numbers) {
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

    public void division() {
        // Ova metoda mora biti drukcija od zbrajanja
        // ako sum = 0; onda program dijeli 0 sa prvim elementom iz numbers
        // npr. sum = 0, numbers[0] = 10; (sum /= numbers[0]) == 0
        // zato suma = numbers[0] kako bi mogli dijeliti drugi element sa prvim itd.
        Double sum = numbers[0];
        for (int number = 1; number < len; number++) {
            sum /= numbers[number];
        }

        System.out.println("Rezultat Vašeg dijeljenja je " + sum);
    }
}
