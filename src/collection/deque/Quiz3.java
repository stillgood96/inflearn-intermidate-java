package collection.deque;

import java.util.HashMap;
import java.util.Map;

public class Quiz3 {

  public static void main(String[] args) {
    String text = "orange banana apple apple banana apple";
    Map<String, Integer> wordMap = new HashMap<>();
    for (String s : text.split(" ")) {
      wordMap.put(s, wordMap.getOrDefault(s, 0) + 1);
    }
    System.out.println(wordMap);
  }
}
