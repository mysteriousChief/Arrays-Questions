import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class h1 {
    public static void main(String[] args) {
        Integer [] arr = {3,9,5};//40
        Arrays.sort(arr);//3 5 9
        // Arrays.sort(arr,Collections.reverseOrder());
        // for (Integer i : arr) {
        //     System.out.print(i);
        // }
        int sum =0;
        // for (int i = 0; i <arr.length; i++) { //0 1 2
        //     sum +=(arr[i]*(i+1));
        // }
        int n = arr.length;
        for (int i =n ; i>0 ; i--) {
            sum += arr[i-1]* i;
        }
        System.out.println(sum);
    }
}
