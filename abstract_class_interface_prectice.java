// ----------------------problem 1----------------------
abstract class pen{
    abstract void refil();
    abstract void write();
}
class celloPen extends pen {
    void refil(){
        System.out.println("refil the pen");
    }
    void write(){
        System.out.println("write.....!");
    }
    void changeRefil(){
        System.out.println("new refil...");
    }
}

// ----------------------problem 2----------------------
class monkey {
    void jump(){
        System.out.println("jump....");
    }
    void bite(){
        System.out.println("bite....");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicAnimal{
    void speak(){
        System.out.println("helloo......");
    }
    public void eat(){
        System.out.println("human eating...");
    }
    public void sleep(){
        System.out.println("sleeping....");
    }
}



public class abstract_class_interface_prectice {
    public static void main(String[] args) {
        // Q-1,2 
        celloPen pen = new celloPen();
        pen.write();
        pen.changeRefil();

        // Q-3 
        human jay = new human();
        jay.sleep();

        // Q-4
        monkey m = new human();
        m.bite();
        // m.speak(); ----> cannot use speak method because monkey is reference and its not have a speak method 

        basicAnimal b = new human();
        b.sleep();
        // b.speak(); ----> Error beacuse of polymorphism 

    }
}
