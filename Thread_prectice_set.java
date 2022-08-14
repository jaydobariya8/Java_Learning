class Gm  extends Thread{
    public void run(){
    while(true){
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("good morning");
    }
    } 
}
class welcome  extends Thread{
    public void run(){
    while(true){
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("welcome");
    }
    } 
}

public class Thread_prectice_set {
    public static void main(String[] args) {
        Gm g = new Gm();
        welcome w = new welcome();
        g.setPriority(5);
        w.setPriority(8);
        System.out.println(w.getState());
        g.start();
        w.start();
        System.out.println(w.getState());
        System.out.println(w.currentThread().getState());
    }
}
