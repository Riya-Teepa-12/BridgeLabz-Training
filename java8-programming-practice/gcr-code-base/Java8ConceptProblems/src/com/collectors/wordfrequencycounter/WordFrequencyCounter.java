package com.collectors.wordfrequencycounter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
	public static void main(String[] args) {

        String paragraph = "java is powerful and java is popular";

        Map<String, Integer> wordCount =
                Arrays.stream(paragraph.split(" "))
                        .collect(Collectors.toMap(
                                word -> word,          // key = word
                                word -> 1,             // value = initial count
                                Integer::sum           // merge function
                        ));

        System.out.println(wordCount);
    }
}
