package com.example.lib.array;

/**
 * Created by Vijay on 10-09-2023.
 */
public class MissingArrayElement6 {
    private int missingArray(int[] arr) {
        int length = arr.length + 1;
        int sumOfNaturalNumber = length * (length + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sumOfNaturalNumber = sumOfNaturalNumber - arr[i];
        }
        return sumOfNaturalNumber;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 8, 6, 3, 7};
        MissingArrayElement6 obj = new MissingArrayElement6();
        System.out.println(obj.missingArray(arr));
    }
}
