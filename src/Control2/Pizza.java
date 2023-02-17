package Control2;

public class Pizza {
    public static void cookVeganPizza() throws InterruptedException {
        Base base = new Base();
        Tomatoes tomatoes = new Tomatoes();
        Tofu tofu = new Tofu();
        Bake bake = new Bake();

        java.util.List<Thread> stepOfCook = new java.util.ArrayList<>();

        stepOfCook.add(base);
        stepOfCook.add(tomatoes);
        stepOfCook.add(tofu);
        stepOfCook.add(bake);

        for (Thread step : stepOfCook) {
            //Thread.sleep(1000L);
            step.start();
            step.join();
        }
    }
}
