package Control1;

public class SlackerThread extends Thread{
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hi");
    }
}
