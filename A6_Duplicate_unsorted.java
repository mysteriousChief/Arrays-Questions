import java.util.Arrays;

public class A6_Duplicate_unsorted {
    public static void main(String[] args) {
        //  3 Approaches to solve this problem

        //  1.  Sorting 

         int [] arr ={5,3,2,1,4,1,5};
         Arrays.sort(arr);

         int j=0;
         for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!= arr[i+1])
            {
                arr[j++]=arr[i];
            }
         }
         arr[j++]= arr[arr.length-1];
         for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+ " ");
         }
         

    }
}
