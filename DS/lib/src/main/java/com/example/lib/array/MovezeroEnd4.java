package com.example.lib.array;

/**
 * Created by Vijay on 10-09-2023.
 */
public class MovezeroEnd4 {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] moveZeroToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] != 0) && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 1, 0, 2, 1, 0, 3};
        int[] arr2 = moveZeroToEnd(arr);
        MovezeroEnd4 obj = new MovezeroEnd4();
        obj.printArray(arr2);
    }
}
