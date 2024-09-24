package BinarySearch;

import java.util.Scanner;

public class BinarySearchRecursiveImp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Search Space
        int[] arr =  { 10, 23, 40, 45, 56, 70, 93, 100, 121};

        // Search key
        int k = scn.nextInt();
        int index = binarySearch(arr, 0, arr.length - 1, k);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int left, int right, int key) {

        // Base Condition
        if(left > right) return -1;

        // Discovers the mid-point in the search space and compares it to the target
        int mid = left + (right - left) / 2;

        // Base condition (target value is found)
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            // Remove all elements from the right search space, including the middle element.
            return binarySearch(arr, mid + 1, right, key);
        } else {
            // Remove all elements from the left search space, including the middle element.
            return binarySearch(arr, left, mid - 1, key);
        }

    }
}
