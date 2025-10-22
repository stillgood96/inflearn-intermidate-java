package generic.quiz2;

public class UnitUtil {

  static <T extends StarcraftUnit> T maxHp(T t1, T t2) {
    return t1.getHp() > t2.getHp() ? t1 : t2;
  }
}
