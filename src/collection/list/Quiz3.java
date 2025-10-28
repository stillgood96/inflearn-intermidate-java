package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();

    System.out.println("n개의 정수를 입력하세요 (종료 0)");

    while(true) {
      Integer input = sc.nextInt();
      if(input == 0) break;
      list.add(input);
    }


    int sum = 0;
    for (Integer number : list) {
      sum += number;
    }
    System.out.printf("입력한 정수의 합계: %d \n", sum);
    System.out.printf("입력한 정수의 평균: %.1f \n", (double) sum / list.size());
  }
}
