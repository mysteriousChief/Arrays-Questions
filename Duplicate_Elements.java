import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_Elements {
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,1,4};
        //1,4
       checkDuplicate(arr);
       
    }

    public static void checkDuplicate(int[] arr) {
        Set<Integer> duplicate = new HashSet<>();
        boolean flag = false;

        for(int i = 0 ; i<arr.length ; i++)
        {
            if(duplicate.contains(arr[i]))
            {
                 flag = true;
                System.out.println("duplicate element :"+ arr[i]);
            }
            else{
                duplicate.add(arr[i]);
            }
        }
        if(!flag)
        {
            System.out.println(-1);
        }
        
    }


}
