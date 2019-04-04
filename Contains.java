package assignment6;


public class Contains {

  public static boolean contains(double[] dubs, double eps, double d) {
    for (int i = 0; i < dubs.length; i++) {
      if (java.lang.Math.abs(dubs[i] - d) < eps) {
        return true;
      } // if
    } // for
    return false;
  }// contains(double[], double, double)
}// Contains
