package dk.stldev;

public class Factorializer {

    public long factorialize(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Factorials can only be calculated for number > 1");
        }

        var result = 1L;
        while (number > 1) {
            result *= number;
            number -= 1;
        }

        return result;
    }

}
