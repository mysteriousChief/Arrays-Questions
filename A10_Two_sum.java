
import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;

public class A10_Two_sum {
    public static void main(String[] args) {

        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        // output 9

        int[] res = hashmap_approach(arr,target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] hashmap_approach(int[] arr , int target) {

        HashMap<Integer, Integer> hp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            hp.put(arr[i], 1);
        }

        // for(Map.Entry<Integer,Integer> entry : hp.entrySet())
        // {
        // System.out.println(entry +" ");
        // }

        for (int i = 0; i < arr.length; i++) {
            // key index get
            int num = arr[i];
            int rem = target - num;
            if (hp.containsKey(rem)) {
                int index = hp.get(rem);
                if(index==i)continue;
                return new int[] { i, index };
            }
        }
        return new int[]{-1,-1};
    }
}
