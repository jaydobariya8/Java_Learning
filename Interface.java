interface Bicycle{
    int a = 45;
    void applyBrake();
    void speedUp();
}

interface HornBicycle{
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(){
        System.out.println("Applying Brake");
    }
    public void speedUp(){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}

public class Interface {
    public static void main(String[] args) {
        

        AvonCycle jaycycle = new AvonCycle();
        jaycycle.applyBrake();
        // You can create properties in Interfaces
        System.out.println(jaycycle.a);
        // You cannot modify the properties in Interfaces as they are final
        //  jaycycle.a = 45;
        //  System.out.println(jaycycle.a);
    }
}
