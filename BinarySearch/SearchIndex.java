package BinarySearch;

import java.util.Scanner;

public class SearchIndex {
    public static void main(String[] args) {
        // Find the correct index to insert an element into a sorted array such that the array remains sorted after
        // the insertion

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        int idx = searchIndex(arr, k);
        System.out.println(k + " should be inserted at index " + idx);
    }

    public static int searchIndex(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while( low <= high){

            int mid = low + (high - low) / 2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}


/**
 * Observations -
 *      1. If element not found then after iterating through whole array low high will point at element which is
 *      just smaller than key and low will point at element which is just greater than key
 *
 *      2. If key is largest element then
 *
 * **/