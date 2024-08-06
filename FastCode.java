import java.util.*;

class FastCode {
    public static void main(String[] args) {
        // Check if any input is provided
        if (args.length == 0) {
            System.err.println("Error: No input values provided.");
            System.exit(1);
        }
        
        // Convert the input string into an array of integers
        String[] argsArray = args[0].split(" ");
        int[] input = new int[argsArray.length];
        for (int i = 0; i < argsArray.length; i++) {
            input[i] = Integer.parseInt(argsArray[i]);
        }

        // Initialize index and result container
        int idx = 0;
        StringBuilder result = new StringBuilder();

        /*
         * IMPORTANT:
         * Write your code starting from here.
         * Use only the `input[idx++]` to access the input values.
         * Avoid using Scanner or InputStreamReader classes.
         * 
         * Example usage:
         * int n = input[idx++]; // Correct way to access input values
         *
         */

        // Example of code usage:
        // Extract the size of the array and populate it
        int n = input[idx++];
        int[] arr = new int[n + 1];
        arr[n] = 101; // Placeholder value, not part of the array
        for (int i = 0; i < n; i++) {
            arr[i] = input[idx++];
        }
        
        // Sort the array and compute prefix sums
        Arrays.sort(arr);
        int[] prefixSums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            prefixSums[i] = sum;
        }
        
        // Process queries
        int q = input[idx++];
        for (int i = 0; i < q; i++) {
            int target = input[idx++];
            int index = binarySearch(target, arr);

            // Output the result for each query
            if (index == -1) {
                result.append(0).append(" ").append(0).append(" ");
            } else {
                result.append(index + 1).append(" ").append(prefixSums[index]).append(" ");
            }
        }

        // Print the final result
        System.out.println(result);
    }

    /**
     * Performs binary search to find the index of the target in the sorted array.
     * If the target is not found, returns -1.
     *
     * @param target The value to search for.
     * @param arr The sorted array in which to search.
     * @return The index of the target if found, otherwise -1.
     */
    public static int binarySearch(int target, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == target || (arr[mid] < target && arr[mid + 1] > target)) {
                // Find the last occurrence of the target if it exists
                while (mid < arr.length - 1 && arr[mid] == arr[mid + 1]) {
                    mid++;
                }
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
