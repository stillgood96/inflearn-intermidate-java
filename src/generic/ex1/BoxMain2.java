package generic.ex1;

public class BoxMain2 {

  /**
   * ObjectBox의 경우
   * Object는 코드의 중복을 줄여주지만 타입 안정성은 보장하지 못한다.
   *
   * IntegerBox, StringBox..etc 는 타입안정성은 높지만
   * 코드의 중복이 늘어난다 (구현해야할 타입만큼)
   * 이에 생기는 딜레마를 해결해주는 부분이 제네릭(Generic)이다
   *
   * @param args
   */
  public static void main(String[] args) {

    ObjectBox integerBox = new ObjectBox();
    integerBox.setValue(10);

    Integer integer = (Integer) integerBox.getValue();
    System.out.println("integer = " + integer);

    ObjectBox stringBox = new ObjectBox();
    stringBox.setValue("string");
    String string = (String) stringBox.getValue();
    System.out.println("string = " + string);
  }
}
