import java.util.Arrays;

public class A2_PairsSum {
    // Find Pairs with the given sum in a Sorted array
    // we need to find all pairs in the array that sum in a number equal to k.
    // if no such pairs exists then soutput will be -1;
    // Array elements are distinct and in sorted order
    // Time complexity is o(n);
    public static void main(String[] args) {
        int [] arr ={7,5,6,4,3,2,1,9};
        Arrays.sort(arr);//12345679
        int sum =9;

        int low =0;
        int high = arr.length-1;

        while(low<high)
        {
            if(arr[low] + arr[high]<sum)
            {
                low++;
            }
            else if(arr[low]+arr[high]>sum)
            {
                high --;
            }
            else if(arr[low]+arr[high]== sum)
            {
                System.out.println("{" +arr[low] +","+ arr[high]+ "}");
                low++;
                high --;
            }
            else
            {
                System.out.println(-1);
            }
        }

    }
}
