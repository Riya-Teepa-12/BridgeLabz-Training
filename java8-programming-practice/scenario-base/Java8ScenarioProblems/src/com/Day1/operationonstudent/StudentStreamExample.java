package com.Day1.operationonstudent;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class StudentStreamExample {
    public static void main(String[] args) {

        // Sample student list
        List<Student> students = Arrays.asList(
                new Student(1,"Sanya","Sanya Sharma",22,"Female","Mumbai","Mechanical",45,Arrays.asList("12345","67890")),
                new Student(2,"Rohan","Rohan Mehta",27,"Male","Delhi","Computer",12,Arrays.asList("23456")),
                new Student(3,"Simran","Simran Kaur",24,"Female","Bangalore","Electronics",70,Arrays.asList("34567","45678")),
                new Student(4,"Amit","Amit Singh",29,"Male","Mumbai","Mechanical",55,Arrays.asList("56789")),
                new Student(5,"Siddharth","Siddharth Patil",21,"Male","Pune","Computer",30,Arrays.asList("67890","78901")),
                new Student(6,"Priya","Priya Desai",26,"Female","Kolkata","Biotech",90,Arrays.asList("89012")),
                new Student(7,"Sneha","Sneha Kapoor",23,"Female","Mumbai","Mechanical",15,Arrays.asList("90123","11223")),
                new Student(8,"Arjun","Arjun Rao",28,"Male","Bangalore","Electronics",80,Arrays.asList("12345")),
                new Student(9,"Samir","Samir Shah",25,"Male","Delhi","Computer",42,Arrays.asList("23456","34567")),
                new Student(10,"Sakshi","Sakshi Verma",22,"Female","Mumbai","Mechanical",18,Arrays.asList("45678","56789"))
        );

        System.out.println("=== Basic Filtering & Mapping ===");
        // 1. Students with rank < 50
        students.stream().filter(s -> s.getRank() < 50).forEach(System.out::println);

        // 2. Students age > 25
        students.stream().filter(s -> s.getAge() > 25).forEach(System.out::println);

        // 3. Names only
        students.stream().map(Student::getName).forEach(System.out::println);

        // 4. Mechanical Engineering students
        students.stream().filter(s -> "Mechanical".equalsIgnoreCase(s.getDepartment())).forEach(System.out::println);

        // 5. Students not from Mumbai
        students.stream().filter(s -> !"Mumbai".equalsIgnoreCase(s.getCity())).forEach(System.out::println);

        System.out.println("\n=== Sorting & Limiting ===");
        // 1. Sort by rank ascending
        students.stream().sorted(Comparator.comparingInt(Student::getRank)).forEach(System.out::println);

        // 2. Sort by age descending
        students.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).forEach(System.out::println);

        // 3. Top 5 students by rank
        students.stream().sorted(Comparator.comparingInt(Student::getRank)).limit(5).forEach(System.out::println);

        // 4. Last 3 students by rank
        students.stream().sorted(Comparator.comparingInt(Student::getRank).reversed()).limit(3).forEach(System.out::println);

        // 5. Sorted by name then rank
        students.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getRank)).forEach(System.out::println);

        System.out.println("\n=== Grouping & Aggregation ===");
        // 1. Count per department
        Map<String, Long> countDept = students.stream().collect(groupingBy(Student::getDepartment, counting()));
        System.out.println(countDept);

        // 2. Count per city
        Map<String, Long> countCity = students.stream().collect(groupingBy(Student::getCity, counting()));
        System.out.println(countCity);

        // 3. Average age per department
        Map<String, Double> avgAgeDept = students.stream().collect(groupingBy(Student::getDepartment, averagingInt(Student::getAge)));
        System.out.println(avgAgeDept);

        // 4. Average rank by gender
        Map<String, Double> avgRankGender = students.stream().collect(groupingBy(Student::getGender, averagingInt(Student::getRank)));
        System.out.println(avgRankGender);

        // 5. Total students
        long totalStudents = students.stream().count();
        System.out.println("Total Students: " + totalStudents);

        // 6. Department with highest average rank
        String deptHighestAvgRank = students.stream()
                .collect(groupingBy(Student::getDepartment, averagingInt(Student::getRank)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println("Department with highest average rank: " + deptHighestAvgRank);

        System.out.println("\n=== Min / Max / Ranking ===");
        // Best rank
        students.stream().min(Comparator.comparingInt(Student::getRank)).ifPresent(s -> System.out.println("Best rank: " + s));

        // Worst rank
        students.stream().max(Comparator.comparingInt(Student::getRank)).ifPresent(s -> System.out.println("Worst rank: " + s));

        // Second best rank
        students.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(1).findFirst().ifPresent(s -> System.out.println("Second best rank: " + s));

        // Third best rank
        students.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(2).findFirst().ifPresent(s -> System.out.println("Third best rank: " + s));

        // Youngest student
        students.stream().min(Comparator.comparingInt(Student::getAge)).ifPresent(s -> System.out.println("Youngest: " + s));

        // Oldest student
        students.stream().max(Comparator.comparingInt(Student::getAge)).ifPresent(s -> System.out.println("Oldest: " + s));

        System.out.println("\n=== FlatMap & Collections ===");
        // All contact numbers
        students.stream().flatMap(s -> s.getContacts().stream()).forEach(System.out::println);

        // Total number of contacts
        long totalContacts = students.stream().flatMap(s -> s.getContacts().stream()).count();
        System.out.println("Total contacts: " + totalContacts);

        // Students with more than 1 contact
        students.stream().filter(s -> s.getContacts().size() > 1).forEach(System.out::println);

        // Unique contacts
        students.stream().flatMap(s -> s.getContacts().stream()).distinct().forEach(System.out::println);

        System.out.println("\n=== Conditional & Matching ===");
        // Any Biotech
        boolean anyBiotech = students.stream().anyMatch(s -> "Biotech".equalsIgnoreCase(s.getDepartment()));
        System.out.println("Any Biotech student? " + anyBiotech);

        // All age > 20
        boolean allAbove20 = students.stream().allMatch(s -> s.getAge() > 20);
        System.out.println("All students above 20? " + allAbove20);

        // No Civil Engineering
        boolean noCivil = students.stream().noneMatch(s -> "Civil".equalsIgnoreCase(s.getDepartment()));
        System.out.println("No Civil Engineering? " + noCivil);

        System.out.println("\n=== Gender-Based Analysis ===");
        // Count male/female
        Map<String, Long> genderCount = students.stream().collect(groupingBy(Student::getGender, counting()));
        System.out.println(genderCount);

        // Avg age male
        double avgAgeMale = students.stream().filter(s -> "Male".equalsIgnoreCase(s.getGender())).mapToInt(Student::getAge).average().orElse(0);
        System.out.println("Average age of male students: " + avgAgeMale);

        // Avg age female
        double avgAgeFemale = students.stream().filter(s -> "Female".equalsIgnoreCase(s.getGender())).mapToInt(Student::getAge).average().orElse(0);
        System.out.println("Average age of female students: " + avgAgeFemale);

        // Highest ranked male
        students.stream().filter(s -> "Male".equalsIgnoreCase(s.getGender())).min(Comparator.comparingInt(Student::getRank)).ifPresent(s -> System.out.println("Highest ranked male: " + s));

        // Highest ranked female
        students.stream().filter(s -> "Female".equalsIgnoreCase(s.getGender())).min(Comparator.comparingInt(Student::getRank)).ifPresent(s -> System.out.println("Highest ranked female: " + s));

        System.out.println("\n=== Department-Specific Queries ===");
        // Names department-wise
        Map<String, List<String>> namesByDept = students.stream()
                .collect(groupingBy(Student::getDepartment, mapping(Student::getName, toList())));
        System.out.println(namesByDept);

        // Youngest in Computer
        students.stream().filter(s -> "Computer".equalsIgnoreCase(s.getDepartment())).min(Comparator.comparingInt(Student::getAge)).ifPresent(s -> System.out.println("Youngest in Computer: " + s));

        // Top rank Mechanical
        students.stream().filter(s -> "Mechanical".equalsIgnoreCase(s.getDepartment())).min(Comparator.comparingInt(Student::getRank)).ifPresent(s -> System.out.println("Top rank Mechanical: " + s));

        // Electronics from Karnataka
        long elecKarnataka = students.stream().filter(s -> "Electronics".equalsIgnoreCase(s.getDepartment()) && "Karnataka".equalsIgnoreCase(s.getCity())).count();
        System.out.println("Electronics students from Karnataka: " + elecKarnataka);

        System.out.println("\n=== Advanced Level ===");
        // Map<Id, Name>
        Map<Integer, String> idNameMap = students.stream().collect(toMap(Student::getId, Student::getName));
        System.out.println(idNameMap);

        // Map<Department, List<Student>>
        Map<String, List<Student>> deptStudentMap = students.stream().collect(groupingBy(Student::getDepartment));
        System.out.println(deptStudentMap);

        // Names starting with S
        students.stream().filter(s -> s.getName().startsWith("S")).forEach(System.out::println);

        // Name length > 5
        students.stream().filter(s -> s.getName().length() > 5).forEach(System.out::println);

        // Even rank
        students.stream().filter(s -> s.getRank() % 2 == 0).forEach(System.out::println);

        // Odd rank
        students.stream().filter(s -> s.getRank() % 2 != 0).forEach(System.out::println);

        System.out.println("\n=== Bonus Challenges ===");
        // Top 3 youngest
        students.stream().sorted(Comparator.comparingInt(Student::getAge)).limit(3).forEach(System.out::println);

        // Top 3 oldest
        students.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).limit(3).forEach(System.out::println);

        // Partition by age > 25
        Map<Boolean, List<Student>> partitionAge = students.stream().collect(partitioningBy(s -> s.getAge() > 25));
        System.out.println(partitionAge);

        // Partition by rank < 100
        Map<Boolean, List<Student>> partitionRank = students.stream().collect(partitioningBy(s -> s.getRank() < 100));
        System.out.println(partitionRank);

        // City with max students
        String cityMax = students.stream().collect(groupingBy(Student::getCity, counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println("City with max students: " + cityMax);

        // Department with min students
        String deptMin = students.stream().collect(groupingBy(Student::getDepartment, counting()))
                .entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
        System.out.println("Department with min students: " + deptMin);
    }
}
