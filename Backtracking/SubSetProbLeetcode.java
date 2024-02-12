package Backtracking;

import java.util.*;

public class SubSetProbLeetcode {
    public List<List<Integer>> subsets(int nums[]) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int nums[], int start, List<Integer> currSubset, List<List<Integer>> result) {
        result.add(new ArrayList<>(currSubset));
        for (int i = start; i < nums.length; i++) {
            currSubset.add(nums[i]);
            backtrack(nums, i + 1, currSubset, result);
            currSubset.remove(currSubset.size() - 1);
        }
    }

    public static void main(String[] args) {
        SubSetProbLeetcode solution = new SubSetProbLeetcode(); // Create an instance of the class
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.subsets(nums); // Call the method on the instance
        System.out.println("Subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
