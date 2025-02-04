package ProblemSolving.LeetCode150;

import java.util.Arrays;

public class findDuplicates {
    public static void main(String[] args) {
        int [] arr = {0,0,1,2,3,4,5,5,5};

        findDuplicates(arr);
    }

    static void findDuplicates(int[] arr){
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]){
                i ++;
                arr[i] = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
