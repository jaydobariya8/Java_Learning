public class Constructor_in_inheritance {
    public static void main(String[] args) {
        
    // base b1 = new base();
    // derived d1 = new derived(3,5);
    child_of_derived c1 = new child_of_derived(4,6,8);

    }
}
class base{
    base(){
        System.out.println("base class constructor");
    }
    base(int a){
        System.out.println("constructor with arugument a: "+a);
    }
}
class derived extends base{
    derived(){
        System.out.println("derived class constructor");
    }
    derived(int a,int b){
        super(a);
        System.out.println("constructor with arugument b: "+b);
    }
}
class child_of_derived extends derived{
    child_of_derived(){
        System.out.println("child class with no args");
    }
    child_of_derived(int a,int b, int c){
        super(a,b);
        System.out.println("constructor of child class with c: "+c);
    }
}
