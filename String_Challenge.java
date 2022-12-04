public class String_Challenge {
    public static void main(String[] args)
    {
        String str ="aaa*bbb";
        //aaa*bbb => ababab
        output(str);
    }

    public static void output(String str) {

        String s = "";
        int a = str.indexOf('*');
        System.out.println(a);
        for (int i = 0; i <a; i++) {
            s = s+ str.charAt(i)+ str.charAt(i+a+1);
        }
        System.out.println(s);
        
    }
}
