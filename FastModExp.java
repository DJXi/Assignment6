package assignment6;

public class FastModExp {

  public int fastModExp(int x, int y, int m) {
    if (y == 1) {
      return x % m;
    } else if ((y % 2) == 0) {
      return FastModExp.fastModExp(x * x % m, y / 2, m);
    } else {
      return ((x * FastModExp.fastModExp(x, y - 1, m)) % m);
    } // if/else
  }// fastModExp(int, int, int)
}// FastModExp
