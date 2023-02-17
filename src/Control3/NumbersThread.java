package Control3;

public class NumbersThread extends Thread{
    int form, to;
    public NumbersThread(int form, int to) {
        this.form = form;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = form; i <= to; ++i){
            System.out.println(i);
        }
    }
}
