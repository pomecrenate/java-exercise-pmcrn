package com.udemy.java.array;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StudentRunner {

  public static void main(String[] args) {
    Student student = new Student("chan", 98, 89, 100);

    int number = student.getNumberOfMarks();
    System.out.println("number of marks: " + number);

    int sum = student.getTotalSumOfMarks();
    System.out.println("sum of marks: " + sum);

    int maximumMark = student.getMaximumMark();
    System.out.println("maximum of marks: " + maximumMark);

    int minimumMark = student.getMinimumMark();
    System.out.println("minimum of marks: " + minimumMark);

    BigDecimal average = student.getAverageMarks();
    System.out.println("average of marks: " + average);

    System.out.println(student);

    student.addNewMark(35);
    System.out.println(student);

    student.removeMarkAtIndex(1);
    System.out.println(student);

    // 루프 테스트
    List<String> words = new ArrayList<>();
    words.add("Apple");
    words.add("Bat");
    words.add("Cat");
    System.out.println(words);
    for (String word : words) {
      if (word.endsWith("at")) {
        words.remove(word);
      }
    }
    System.out.println(words);
  }

}
