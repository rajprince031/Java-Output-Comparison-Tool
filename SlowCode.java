import java.util.Arrays;

class SlowCode {
    public static void main(String[] args) {
        // Ensure that the input is provided
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
         * 
         *
         */

        // Example of code usage:
        int n = input[idx++];
        int[] arr = new int[n + 1];
        arr[n] = 101; // Placeholder value, not part of the array
        for (int i = 0; i < n; i++) {
            arr[i] = input[idx++];
        }
        
        // Sort the array to prepare for queries
        Arrays.sort(arr);
        
        // Process each query
        int q = input[idx++];
        for (int i = 0; i < q; i++) {
            int a = input[idx++];
            int sum = 0;
            
            // Calculate the sum of all elements less than or equal to `a`
            for (int j = 0; j <= n; j++) {
                if (arr[j] <= a) {
                    sum += arr[j];
                } else {
                    // Append the results to the StringBuilder
                    result.append(j).append(" ").append(sum).append(" ");
                    break;
                }
            }
        }

        // Print the final result
        System.out.println(result);
    }
}
