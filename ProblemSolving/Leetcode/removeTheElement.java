package ProblemSolving.Leetcode;

import java.util.Arrays;

public class removeTheElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};

        int value = 3;
       removeElement(nums, value);
    }

    static  int[] removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;

        while(i < j){
            if(nums[j] == val){
                j--;
            } else if (nums[i] == val) {
                    swap(i, j, nums);
                    i++;j--;
            }
            else {
                i ++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    static void swap(int num1, int num2, int[] arr){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
