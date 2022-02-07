package lesson002Basics;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
       int[]  array1 = createArray(15); //create array

       for (int i = 0; i < array1.length; i++) {
           System.out.print(array1[i]);
       }

       System.out.println("\nEven numbers:" + countEvNum(array1)); // count even numbers

       sortArray(array1);

       for (int i = 0; i < array1.length;i++) {
            System.out.print(array1[i]);
        }
    }

    public static int[] createArray(int length) { //random numbers from 0 to 9
        int[] newArray = new int[15];
        Random randomNumber = new Random();
        for (int i = 0; i < length; i++) {
            newArray[i] = randomNumber.nextInt(10);
        }
        return newArray;
    }

    public static int countEvNum(int[] arr) { //count even numbers in the array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void sortArray(int[] arr) { //sort array from lowest to highest
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int t = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = t;
                    needIteration = true;
                }
            }
        }

    }
}
