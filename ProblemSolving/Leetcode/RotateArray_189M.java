package ProblemSolving.Leetcode;

import java.util.Arrays;

public class RotateArray_189M {
    public static void main(String[] args) {
        int k = 3;
        int[] nums ={1,2,3,4,5,6,7};
        rotate(nums, k);
    }

    static void rotate(int[] nums, int k) {
        if(nums.length < 2){
            System.out.println(Arrays.toString(nums));
        } else if (nums.length == 2) {
            for (int i = 0; i < k; i++) {
                swap(nums);
            }
            System.out.println(Arrays.toString(nums));
        }
        else {
            int count = 0;
            int n = nums.length - 1;
            while (count < k) {
                // Store the last element
                int rotateElement = nums[n];

                // Swap the elements
                for (int i = n - 1; i >= 0  ; i--) {
                    nums[i + 1] = nums [i];
                }
                nums[0] = rotateElement;
                count ++;
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    static void swap(int[] nums){
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }
}
