class thred1 extends Thread{
    public void run(){
        int i = 0;
    while(i<=400){
        System.out.println("i am working on java");
        i++;
    }
    }
   
}
class thred2 extends Thread{
    public void run(){
        int i = 0;
        while(i<=400){
            System.out.println("happy with DSA");
            i++;
        }
    }
}
public class thread {
    public static void main(String[] args) {
        thred1 t1 = new thred1();
        thred2 t2 = new thred2();
        t1.start();
        t2.start();

    }
}
