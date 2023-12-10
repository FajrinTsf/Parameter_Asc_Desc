public class Parameter {

  public static void main(String[] args) {
    int[] arr = { 8, 7, 10, 15, 12, 1, 3, 6 };

    System.out.println("Array sebelum diurutkan:");
    printArray(arr);

    bubbleSort(arr, arr.length, "ASC"); // bubbleSort untuk pengurutan ascending
    System.out.println("\nArray setelah diurutkan secara ascending:");
    printArray(arr);

    bubbleSort(arr, arr.length, "DESC"); // bubbleSort untuk pengurutan descending
    System.out.println("\nArray setelah diurutkan secara descending:");
    printArray(arr);
  }

  // An optimized version of Bubble Sort
  static void bubbleSort(int arr[], int n, String TypeSort) {
    int i, j, temp;
    boolean swapped;

    for (i = 0; i < n - 1; i++) {
      swapped = false;

      for (j = 0; j < n - i - 1; j++) {
        if (TypeSort == "ASC" && arr[j] > arr[j + 1]) {
          // Swap arr[j] and arr[j+1]
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        } else if (TypeSort == "DESC" && arr[j] < arr[j + 1]) {
          // Swap arr[j] and arr[j+1]
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }

      // If no two elements were
      // swapped by inner loop, then break if (swapped == false)
      if (swapped == false)
        break;
    }
  }

  static void printArray(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}
