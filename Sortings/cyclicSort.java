package Sortings;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,1};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    public static int[] cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != i + 1){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            i++;
        }
        return arr;
    }
}
