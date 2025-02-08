class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // it avoid the repeatation
        k = k % n;

        // reverse the array 
        reverse(nums, 0, n-1);
        // reverse first k elements
        reverse(nums, 0, k-1);
        // then reverse the balance nums
        reverse(nums, k, n-1);
    }

    public void reverse(int[] nums, int start, int end){
        // swap the elements
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++; end --;
        }
    }
}
