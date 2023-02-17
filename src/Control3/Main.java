package Control3;

public class Main {
    public static void main(String[] args) {
        NumbersThread numbersThread = new NumbersThread(2,2);
        numbersThread.start();
    }
}
