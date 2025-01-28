package Sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {123,134534,12,34,233,6,346,1345,13,451,345,134};
        System.out.println(Arrays.toString(bubblesort(arr)));
    }
    public static int[] bubblesort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i-1; j++) {
                if(arr[j] < arr[j-1]){
                    swap(j, j-1, arr);
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
}
