package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

  private static final int SIZE = 12;
  private static final int INIT = -1;
  private int[] numbers = new int[SIZE];

  public int total = INIT;

  public void countIn(int in) {
    if (!isFull()) numbers[++total] = in;
  }

  public boolean callCheck() {
    return total == INIT;
  }

  public boolean isFull() {
    return total == 11;
  }

  protected int peekaboo() {
    if (callCheck()) return INIT;
    return numbers[total];
  }

  public int countOut() {
    if (callCheck()) return INIT;
    return numbers[total--];
  }
}
