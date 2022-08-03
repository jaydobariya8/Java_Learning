
public class var_args {

    // static int sum (int a, int b){
    //     return a+b;
    // }
    // static int sum (int a, int b,int c){
    //     return a+b+c;
    // }
    // static int sum (int a, int b,int c,int d){
    //     return a+b+c+d;
    // }
    
    // insted of writing diffrent method of every sum we can use var args like this 
    
    // we can add int a in start because we need atleast 1 argument 
    static int sum(int a,int ...arr){
        int result =0;
        for (int e : arr) {
            result += e;
        }
        result += a;
        return result;
    }

    public static void main(String[] args) {
    
    System.out.println("sum of 5 and 6: "+ sum(5,6) );
    System.out.println("sum of 5,6 and 7 is: "+ sum(5,6,7) );
    System.out.println("sum of 5,6,7 and 8 is: "+ sum(5,6,7,8) );
    System.out.println("sum of 5,6,7,8 and 88 is: "+ sum(5,6,7,8,88) );

    }
}
