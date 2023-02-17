package Example2;

public class HelloThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println(2 / 0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
