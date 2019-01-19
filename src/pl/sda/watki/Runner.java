package pl.sda.watki;

public class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50 ; i++) {
            System.out.println("hello : "+i+" thread "+ Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
