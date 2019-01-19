package pl.sda.watki;

public class InfinityRunner extends Thread {

    @Override
    public void run() {
        while (true)
        {
            InfinityRunner infinityRunner = new InfinityRunner();
            infinityRunner.start();
        }
    }
}
