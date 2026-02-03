package com.Day2.logicalquestions2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamStringProblems {

    public static void main(String[] args) {

        // 1. Character Frequency Count
        String s1 = "banana";
        Map<Character, Long> charFreq =
                s1.chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(
                          Function.identity(),
                          Collectors.counting()
                  ));
        System.out.println("1. Character Frequency: " + charFreq);

        // 2. Word Frequency Count
        String s2 = "java is java and java is fast";
        Map<String, Long> wordFreq =
                Arrays.stream(s2.split(" "))
                      .collect(Collectors.groupingBy(
                              Function.identity(),
                              Collectors.counting()
                      ));
        System.out.println("2. Word Frequency: " + wordFreq);

        // 3. First Non-Repeating Character
        String s3 = "stress";
        char firstNonRepeat =
                s3.chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(
                          Function.identity(),
                          LinkedHashMap::new,
                          Collectors.counting()
                  ))
                  .entrySet().stream()
                  .filter(e -> e.getValue() == 1)
                  .map(Map.Entry::getKey)
                  .findFirst()
                  .get();
        System.out.println("3. First Non-Repeating Character: " + firstNonRepeat);

        // 4. All Non-Repeating Characters
        String s4 = "programming";
        System.out.print("4. All Non-Repeating Characters: ");
        s4.chars()
          .mapToObj(c -> (char) c)
          .collect(Collectors.groupingBy(
                  Function.identity(),
                  Collectors.counting()
          ))
          .entrySet().stream()
          .filter(e -> e.getValue() == 1)
          .map(Map.Entry::getKey)
          .forEach(c -> System.out.print(c + " "));
        System.out.println();

        // 5. Remove Duplicate Characters
        String s5 = "banana";
        String noDuplicates =
                s5.chars()
                  .distinct()
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());
        System.out.println("5. Remove Duplicate Characters: " + noDuplicates);

        // 6. Remove Repeating Characters (Keep Only Unique Once)
        String s6 = "aabbccdde";
        String onlyUnique =
                s6.chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(
                          Function.identity(),
                          Collectors.counting()
                  ))
                  .entrySet().stream()
                  .filter(e -> e.getValue() == 1)
                  .map(e -> String.valueOf(e.getKey()))
                  .collect(Collectors.joining());
        System.out.println("6. Only Unique Characters: " + onlyUnique);

        // 7. Remove Non-Alphanumeric Characters
        String s7 = "ja@va#8!!";
        String alphaNumeric =
                s7.chars()
                  .filter(Character::isLetterOrDigit)
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());
        System.out.println("7. Alphanumeric Only: " + alphaNumeric);

        // 8. Keep Only Alphabets
        String s8 = "java8stream2025";
        String onlyAlphabets =
                s8.chars()
                  .filter(Character::isLetter)
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());
        System.out.println("8. Alphabets Only: " + onlyAlphabets);

        // 9. Keep Only Digits
        String s9 = "orderId=AB123XZ9";
        String onlyDigits =
                s9.chars()
                  .filter(Character::isDigit)
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());
        System.out.println("9. Digits Only: " + onlyDigits);

        // 10. Count Each Character Except Spaces
        String s10 = "java stream";
        Map<Character, Long> charCountNoSpace =
                s10.chars()
                   .filter(c -> c != ' ')
                   .mapToObj(c -> (char) c)
                   .collect(Collectors.groupingBy(
                           Function.identity(),
                           Collectors.counting()
                   ));
        System.out.println("10. Character Count (No Spaces): " + charCountNoSpace);
    }
}
