package ProblemSolving.Leetcode;

import java.util.Arrays;

public class ParityCheck2 {
    public static void main(String[] args) {
        int[] arr = {
                1,2,3,4,5,6
        };

        System.out.println(Arrays.toString(parityCheck(arr)));
    }

    public static int[] parityCheck(int[] arr){
        int i = 0;
        int OddCount = -1;
        int EvenCount = -1;
        while (i < arr.length){
            if(arr[i] % 2 == 0 && i % 2 != 0 || arr[i] % 2 != 0 && i % 2 == 0){

                EvenCount = i;
                if(OddCount != -1){
                    swap(EvenCount, OddCount,arr);
                }
            }
            if(arr[i] % 2 == 1 && i % 2 != 1 || arr[i] % 2 != 1 && i % 2 == 1){
                OddCount = i;
                if(EvenCount != -1){
                    swap(EvenCount, OddCount,arr);
                }
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
