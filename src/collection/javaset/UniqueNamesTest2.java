package collection.javaset;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNamesTest2 {

  public static void main(String[] args) {
    Integer[] inputArr = {30, 20, 20, 10, 10};

    Set<Integer> set = new LinkedHashSet<Integer>();
    for (Integer integer : inputArr) {
      set.add(integer);
    }

    System.out.println(set);
  }
}
