package com.example.lib.array;

/**
 * Created by Vijay on 08-09-2023.
 */
public class SecondMaxValue4 {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if ((arr[i] > secondMax) && (arr[i] != max)) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[] = {13, 34, 2, 34, 33, 1};
        SecondMaxValue4 obj = new SecondMaxValue4();
        obj.printArray(arr);
        System.out.println(obj.findSecondMax(arr));

    }
}
