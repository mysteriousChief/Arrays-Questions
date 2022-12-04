public class A9_Second_Small_alarge {
    public static void main(String[] args) {
        int[] arr = { 8, 1, 4, 7, 10, 2 };
        small(arr);
        //large(arr);
    }

    public static void large(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int n = arr.length;
        // 8, 1, 4, 7, 10, 2
        if (arr.length < 2) {
            System.out.println("Element does't exist");
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] != largest && arr[i] > second_largest) {
                second_largest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(second_largest);
    }

    public static void small(int[] arr) {
           int smallest = Integer.MAX_VALUE;
           int second_smallest = Integer.MAX_VALUE;

           if(arr.length<2)
           {
            System.out.println("Second samllest element doesn't exist :");
           }
           else 
           { 
            // { 8, 1, 4, 7, 10, 2 }; //1,2,4,7,8,10
        
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]<smallest)
                {
                    second_smallest = smallest;
                    smallest = arr[i];
                }
                else if( arr[i] != smallest && arr[i]< second_smallest )
                {
                    second_smallest = arr[i];
                }
            }

            System.out.println(smallest);
            System.out.println(second_smallest);
           }
    }
}
