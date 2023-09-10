package com.example.lib.array;

/**
 * Created by Vijay on 10-09-2023.
 */
public class ResizeArray5 {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] resizeArray(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        ResizeArray5 obj = new ResizeArray5();
        int arr[] = {5, 1, 2, 9, 10};

        System.out.println("older array length = " + arr.length);
        obj.printArray(arr);

        System.out.println("after resize array length = " + obj.resizeArray(arr, 10).length);
        obj.printArray(obj.resizeArray(arr, 10));

    }
}
