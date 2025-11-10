package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Quiz2 {
  public static void main(String[] args) {
    BrowserHistory browser = new BrowserHistory();

    browser.visitPage("youtube.com");
    browser.visitPage("google.com");
    browser.visitPage("facebook.com");

    // 뒤로 가기 기능을 사용하는 시나리오
    String currentPage1 = browser.goBack();
    System.out.println("currentPage1 = " + currentPage1);
    String currentPage2 = browser.goBack();
    System.out.println("currentPage2 = " + currentPage2);
  }


  public static class BrowserHistory {
    private Deque<String> deque = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String page) {
      if(currentPage != null) {
        deque.push(page);
      }
      currentPage = page;
      System.out.println("방문 = " + page);
    }

    public String goBack() {
      if(!deque.isEmpty()) {
       currentPage = deque.pop();
        System.out.println("뒤로 가기 = " + currentPage);
       return currentPage;
      }
      return null;
    }
  }
}
