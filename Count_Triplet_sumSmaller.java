public class Count_Triplet_sumSmaller {
    public static void main(String[] args) {
        
        int arr[] ={1,3,5,8,12,15,50};
        int count =0;
        for(int k = 0 ;k<arr.length -2;k++)
        {
            int i = k+1;
            int j = arr.length-1;
         
            while(i<j)
            {
                int sum = 20 ;
                int s = arr[k] + arr[i] +arr[j];
                if(s<sum)
                {
                count+=(j-i);
                i++;
                }
                else{
                    j--;
                }
            }
        }
        System.out.println(count);
    }
}
