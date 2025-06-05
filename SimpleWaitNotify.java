public class SimpleWaitNotify {

    private boolean isSignalled = false;

    public synchronized void sendSignal() {
        isSignalled = true;
        System.out.println("Producer: Sending signal...");
        notify();
    }

    public synchronized void waitForSignal() {
        while (!isSignalled) {
            try {
                System.out.println("Consumer: Waiting for signal...");
                wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Consumer: Got the signal! Proceeding...");
    }

    public static void main(String[] args) {
        SimpleWaitNotify obj = new SimpleWaitNotify();

        Thread consumer = new Thread(() -> {
            obj.waitForSignal();
        });

        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            obj.sendSignal();
        });

        consumer.start();
        producer.start();
    }
}
