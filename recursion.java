public class recursion {

    // find factorial using itarative method 
    static int recursion_for(int n){
        if (n==0 || n==1) {
            return 1;
        } 
        else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    // find factorial using recursion method 
    static int base_recursion (int n){
        if (n==0 || n==1) {
            return 1;
        } else {
            return n* base_recursion(n-1);
        }
    }

    public static void main(String[] args) {
        
        int x = 5;
        System.out.println("the factorial of x using recursion is : "+ base_recursion(x));
        System.out.println("the factorial of x is : "+ recursion_for(x));

    }
}
