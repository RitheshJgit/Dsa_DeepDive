package ProblemSolving.Leetcode;

import java.util.Arrays;

public class ParityCheck {
    public static void main(String[] args) {
        int[] arr = {
                3,1,2,4
        };

        System.out.println(Arrays.toString(parityCheck(arr)));
    }

    public static int[] parityCheck(int[] arr){
        int i = 0;
        int count = 0;
        while (i < arr.length){
            if(arr[i] % 2 == 0){
                swap(count, i,arr);
                count++;
            }
            i++;
        }
        return arr;
    }

    public static void swap(int first , int second, int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
