package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

  public static void main(String[] args) {
    AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
    AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();

    Dog dog = new Dog("멍멍이1", 100);
    Cat cat = new Cat("냥냥", 100);

    dogHospital.setAnimal(dog);
    dogHospital.checkup();
    Dog test1 = dogHospital.bigger(new Dog("멍멍이2", 50));
    System.out.println("test1 = " + test1);


    catHospital.setAnimal(cat);
    catHospital.checkup();
    Cat test2 = (Cat) catHospital.bigger(new Cat("냥냥2", 400));
    System.out.println("test2 = " + test2);
  }
}
