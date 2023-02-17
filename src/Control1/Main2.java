package Control1;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Thread thread = new Threaded();
        try {
            Thread.sleep(5000);
            System.out.println(2 / 0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.start();
    }
}