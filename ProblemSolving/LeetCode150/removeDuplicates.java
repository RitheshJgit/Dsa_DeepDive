package ProblemSolving.LeetCode150;

public class removeDuplicates {

    public static void main(String[] args) {
        int[] arr = {
                0,0,1,1,1,2,2,3,3,4
        }; // 0,1,2,3,4,0,0,0,0,0
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    public static int removeDuplicates(int[] nums) {

        int lenCheck = nums.length-1;
        for(int i = 0 ; i < nums.length; i++){
            for(int j = i ; j < nums.length; j++){
                if(nums[i] == nums[j]){

                    while(j < nums.length - 1){
                        nums[j] = nums[j + 1];
                        j++;

                    }
                    nums[lenCheck] = 0;
                    lenCheck--;
                }
            }
        }
        int check = 0;
        int i = nums.length-1;
        while(check == 0){
            if(check != nums[i]){
                check = 1;
            }
            i++;
        }

        return i + 1;
    }
}
