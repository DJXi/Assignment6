package assignment6;

public class FastModExp {

  public static int fastModExp(int x, int y, int m) {
    if (y == 0) {
      if (java.lang.Math.abs(m) != 1) {
        return 1;
      } else {
        return 0;
      } // if/else
    } else if (y < 0) {
      if ((java.lang.Math.abs(x) == 1) && (java.lang.Math.abs(m) != 1)) {
        return x;
      } else {
        return 0;
      } // if/else
    } else if ((y % 2) == 0) {
      return FastModExp.fastModExp(x * x % m, y / 2, m);
    } else {
      return ((x * FastModExp.fastModExp(x, y - 1, m)) % m);
    } // if/else
  }// fastModExp(int, int, int)
}// FastModExp
