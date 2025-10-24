package collection.array;

public class MyArrayListV4Main {

  public static void main(String[] args) {
    MyArrayListV4<String> stringList = new MyArrayListV4();
    stringList.add("a");
    stringList.add("b");
    stringList.add("c");
    // stringList.add(1);

    String s = stringList.get(0);
    System.out.println("s = " + s);

    MyArrayListV4<Integer> integerList = new MyArrayListV4();
    integerList.add(1);
    integerList.add(2);
    integerList.add(3);
    //integerList.add("c");

    Integer integer = integerList.get(0);
    System.out.println("integer = " + integer);
  }
}
