package assignment6;

public class InterLeave {
  public static int[] interleave(int[] arr1, int[] arr2) {
    int length1 = arr1.length;
    int length2 = arr2.length;
    int[] arr = new int[length1 + length2];
    int i = 0;
    int j = 0;
    while ((i < length1) && (j < length2)) {
      arr[i + j] = arr1[i++];
      arr[i + j] = arr2[j++];
    } // while
    while (i < length1) {
      arr[i + j] = arr1[i++];
    } // while
    while (j < length2) {
      arr[i + j] = arr2[j++];
    } // while
    return arr;
  }// interleave(int[], int[])
}// InterLeave
