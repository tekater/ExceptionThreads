package Example2;

import java.util.concurrent.TimeUnit;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new HelloThread();
        System.out.println("awea");
        thread.start();

        TimeUnit.SECONDS.sleep(5);
        thread.join();
        System.out.println("I`m printed");

    }
}
