package Kata2;
import java.util.stream.*;

public class Kata2 {

    public int squareDigits(int n) {
        String result = String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .map(i -> i*i)
                .mapToObj(i -> ""+i)
            .collect(Collectors.joining(""));
        return Integer.parseInt(result);
    }
}
