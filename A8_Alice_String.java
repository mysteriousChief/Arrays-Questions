import java.util.Arrays;

import java.util.Collections;

public class A8_Alice_String {
    public static void main(String[] args) {
        int n = 3;
        Integer arr[] = { 3, 9, 5 };
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int max = 0;
        int len = arr.length;
        System.out.println(len);
        // int i=0;
        // while(i<n)
        // {
        // len = arr.length;
        // max = arr[i] * len--;
        // }
        // System.out.println(max);
        while (n > 0) {
            for (int i = 0; i < n; i++) {

                max = max + (arr[i] * n);
                System.out.println(max);
            }
            n--;
        }

    }
}
