package Recursion;

public class recursion {

    public static int sum1ton(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum1ton(n - 1);
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void patternPrintingRightTriangle(int n) {
        if (n == 0) {
            return;
        }
        
        patternPrintingRightTriangle(n - 1);

        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void patternPrintingRightTriangleReverse(int n) {
        if (n == 0) {
            return;
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        patternPrintingRightTriangleReverse(n - 1);
    }

    /*
     * 12345
     * 1234
     * 123
     * 12
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */

    public static void patternPrintingRightTriangleReverseMirror(int n) {
        if (n == 0) {
            System.out.println(1);
            return;
        }else if(n == 1){
            System.out.println(1);
            return;
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        patternPrintingRightTriangleReverseMirror(n - 2);

        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public static int power(int n, int p) {
        if (p == 0) {
            return 1;
        }
        return n * power(n, p - 1);
    }

    public static int powerOptimized(int n, int p) {
        if (p == 0) {
            return 1;
        }
        int temp = powerOptimized(n, p / 2);
        if (p % 2 == 0) {
            return temp * temp;
        } else {
            return n * temp * temp;
        }
    }

    public static void toh(int n, char src, char aux, char dest) {

        if (n == 0) {
            return;
        }

        toh(n - 1, src, dest, aux);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        toh(n - 1, aux, src, dest);
       
    }


    
    public static void main(String[] args) {
        // patternPrintingRightTriangle(5);
        // patternPrintingRightTriangleReverseMirror(1);
        // toh(7, 'A', 'B', 'C');
    }
}


