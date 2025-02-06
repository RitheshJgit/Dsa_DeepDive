class Solution {
    public int majorityElement(int[] nums) {
        // Link - https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
        int count = 0;
        int ans = 0;
        for(int i = 0 ; i < nums.length; i++){
            // using Booyer Moore Algorithm 
            if(count == 0){
                ans = nums[i];
            }

            // using Ternary Operator to Count ++ and Count --
            count += (nums[i] == ans) ? 1 : -1;
           
        }

        return ans;
    }
}
