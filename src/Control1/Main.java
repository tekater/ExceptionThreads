package Control1;

public class Main {
        public static void main(String args[]) throws InterruptedException {

            Thread t1 = new SlackerThread();

            Thread t2 = new SlackerThread();

            t1.start();

            t2.start();

            t2.join();

            Thread t3 = new SlackerThread();

            Thread t4 = new SlackerThread();

            t3.start();

            t4.start();

            t3.join();

            t4.join();

        }

    }

