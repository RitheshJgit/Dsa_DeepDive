package ProblemSolving.Leetcode;

public class MergeSortArray88_Easy {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        mergeSortArray(nums1, m, nums2, n);
    }

    static void mergeSortArray(int[] nums1, int m, int[] nums2, int n) {
            int i = 0;
            int j = 0;
            int k = 0;

            // assign an array to store the final sorted elements
            int[] mix = new int[nums1.length];

            while (i < nums1.length && j < nums2.length){
                while (nums1[i] != 0 && nums1[i] < nums2[j]){
                    mix[k] = nums1[i];
                    k++;i++;
                }
                while (j < nums2.length && nums2[j] <= nums1[i]){
                    mix[k] = nums2[j];
                    k++;j++;
                }

            }

            while(i < nums1.length){

            }
    }
}
