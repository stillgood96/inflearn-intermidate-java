package generic.ex2;

import generic.ex1.animal.Animal;
import generic.ex1.animal.Cat;
import generic.ex1.animal.Dog;

public class AnimalMain2 {

  public static void main(String[] args) {
    Animal animal = new Animal("동물", 0);
    Dog dog = new Dog("멍멍이", 100);
    Cat cat = new Cat("야옹이", 50);

    Box<Animal> animalBox = new Box<>();
    animalBox.set(animal);
    animalBox.set(dog);
    animalBox.set(cat);
  }
}
