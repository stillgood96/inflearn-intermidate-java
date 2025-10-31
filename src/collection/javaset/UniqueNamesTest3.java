package collection.javaset;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {

  public static void main(String[] args) {
    Integer[] inputArr = {30, 20, 20, 10, 10};

    Set<Integer> set = new TreeSet<>();
    for (Integer integer : inputArr) {
      set.add(integer);
    }

    System.out.println(set);
  }
}
