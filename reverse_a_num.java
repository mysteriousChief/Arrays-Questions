public class reverse_a_num {
    public static void main(String[] args) {
        String str = "123";
        reverse(str);
    }

    public static void reverse(String str) {
        
        String s ="";
        int n = str.length();
        for (int i = n ; i>0;i--) {
         s= s+str.charAt(i-1);
            
        }
        System.out.println(s);
    }
}

