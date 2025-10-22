package generic.quiz2;

public class StarcraftUnit {
  private String name;
  private Integer hp;

  public StarcraftUnit(String name, Integer hp) {
    this.name = name;
    this.hp = hp;
  }

  public String getName() {
    return name;
  }

  public Integer getHp() {
    return hp;
  }

  @Override
  public String toString() {
    return "StarcraftUnit{" +
        "name='" + name + '\'' +
        ", hp=" + hp +
        '}';
  }
}
