
class MyThr1  extends Thread{
    public MyThr1  (String name){
        super(name);
    }
    public void run(){
    while(true){
        System.out.println("i am working on java" + this.getName());
    }
    } 
}

public class thread_priorities {
    public static void main(String[] args) {

        MyThr1  t1 = new MyThr1 ("jay most priorities");
        MyThr1  t2 = new MyThr1 ("meet");
        MyThr1  t3 = new MyThr1 ("raj");
        MyThr1  t4 = new MyThr1 ("rahul");
        MyThr1  t5 = new MyThr1 ("kumar");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
