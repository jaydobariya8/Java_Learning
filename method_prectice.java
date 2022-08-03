public class method_prectice {

    static void mult(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d \n",n,i,n*i);
        }
    }
    
    static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int sumRec(int n){
        if (n==1) {
            return 1;
        } else {
            return n + sumRec(n-1);            
        }
    }

    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static int fib(int n){
        if (n==1 || n==2) {
            return n-1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    static void average(int ...arr){
        int totalMarks =0;
        for (int i : arr) {
            totalMarks += i;
        }
        System.out.println("the avg is : "+totalMarks/arr.length);
    }

    static void pattern_ric(int n){
        if (n>0) {
            pattern_ric(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        // problem 1
        // mult(8);

        // problem 2
        // pattern(4);

        // problem 3
        // int c = sumRec(4);
        // System.out.println(c);

        // problem 4
        // pattern2(4);

        // problem 5
        // int c = fib(6);
        // System.out.println(c);

        // problem 6
        // average(78,60,56,91,80);

        // problem 7
        pattern_ric(4);
    }
}
