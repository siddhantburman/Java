 class WithdrawThread extends Thread {
    static int totalbalance= 1000;
    int amount;

    public WithdrawThread(int amount){
        this.amount=amount;
    }

    public void run(){
        if(totalbalance>=amount){
               System.out.println("is going to withdrawal"+" " + amount);
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            totalbalance-=amount;
             System.out.println("Remaining paisaaaaaaa" +"  "+ totalbalance);
        }
        else{
             System.out.println(" sorry aap gareeb haiii !!!!");

        }
    }


    
}
public class DemoFixed1{
  
    public static void main(String[] args){
        WithdrawThread t1=new WithdrawThread(800);
        WithdrawThread t2=new WithdrawThread(500);
        t1.start();
        try{
            t1.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        t2.start();

    }

    
}