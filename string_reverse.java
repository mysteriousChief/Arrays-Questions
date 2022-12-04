
public class string_reverse {
public static void main(String[] args) {
    String str = "525";
    Reverse(str);
    //Number_Reverse(123);
}

public static void Number_Reverse(int n) {
   
    int ans =0;
    while(n != 0 || 0<n)
    {
        int rem = n%10;
        ans =ans*10+rem;
        n=n/10;
    }
    System.out.println(ans);
}

public static void Reverse(String str) {
//o(n)
//4
String s ="";
int len = str.length()-1;
for (int i= len; 0<=i;i--) {
   s = s+str.charAt(i) ;
}
System.out.println("Reverse String is :"+ s);
System.out.println("-------------------------------------");

 StringBuilder sb = new StringBuilder();
//  sb.reverse();
//  s = sb.toString();
//  System.out.println(s);
sb.append(str);
sb.reverse();
s = sb.toString();
System.out.println(s);
if(str.equals(s))
{
    System.out.println("Palindrome");
}
else{
    System.out.println("Not");
}
System.out.println("-------------------------------------");

char[] ch = str.toCharArray();
for (int i=ch.length-1; 0<=i;i--) {
    s = s+ch[i] ;
 }
 System.out.println(s);


}
}
