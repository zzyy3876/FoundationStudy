package SortArray;

/**
 * Created by zzyy3_000 on 3/13/2016.
 * Combine Integer Arrays and MergeSort (Integer Array).
 * 归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列。
 * Reference: http://www.java2s.com/Tutorial/Java/0140__Collections/Mergesortmergingtwoarraysintoathird.htm
 */
public class CombineArray {
    public static void main(String args[]) {
        int[] arrayA = {23, 47, 81, 95};
        int[] arrayB = {1, 7, 7, 55, 63, 78};
        int[] arrayC = new int[10];

        System.out.println("The Sort is shown below:");

        merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
        for (int i : arrayC) {
            System.out.println(i);
        }
    }

    public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
        int arrayAIndex = 0, arrayBIndex = 0, arrayCIndex = 0;

        while (arrayAIndex < sizeA && arrayBIndex < sizeB) {
            if (arrayA[arrayAIndex] < arrayB[arrayBIndex]) {
                arrayC[arrayCIndex++] = arrayA[arrayAIndex++];
            } else {
                arrayC[arrayCIndex++] = arrayB[arrayBIndex++];
            }
        }
        while (arrayAIndex < sizeA) {
            arrayC[arrayCIndex++] = arrayA[arrayAIndex++];
        }
        while (arrayBIndex < sizeB) {
            arrayC[arrayCIndex++] = arrayB[arrayBIndex];
        }
    }
}
