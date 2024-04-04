import java.util.Arrays;

public class MergeArrays {
    // Function to merge two arrays X[] and Y[] into X[]
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        // Move non-zero elements of X to the end
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k--] = X[i];
            }
        }
        
        // Merge X and Y
        int i = k + 1; // index of first non-zero element in X
        int j = 0;     // index of first element in Y
        int idx = 0;   // index of result array
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[idx++] = X[i++];
            } else {
                X[idx++] = Y[j++];
            }
        }
        
        // Copy remaining elements of Y if any
        while (j < n) {
            X[idx++] = Y[j++];
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };

        mergeArrays(X, Y);

        System.out.println("Merged array:");
        System.out.println(Arrays.toString(X));
    }
}
