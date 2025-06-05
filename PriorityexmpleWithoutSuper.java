class MyThread extends Thread{
    public void run(){
        for (int i = 1; i<= 10; i++) {
            System.out.println(getName() + "is running with priority");
            Thread.yield();
        }
    }
}
public class PriorityexmpleWithoutSuper {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("low priority Thread");
        t2.setName("high priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }
    
}
