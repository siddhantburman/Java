public class PriorityExample {    
    public static void main(String[] args){
        System.out.println("idher dekhoo");
        Thread t1= new Thread(()->{
            System.out.println("hello");
        });
        Thread t2= new Thread(()->{
            System.out.println("hiiii");
        });
        t1.start();
        t2.start();
    }
    
}
