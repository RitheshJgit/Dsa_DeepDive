package BinarySearch;

public class orderAgnostic {
    public static void main(String[] args) {
        int index = -1;
        int[] arr ={
                6,7,77,333,2344
        };

        int target = 7;

        if(isOrderAgnostic(arr)){
            index = orderAgnosticBS(arr, target);
        }
        else {
            index = binarySearch(arr,target);
        }


        System.out.println(index);
    }

    public static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        while(start <= end){
                int mid = start + (end - start) / 2;

                if(target < arr[mid]){
                    start = mid + 1;
                }
                else if(target > arr[mid]){
                    end = mid -1;
                }

                else{
                    return mid;
                }
        }

        return -1;
    }

    public static boolean isOrderAgnostic(int[] arr){
        return arr[0] > arr[arr.length-1];
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
