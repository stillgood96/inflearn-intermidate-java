package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz1 {

  public static void main(String[] args) {
    List<Integer> students = new ArrayList<>(Arrays.asList(90, 80, 70, 60, 50));

    int total = 0;
    for(int i = 0; i < students.size(); i++) {
      total += students.get(i);
    }

    double average = (double) total / students.size();
    System.out.println("점수 총합: " + total);
    System.out.println("점수 평균: " + average);
  }
}
