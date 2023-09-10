package com.example.lib.array;

/**
 * Created by Vijay on 08-09-2023.
 */
public class ReverseArray3 {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 11, 5, 10, 7, 8};
        ReverseArray3 obj = new ReverseArray3();
        obj.printArray(arr);
        reverseArray(arr, 0, arr.length - 1);
        obj.printArray(arr);

    }
}
