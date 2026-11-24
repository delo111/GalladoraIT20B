
public class SortingAlgorithms {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Copy Array
    public static int[] copyArray(int[] original) {
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        return copy;
    }

    // Display Array
    public static void displayArray(int[] arr) {
        System.out.print("[ ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" ]");
    }

    public static void main(String[] args) {

        int[] original = {45, 12, 78, 23, 9, 56, 34, 89, 15, 67};

        int[] bubbleArray = copyArray(original);
        int[] selectionArray = copyArray(original);
        int[] insertionArray = copyArray(original);

        System.out.print("Original Array: ");
        displayArray(original);

        bubbleSort(bubbleArray);
        System.out.print("Bubble Sort: ");
        displayArray(bubbleArray);

        selectionSort(selectionArray);
        System.out.print("Selection Sort: ");
        displayArray(selectionArray);

        insertionSort(insertionArray);
        System.out.print("Insertion Sort: ");
        displayArray(insertionArray);
    }
}
