import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class parcels {
    public static void main(String[] args) {
        // Given N buckets, each containing A[i] items. Given K tours 
        // within which all of the items are needed to be delivered. 
        // It is allowed to take items from only one bucket in 1 tour. 
        // The task is to tell the minimum number of items needed to be
        // delivered per tour so that all of the items can be delivered
        // within K tours. 
        // Conditions : K >= N 

        
        int a[] = {1, 3, 5, 7, 9  };
 
        int n = a.length;
 
        int k = 10;

        if (getMin(a, n, k) == -1)
            System.out.println("Not Possible");
        else
            System.out.println(getMin(a, n, k));
        

    }

    public static int getMin(int[] A, int N, int K) {
       
        
            // Iterating through each possible
            // value of minimum Items
            int maximum = 0, tours = 0;
     
            for (int i = 0; i < N; i++)
                maximum = Math.max(maximum, A[i]);
     
            for (int i = 1; i < maximum + 1; i++) {
                tours = 0;
                for (int j = 0; j < N; j++) {
                    if (A[j] % i == 0) // perfecctly Divisible a[] = {1, 3, 5, 7, 9  };
                    {
                        tours += A[j] / i;
                        System.out.println("Perfectly divisible : "+ i +" "+ tours+" ");
                    }
                    else {
                        // Not Perfectly Divisible means
                        // required tours are Floor Division + 1
                        tours += Math.floor(A[j] / i) + 1;
                        System.out.println(" Not Perfectly divisible : "+tours+" ");
                    }
                }
                if (tours <= K) {
                    // Return First Feasible Value found,
                    // since it is also the minimum
                    return i;
                }
            }
     
            return -1;
        }
    }
