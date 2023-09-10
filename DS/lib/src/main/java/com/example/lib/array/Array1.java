package com.example.lib.array;

/**
 * Created by Vijay on 08-09-2023.
 */
public class Array1 {
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] myArray = new int[5];
        //printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 9;
        //printArray(myArray);
        System.out.println("myArray.length= " + myArray.length);
        System.out.println("myArray.length -1 " + (myArray.length - 1));
        System.out.println("myArray[myArray.length - 1]) " + (myArray[myArray.length - 1]));
        int[] arr = {5, 1, 8, 10};
        //printArray(arr);
    }

    public static void main(String[] args) {
        Array1 array1 = new Array1();
        array1.arrayDemo();
    }
}
