package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

  public static void main(String[] args) {
    AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
    AnimalHospitalV1 catHospital = new AnimalHospitalV1();

    Dog dog = new Dog("멍멍이1", 100);
    Cat cat = new Cat("냥냥", 100);

    dogHospital.setAnimal(dog);
    dogHospital.checkup();
    Dog test1 = (Dog) dogHospital.bigger(new Dog("멍멍이2", 50));
    System.out.println("test1 = " + test1);

    dogHospital.setAnimal(cat);


    catHospital.setAnimal(cat);
    catHospital.checkup();
    Cat test2 = (Cat) catHospital.bigger(new Cat("냥냥2", 400));
    System.out.println("test2 = " + test2);
  }
}
