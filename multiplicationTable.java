public class multiplicationTable {
    public static void main(String[] args) {
 

        for (int j = 1; j <= 10; j++) {

            for (int i = 1; i <= 10; i++) {
                int res = j*i;

                System.out.println(j + "*" + i + "=" +res);
            }
            System.out.println();
        }
        // String s = "Aman";
        // char[] ch = s.toCharArray();
        // //coutLength(ch);
    }

    // public static void coutLength(char[] ch) {
    //     int count =0;
    //     for(int i=0; ch[i]!='\0';i++)
    //     {
    //         count++;
    //     }
    //     System.out.println(count);
    // }
}
