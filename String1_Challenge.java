public class String1_Challenge {
    public static void main()
    {
        String str ="aaa*bbb";
        //aaa*bbb => ababab
        output(str);
    }

    public static void output(String str) {

        String s = "";
        int a = str.indexOf('*');
        System.out.println(a);
        
    }
}
