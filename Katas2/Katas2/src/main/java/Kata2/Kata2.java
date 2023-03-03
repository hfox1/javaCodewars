package Kata2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.*;
import com.google.common.base.CharMatcher;

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
        return (int) IntStream.rangeClosed(0, n)
                .map(i -> i*i)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""))
                .chars()
                .filter(ch -> ch == d + '0')
                .count();
    }

    public static boolean stringEnds(String str, String ending) {
//      nice way with regex
//        String newEnding = ending.replaceAll("[\\[\\]\\(\\)\\{\\}\\+\\*\\^\\$\\\\\\|\\.\\?]", "\\\\$0");
//        String regex = newEnding+"$";
//    return str.equals(str.replaceAll(regex, "")+ending);
//
        // comparing char values as Integers
           List<Integer> strChars = new StringBuilder(str).reverse().chars().mapToObj(Integer::valueOf).collect(Collectors.toList());
           List<Integer> endingChars = new StringBuilder(ending).reverse().chars().mapToObj(Integer::valueOf).collect(Collectors.toList());
           int endingLength = ending.length() > str.length() ? str.length() : endingChars.size();
        return  strChars.subList(0, endingLength).equals(endingChars);

    }


}
