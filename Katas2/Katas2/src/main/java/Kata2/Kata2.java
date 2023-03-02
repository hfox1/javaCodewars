package Kata2;

import java.util.ArrayList;
import java.util.stream.*;

public class Kata2 {
    public void main () {}

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
        }
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

    public static int nbDig(int n, int d) {
        ArrayList<Integer> squares = new ArrayList();
        for (int i = 0; i <= n; i++) {
            squares.add(i*i);
        };
       String halfway = squares.stream()
               .map(Object::toString)
               .collect(Collectors.joining(""));
       System.out.println("string: " +halfway);
       int end = (int) halfway
               .chars()
               .peek(e -> System.out.println("STREAM(" + e + "), (char)ch = " + (char)e + ", (char) d: " + d ))
               .filter(ch -> ch == d+48)
               .peek(e -> System.out.println("filtered " + e) )
               .count();
       System.out.println("end " + end);
       return end;
    }
}
