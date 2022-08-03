public class method_overloading {

    static String name(String s){
        System.out.println("hello how are you.."+s);
        return s; 
    }
    static void name(){
        System.out.println("hello how are you..");
    }

    public static void main(String[] args) {
        // Method overloading:- same name methods with diffrent perameter is called MO 
        name();
        name("jay");
    }
}
