
class emplyee{
    int salary;
    String name;
    
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}


class cellPhone{
    public void ringing(){
        System.out.println("Ringing");
    }
    public void vibrating(){
        System.out.println("vibrating");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class tommy{
    public void hit(){
        System.out.println("hiting the enemy");
    }
    public void run(){
        System.out.println("runing the enemy");
    }
    public void fire(){
        System.out.println("fireing the enemy");
    }
}

public class oops_basic_prectice_set {
    public static void main(String[] args) {
        // problem 1
        emplyee jay = new emplyee();
        jay.setName("Jay dobariya");
        jay.salary =10000;
        // System.out.println(jay.getName());
        // System.out.println(jay.getSalary());

        // problem 2
        cellPhone iPhone = new cellPhone();
        // iPhone.ringing();
        // iPhone.vibrating();

        // problem 3
        square sq = new square();
        sq.side = 3;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());

        // problem 4
        tommy game = new tommy();
        game.run();
        game.fire();
        game.hit();
    }
}
