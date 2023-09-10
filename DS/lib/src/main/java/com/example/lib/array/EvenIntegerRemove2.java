package com.example.lib.array;

/**
 * Created by Vijay on 08-09-2023.
 */
public class EvenIntegerRemove2 {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7, 10, 6, 5};
        EvenIntegerRemove2 obj = new EvenIntegerRemove2();
        obj.printArray(arr);
        int[] result = removeEven(arr);
        obj.printArray(result);
    }
}
