public class PracticeSet4 {
    static void multiply(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.format("%d X %d =%d\n", n, i, n * i);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static int sumRec(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRec(n - 1);
        }
    }

    static int fibonnaci(int n) {
        // 0,1,1,2,3,5,8,13,21,34,.....
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonnaci(n - 1) + fibonnaci(n - 2);
        }

    }

    static double  celcToFar(double  celsius){
        double fahrenheit = (celsius * 9/5) + 32;
       return fahrenheit;
    }

    public static void main(String[] args) {
        // Q1
        // multiply(7);

        // Q2
        // pattern1(10);

        // Q3
        // int c= sumRec(6);
        // System.out.println(c);

        // Q4
        // pattern4(5);

        // Q5
        // int result =fibonnaci(7);
        // System.out.println(result);

        // Q8
        // pattern1_rec(10);

        // Q9
        double result =celcToFar(8);
        System.out.println("Temperature in Farenheit :"+result);

    }
}
 