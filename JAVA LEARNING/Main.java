import java.util.Arrays;

public class Main {

    void merge(int array[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1];
        int M[] = new int[n2];

        // Fill the left and right sub-arrays
        for (int i = 0; i < n1; i++) {
            L[i] = array[p + i];
        }
        for (int j = 0; j < n2; j++) {
            M[j] = array[q + 1 + j];
        }

        // Maintain current index of sub-arrays and main array
        int i = 0, j = 0, k = p;

        // Merge the sub-arrays back into the main array
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }

        // If there are remaining elements in L[]
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // If there are remaining elements in M[]
        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }

    void mergeSort(int array[], int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Recursively sort each half
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] array = { 6, 5, 12, 10, 9, 1 };
        Main ob = new Main();

        // Call mergeSort on the array
        ob.mergeSort(array, 0, array.length - 1);

        // Print the sorted array
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(array));
    }
}
