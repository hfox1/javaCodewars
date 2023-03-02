package Kata2;
import java.util.stream.*;

public class Kata2 {

    public static int squareDigits(int n) {
        System.out.println("hello");

        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .map(i -> i*i)
                .mapToObj(i -> ""+i)
            .collect(Collectors.joining("")));
    }

    public static String bmi(double weight, double height) {
        return "";
    }
}
