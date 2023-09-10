package com.example.lib.array;

/**
 * Created by Vijay on 08-09-2023.
 */
public class MinimumValueArray3 {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int minimumValueArray(int[] arr) {
        if(arr==null||arr.length==0){
            throw new IllegalArgumentException("Invalid Input");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 15, 1, 2};
        MinimumValueArray3 obj = new MinimumValueArray3();
        obj.printArray(arr);
        int minimumValueArray = minimumValueArray(arr);
        System.out.println(minimumValueArray);
    }
}
