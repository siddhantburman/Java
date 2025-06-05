class MyRunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName() + "hiii");
    }
}
public class DemoFixed {
    public static void main(String[] args) {
        MyRunnable obj= new MyRunnable();
                 Thread t1= new Thread(obj);
                 t1.start();
                 System.out.println("hello");
        
    }

 
}
