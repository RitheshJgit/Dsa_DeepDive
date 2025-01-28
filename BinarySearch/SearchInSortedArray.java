package BinarySearch;

public class SearchInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,1,3};

        int index = FindAscOrIndex(arr);
        int target = 1;
        int n = findNumInArray(arr, index,target);

        System.out.println(n);
    }
    public static int FindAscOrIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end - start) / 2;
           if(mid < end && arr[mid] > arr[mid + 1]){
               return mid;
           }
            if(start < mid && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] > arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static int findNumInArray(int[] arr, int index, int target){
        int n = binarySearch(arr, 0, index, target);
        if(n != -1){
            return n;
        }
        return binarySearch(arr,index + 1, arr.length-1, target);
    }


    public static int binarySearch(int[] arr, int startIndex, int endIndex, int target){
        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex) / 2;

            if(target > arr[mid]){
                startIndex = mid + 1;
            }
            else if(target < arr[mid]){
                endIndex = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
