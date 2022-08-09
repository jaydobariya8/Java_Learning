interface MyCamera{
    void takeSnap();
    default void record4KVideo(){
        System.out.println("Recording in 4k...");
    }
}
class MySmartPhone implements MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
   public void record4KVideo(){
       System.out.println("Taking snap and recoding in 4k");
   }
}
public class polymorphism {
    public static void main(String[] args) {

        MyCamera cem = new MySmartPhone();  // -----> create base class reference with master class object
        cem.takeSnap();
        //cem.recordVideo(); ----> can't use base reference with master class

        MySmartPhone ms = new MySmartPhone();
        ms.takeSnap();
        ms.record4KVideo();
    }
}
