package Sortings;

import java.util.Arrays;

public class MergeSortII {
    public static void main(String[] args) {
        int[] arr = {};
        int[] ans = MergeSortII(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] MergeSortII(int[] arr){
        // base condition
        if(arr.length == 1){
            return arr;
        }
        // declare mid in MergeSort
        int mid = arr.length/ 2;
        //
        int[] left = MergeSortII(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSortII(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        // Adding both length
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k =0;
       while(i < left.length && j < right.length ){
           if(left[i] < right[j]){
                mix[k++] = left[i++];
           }
           else {
               mix[k++] = right[j++];
           }
       }

       while (i < left.length){
           mix[k++] = left[i++];
       }
        while (j < right.length){
            mix[k++] = right[j++];
        }

        return mix;
    }


}
