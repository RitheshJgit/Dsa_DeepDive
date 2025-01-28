package BinarySearch;

public class MainBS {
    public static void main(String[] args) {
        int[] arr = {
                1,4,6,8,9,11,55,67,88
        };
        int target = 11;
        int ans = binarySearch(arr, target);
        System.out.println(ans + " is found");
    }
    public static int binarySearch(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;
            while(start <= end){
                int mid = start + (end - start) / 2;

                if(target < arr[mid]){
                    end = mid-1;
                }
               else if(target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }
            return -1;
    }
}
