package ProblemSolving.Leetcode;

import java.util.Arrays;

public class MergeSortArray88_Easy {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        mergeInPlace(nums1, m, nums2, n);
    }

    static void mergeInPlace(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;


        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) { // if nums[i] greater it sorted in last
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {                   // if nums[j] greater it sorted in last
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }

        while (j >= 0) {           // if nums1 element sorted balance nums2 element sort in the front of nums1
            nums1[k] = nums2[j];
            k--;
            j--;
        }

        System.out.println(Arrays.toString(nums1));
    }
}
