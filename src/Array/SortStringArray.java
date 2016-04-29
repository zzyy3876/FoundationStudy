package Array;

/**
 * Created by zzyy3_000 on 4/11/2016.
 * MergeSort String Arrays (Integer Array).
 */
public class SortStringArray {
    public static void main(String[] args) {
        String[] A = {"Kring", "Panda", "Soliel", "Darryl", "Chan", "Matang", "Jollibee.", "Inasal"};
        String[] B = {"Minnie", "Kitty", "Madonna", "Miley", "Zoom-zoom", "Cristine", "Bubbles", "Ara", "Rose", "Maria"};
        String[] C = new String[A.length + B.length];

        mergeSort(A);
        mergeSort(B);
        merge(A, B, C);
        mergeSort(C);

        for (String ClassThree : C) {
            System.out.println(ClassThree);
        }
    }

    public static void mergeSort(String[] C) {
        if (C.length > 1) {
            String[] left = new String[C.length / 2];
            String[] right = new String[C.length - (C.length / 2)];

            for (int i = 0; i < left.length; i++) {
                left[i] = C[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = C[i + C.length / 2];
            }
            mergeSort(left);                 //recursive
            mergeSort(right);                //recursive
            merge(left, right, C);
        }
    }

    public static void merge(String[] left, String[] right, String[] C) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < C.length; i++) {
            if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
                C[i] = left[a];
                a++;
            } else {
                C[i] = right[b];
                b++;
            }
        }
    }
}
