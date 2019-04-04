package assignment6;

public class ConcatAndReplicateAll {

  public static String concatAndReplicateAll(String[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException("No element!");
    } // if
    int length = arr.length;
    String str = new String("");
    for (int i = 0; i < (arr.length * arr.length); i++) {
      str += arr[i / length];
    } // for
    return str;
  }// concatAndReplicateAll(String[])
}// ConcatAndReplicateAll
