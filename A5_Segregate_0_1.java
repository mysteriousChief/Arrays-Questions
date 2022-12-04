public class A5_Segregate_0_1 {

    // Segregate 0s and 1s in the array
    // 0s left side and 1s right side
    public static void main(String[] args) {

        int [] arr ={0,1,0,1,0,0,1};
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                arr[j++] = arr[i]; 
            }
        }
        while(j<arr.length)
        {
            arr[j++] =1;
        }
        
        
        for ( j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
