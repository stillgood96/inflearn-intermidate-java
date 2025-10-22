package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

  public static void main(String[] args) {
    Box<Object> objBox = new Box<>();
    Box<Dog> dogBox = new Box<>();
    Box<Cat> catBox = new Box<>();

    dogBox.set(new Dog("멍멈이", 100));

    WildcardEx.printWildcardV1(dogBox);
    WildcardEx.printWildcardV2(dogBox);
    Animal animal = WildcardEx.printAndReturnWildcard(dogBox);

    WildcardEx.printGenericV1(dogBox);
    WildcardEx.printGenericV2(dogBox);
    Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
  }
}
