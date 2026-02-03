package com.Day2.logicalquestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamLogicalExample {
      
	 public static void main(String[] args) {

	        // 1. Count vowels in a string
	        String s1 = "programming";
	        long vowels = s1.chars()
	                .mapToObj(c -> (char) c)
	                .filter(c -> "aeiou".indexOf(c) != -1)
	                .count();
	        System.out.println("1. Vowels count: " + vowels);

	        // 2. Count number of words
	        String sentence = "Java is very powerful";
	        long words = Arrays.stream(sentence.split(" ")).count();
	        System.out.println("2. Word count: " + words);

	        // Common Integer List
	        List<Integer> numbers = Arrays.asList(2,5,7,8,10,13);

	        // 3. Find even numbers
	        System.out.println("3. Even numbers: " +
	                numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));

	        // 4. Convert list of strings to uppercase
	        List<String> tech = Arrays.asList("java","spring","boot");
	        System.out.println("4. Uppercase: " +
	                tech.stream().map(String::toUpperCase).collect(Collectors.toList()));

	        // 5. Find string length list
	        List<String> animals = Arrays.asList("cat","elephant","dog");
	        System.out.println("5. String lengths: " +
	                animals.stream().map(String::length).collect(Collectors.toList()));

	        // 6. Count strings starting with 'a'
	        List<String> fruits = Arrays.asList("apple","banana","ant","car");
	        System.out.println("6. Starts with a: " +
	                fruits.stream().filter(f -> f.startsWith("a")).count());

	        // 7. Remove empty strings
	        List<String> langs = Arrays.asList("java","","spring","","boot");
	        System.out.println("7. Without empty: " +
	                langs.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()));

	        // 8. Sum of all numbers
	        List<Integer> nums = Arrays.asList(1,2,3,4,5);
	        System.out.println("8. Sum: " + nums.stream().mapToInt(Integer::intValue).sum());

	        // 9. Find max number
	        List<Integer> maxList = Arrays.asList(10,25,3,99,45);
	        System.out.println("9. Max: " + maxList.stream().max(Integer::compareTo).get());

	        // 10. Reverse each string
	        List<String> apiList = Arrays.asList("java","api");
	        System.out.println("10. Reversed strings: " +
	                apiList.stream()
	                        .map(str -> new StringBuilder(str).reverse().toString())
	                        .collect(Collectors.toList()));

	        // 11. Remove duplicates
	        List<Integer> dupList = Arrays.asList(1,2,2,3,4,4,5);
	        System.out.println("11. Distinct: " +
	                dupList.stream().distinct().collect(Collectors.toList()));

	        // 12. Sort descending
	        List<Integer> sortList = Arrays.asList(5,1,9,3);
	        System.out.println("12. Desc order: " +
	                sortList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

	        // 13. Second highest number
	        List<Integer> secHigh = Arrays.asList(10,40,30,20);
	        System.out.println("13. Second highest: " +
	                secHigh.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

	        // 14. Join strings with comma
	        System.out.println("14. Joined: " +
	                tech.stream().collect(Collectors.joining(",")));

	        // 15. Frequency of each character
	        String banana = "banana";
	        System.out.println("15. Char frequency: " +
	                banana.chars()
	                        .mapToObj(c -> (char) c)
	                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

	        // 16. Numbers greater than 50
	        List<Integer> gt50 = Arrays.asList(10,55,60,23,90);
	        System.out.println("16. >50: " +
	                gt50.stream().filter(n -> n > 50).collect(Collectors.toList()));

	        // 17. Group strings by length
	        List<String> groupList = Arrays.asList("a","bb","ccc","dd");
	        System.out.println("17. Group by length: " +
	                groupList.stream().collect(Collectors.groupingBy(String::length)));

	        // 18. First non-repeated character
	        String stress = "stress";
	        char firstUnique = stress.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(
	                        Function.identity(), LinkedHashMap::new, Collectors.counting()))
	                .entrySet().stream()
	                .filter(e -> e.getValue() == 1)
	                .map(Map.Entry::getKey)
	                .findFirst().get();
	        System.out.println("18. First non-repeated: " + firstUnique);

	        // 19. List<Integer> to List<String>
	        System.out.println("19. Integer to String: " +
	                nums.stream().map(String::valueOf).collect(Collectors.toList()));

	        // 20. Word count
	        String text = "java is java and java is fast";
	        System.out.println("20. Word frequency: " +
	                Arrays.stream(text.split(" "))
	                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

	        // 21. Partition even and odd
	        List<Integer> partList = Arrays.asList(1,2,3,4,5,6);
	        System.out.println("21. Partition: " +
	                partList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0)));

	        // 22. Duplicate elements only
	        List<Integer> dupOnly = Arrays.asList(1,2,3,2,4,5,1);
	        Set<Integer> seen = new HashSet<>();
	        System.out.println("22. Duplicates: " +
	                dupOnly.stream().filter(n -> !seen.add(n)).collect(Collectors.toSet()));

	        // 23. Longest string
	        List<String> strList = Arrays.asList("java","microservices","api");
	        System.out.println("23. Longest string: " +
	                strList.stream().max(Comparator.comparingInt(String::length)).get());

	        // 24. Top 3 highest numbers
	        List<Integer> top3 = Arrays.asList(10,90,30,70,50);
	        System.out.println("24. Top 3: " +
	                top3.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()));

	        // 25. Flatten list of lists
	        List<List<Integer>> listOfLists = Arrays.asList(
	                Arrays.asList(1,2),
	                Arrays.asList(3,4),
	                Arrays.asList(5)
	        );
	        System.out.println("25. Flattened list: " +
	                listOfLists.stream().flatMap(List::stream).collect(Collectors.toList()));

	        // 26. Sum of squares of even numbers
	        System.out.println("26. Sum of squares: " +
	                nums.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum());

	        // 27. Sort map by value
	        Map<String, Integer> map = new HashMap<>();
	        map.put("A",3); map.put("B",1); map.put("C",2);
	        System.out.println("27. Sorted map: " +
	                map.entrySet().stream()
	                        .sorted(Map.Entry.comparingByValue())
	                        .collect(Collectors.toMap(
	                                Map.Entry::getKey,
	                                Map.Entry::getValue,
	                                (a,b) -> a,
	                                LinkedHashMap::new)));

	        // 28. Employee with highest salary
	        List<Employee> employees = Arrays.asList(
	                new Employee("A",50000),
	                new Employee("B",80000),
	                new Employee("C",60000)
	        );
	        System.out.println("28. Highest salary employee: " +
	                employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get());

	        // 29. Common elements between two lists
	        List<Integer> l1 = Arrays.asList(1,2,3,4);
	        List<Integer> l2 = Arrays.asList(3,4,5,6);
	        System.out.println("29. Common elements: " +
	                l1.stream().filter(l2::contains).collect(Collectors.toList()));

	        // 30. Kth smallest element
	        List<Integer> kthList = Arrays.asList(9,1,5,3,7);
	        int k = 2;
	        System.out.println("30. Kth smallest: " +
	                kthList.stream().sorted().skip(k-1).findFirst().get());
	    }
}
