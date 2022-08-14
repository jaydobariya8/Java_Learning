public class try_catch {
    public static void main(String[] args) {
        int a = 2000;
        int b = 0;

        // without try and catch is giving error 
        // int c = a/b;
        // System.out.println(c);
        
        try {
            int c = a/b;
            System.out.println(c);
            
        } catch (Exception e) {
            System.out.print("you program is not runnnig because of : " + e);
        }
    }
}
