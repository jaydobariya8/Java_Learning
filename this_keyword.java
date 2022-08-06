public class this_keyword {
    public static void main(String[] args) {
        
        keyword key = new keyword(5);
        key.geta();
    }
}
class keyword{
    int a;
    keyword(int a){
 // in this case we have 2 same name refrence thats why we use this to point a main a in class 
        this.a = a;
    }
    public void geta(){
        System.out.println("a is :" + a);
    }
}