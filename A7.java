import java.util.*;

public class A7 {
    public static void main(String[] args) {
        int n = 5;
        int m = 2;
        int d = 1;

        int[] arr = new int[n];
        // Scanner sc = new Scanner(System.in);
        // for(int i=0 ; i<n ; i++)
        // {
        // arr[i] = sc.nextInt();
        // }
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 0;

        for (int i : arr) {
        System.out.print(i+" ");
        }

        System.out.println("Without Special power :");
        int i = 0;
    //     for(int j =0 ; j<n-1;j++){
    //     for (i = 0; i < n-1; i++) {
    //         int w;
    //         if (arr[i] + arr[i + 1] < 12) {
    //             System.out.print((w = arr[i] + arr[i + 1])+ " ");
    //         }

    //     }
    // }

    int sum =arr[0];
    for (int j = 1; j < arr.length; j++) {
        sum = sum +arr[j];
        System.out.print(sum + " ");
    }

    }
}
