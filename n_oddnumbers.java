public class n_oddnumbers {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " is a ODD number");
            } else {
                System.out.println(i + " is a Even number");
            }
        }

        primeNumber(n);
    }

    public static void primeNumber(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            count=0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i+ " prime number");
            } 
        }
    }
}
