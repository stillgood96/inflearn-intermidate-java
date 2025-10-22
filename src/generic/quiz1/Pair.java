package generic.quiz1;

public class Pair <First, Second> {
  First first;
  Second second;

  public First getFirst() {
    return first;
  }

  public void setFirst(First first) {
    this.first = first;
  }

  public Second getSecond() {
    return second;
  }

  public void setSecond(Second second) {
    this.second = second;
  }

  @Override
  public String toString() {
    return "Pair{" +
        "first=" + first +
        ", second=" + second +
        '}';
  }
}
