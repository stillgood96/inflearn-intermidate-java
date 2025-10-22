package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

  public static void main(String[] args) {
    Dog dog = new Dog("멍멍이", 100);
    Cat cat = new Cat("냐옹이", 100);

    AnimalMethod.checkup(dog);
    AnimalMethod.checkup(cat);

    Dog dog2 = new Dog("큰 멍멍이", 200);
    Cat cat2 = new Cat("큰 야옹이", 200);

    Dog biggerDog = AnimalMethod.bigger(dog, dog2);
    System.out.println("biggerDog = " + biggerDog);

    Cat biggerCat = AnimalMethod.bigger(cat, cat2);
    System.out.println("biggerCat = " + biggerCat);
  }
}
