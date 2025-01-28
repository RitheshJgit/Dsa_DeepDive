package Sortings;

import java.util.Arrays;

class MergeSort{
    public static void main(String[] args) {
        int[] arr = {5,8,1,4,3};
        arr = MergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] MergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int [] left, int[] right){
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k++] = left[i++];
            }
            else{
                mix[k++] = right[j++];
            }
        }

        while(i < left.length){
            mix[k++] = left[i++];
        }
        while (j < right.length){
            mix[k++] = right[j++];
        }
        return mix;
    }

}
