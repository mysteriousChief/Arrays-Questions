import java.lang.reflect.Array;
import java.util.Arrays;

public class A4_Delete_ele {
    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int pos = 2;
        // int temp = 0;
        // System.out.println("Array size before deleting element :" + size);
        // if (pos < 0 || pos > size) {
        //     System.out.println("Invalid Position");
        // }
        // for (int i = pos; i < size-1; i++) {//2<5

        //     temp = arr[i];
        //     arr[i] = arr[i + 1];
        // }
        // size--;//4
        // for (int i = 0; i < size; i++) {

        //     System.out.print(arr[i]+"");
        // }

        int [] arr1 = new int[size-1];
        for(int i=0;i<arr.length;i++)
        {
            if(i<pos)
            {
                 arr1[i]= arr[i];
            }
            else if(i==pos)
            {
                continue;
            }
            else{
                arr1[i-1] = arr[i];
            }
        }
        for (int j = 0; j < arr1.length; j++) {

                System.out.print(arr1[j]+"");
            }
       
    }
}
