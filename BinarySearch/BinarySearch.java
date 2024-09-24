package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Search Space
        int[] arr =  { 10, 23, 40, 45, 56, 70, 93, 100, 121};

        // Search key
        int k = scn.nextInt();

        // Linear Search
        int idx = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                idx = i;
                break;
            }
        }
        System.out.println(k + " is present at index " + idx);

        // Time Complexity of Linear Search - O(N)

        int index = binarySearch(arr, k);
        System.out.println(k + " is present at index " + idx);

    }

    public static int binarySearch(int[] arr, int k){
        // prerequisite -> Array must be sorted

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            // finding middle point of array
            int mid = low + (high - low) / 2;  // (low + high ) / 2 -> can lead to overflow

            if(arr[mid] == k){
                // key is equal to mid
                return mid;
            }else if(arr[mid] < k){
                // key is greater than mid
                low = mid + 1;
            }else {
                // key is less than mid
                high = mid - 1;
            }
        }
        return -1;
    }
}
