package collection.utils;

import java.util.*;

public class EmptyListMain {
  public static void main(String[] args) {
    //빈 가변 리스트 생성
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();

    //빈 불변 리스트 생성
    List<Object> list3 = Collections.emptyList();// 자바5
    List<Object> list4 = List.of(); //자바 9

    System.out.println("list3 = " + list3.getClass());
    System.out.println("list4 = " + list4.getClass());

    Integer[] arr = {1,2,3,4,5};
    List<Integer> arrList = Arrays.asList(arr);
    System.out.println("arr = " + arr);
    System.out.println("arrList = " + arrList);
  }
}
