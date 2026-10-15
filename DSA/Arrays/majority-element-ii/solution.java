import java.util.*;

class Solution {
    // Function to find majority elements in an array
    public List<Integer> majorityElementTwo(int[] nums) {
        
        // Size of the array
        int n = nums.length;

        // List of answers
        List<Integer> result = new ArrayList<>();

        // Declaring a map
        Map<Integer, Integer> mpp = new HashMap<>();

        // Least occurrence of the majority element
        int mini = n / 3 + 1;

        // Storing the elements with its occurrence
        for (int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);

            // Checking if nums[i] is the majority element
            if (mpp.get(nums[i]) == mini) {
                result.add(nums[i]);
            }

            // If result size is equal to 2 break out of loop
            if (result.size() == 2) {
                break;
            }
        }

        // Return the majority elements
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};

        // Create an instance of Solution class
        Solution sol = new Solution();

        List<Integer> ans = sol.majorityElementTwo(arr);

        // Print the majority elements found
        System.out.print("The majority elements are: ");
        for (int it : ans) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
}