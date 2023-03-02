package Kata2;
import java.util.ArrayList;
import java.util.List;
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
        double bmi = weight / (height * height);
        if (bmi <= 18.5) {
            return "Underweight";
        }
        if (bmi <= 25.0) {
            return "Normal";
        }
        if (bmi <= 30.0) {
            return "Overweight";
        }
        if (bmi > 30) {
            return "Obese";
        };
        return null;
    }
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }

    public static int findShort(String s) {
//    String[] arr = s.split(" ");
//    int shortest = arr[0].length();
//    for (String word : arr) {
//        if (word.length() < shortest) {
//            shortest = word.length();
//        };
//    } return shortest;
    return Stream.of(s.split(" "))
            .mapToInt(String::length)
            .min()
            .getAsInt();
    }
}
