public class abstart_class {
    public static void main(String[] args) {
        // we cannot make object of an abstart class but we create reference 
        // Parent p = new Parent(); -- error
        // Child1 c1 = new Child2(); -- error
        Child c = new Child();
        c.greet();
        c.greet2();

    }
}
abstract class Parent{
    public Parent(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child1 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}