package Example1;

public class Main {
    public static void main(String[] args) {
        // если у нас однопоточная программа, то она выдаст исключение, а также
        // сразу прекратит выполнение
        // System.out.println(2 / 0);

        // код 1 означает, что процесс был завершён с ошибкой

        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at Example1.Main.main(Example1.Main.java:5)
        //
        //Process finished with exit code 1


    }
}