package generic.quiz2;

public class Shuttle<T extends StarcraftUnit>{
  private T unit;

  public void in(T t) {
    this.unit = t;
  }

  public void showInfo() {
    System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
  }
}
