public class method_override {

    // method overriding : redifine method of super class in sub class.. 
    
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.math2();
        b.math2();
    }
}

class A {
    public void math1(){
        System.out.println("this is methd 1");
    }
    public void math2(){
        System.out.println("this is methd 2 from main A");
    }
}
class B extends A{
    @Override
    public void math2(){
        System.out.println("this is methd 2 from override");
    }
    public void math3(){
        System.out.println("this is methd 3");
    }
}
