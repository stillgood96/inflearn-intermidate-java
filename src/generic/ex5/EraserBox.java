package generic.ex5;

public class EraserBox<T> {
  public boolean instaceCheck(Object param) {
    //return param instanceof T;
    return false;
  }

  public T create() {
    // return new T();
    return null;
  }
}
