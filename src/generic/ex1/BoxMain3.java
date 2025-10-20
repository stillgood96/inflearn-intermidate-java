package generic.ex1;

public class BoxMain3 {


  public static void main(String[] args) {

    GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T 타입을 결정
    integerBox.setValue(1);
//    integerBox.setValue("문자");
    Integer integer = integerBox.getValue();
    System.out.println("integer = " + integer);

    GenericBox<String> stringBox = new GenericBox<String>();
    stringBox.setValue("Hello, World!!");
    String string = stringBox.getValue();
    System.out.println("string = " + string);

    //타입 추론: 생성하는 제네릭 타입 생략 가능
    GenericBox<Integer> integerBox2 = new GenericBox<>();

  }
}
