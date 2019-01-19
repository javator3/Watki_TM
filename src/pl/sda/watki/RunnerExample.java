package pl.sda.watki;

public class RunnerExample extends Thread {
    private int number;

    public RunnerExample(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Number =" + getNumber());
    }

    public int getNumber() {
        return 2 * number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
