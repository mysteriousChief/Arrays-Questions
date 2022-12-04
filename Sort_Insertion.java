import java.util.Arrays;

public class Sort_Insertion {
    public static void main(String[] args) {
        int[] arr ={7,3,1,8,5,6,4};
       insertion(arr);
    }

    public static void insertion(int[] arr) {
            
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;

            while(0<=j && temp<arr[j])
            {
                 arr[j+1] =arr[j];
                 j--;
            }
            arr[j+1] = temp;
        }

        
        for (int i : arr) {
        System.out.print(i+" ");
    }
}
}
