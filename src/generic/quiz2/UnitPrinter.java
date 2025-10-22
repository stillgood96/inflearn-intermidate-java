package generic.quiz2;

public class UnitPrinter {

  static <T extends StarcraftUnit> void printV1(Shuttle<T> shuttle) {
    T unit = shuttle.out();
    System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
  }

  static void printV2(Shuttle<? extends StarcraftUnit> shuttle) {
    StarcraftUnit unit = shuttle.out();
    System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
  }
}
