package Sortings;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {83,43,1,4,56,76};
        System.out.println(Arrays.toString(SelectionSort(arr)));
    }
    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[i]){
                    swap(j,i,arr);
                }
            }
        }
        return arr;
    }
    public static void swap(int first, int second, int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int[] SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = FindMinimum(i,arr);
            if(arr[i] != arr[min]){
               swap(i,min,arr);
            }
        }
        return arr;
    }

    public static int FindMinimum(int i, int[] arr){
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int j = i; j < arr.length; j++) {
            if(min > arr[j]){
                min = arr[j];
                index = j;
            }
        }
        return index;
    }
}
