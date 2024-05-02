package Lesson_22;

import java.util.Arrays;

public class BinnarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left <= right) {
            count = count + 1;
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return count;

            if (arr[mid] < target)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 16;
        int result = binarySearch(arr, target);
        if (result == -1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at index: " + result);
    }
}
