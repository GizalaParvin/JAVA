public class bubblesort {
    static void bubbleSort(int a[]) {
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap a[j] and a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int a[]) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {65, 34, 25, 12, 22, 11, 90};

        bubbleSort(arr); // Call the bubbleSort method

        System.out.println("Sorted array:");
        printArray(arr); // Call the printArray method
    }
}
