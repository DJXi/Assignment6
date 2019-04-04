package assignment6;


public class Program {

  public static IntPair[] allPairs(int[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException("No element!");
    } // if
    IntPair[] ret = new IntPair[arr.length * arr.length];
    for (int i = 0; i < ret.length; i++) {
      ret[i] = new IntPair(arr[i / 3], arr[i % 3]);
    } // for
    return ret;
  }// allPairs(int[])
}// Program
