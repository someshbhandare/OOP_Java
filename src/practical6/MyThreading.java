package practical6;

public class MyThreading extends Thread {
    private int threadNumber;

    public MyThreading(int number){
        threadNumber = number;
    }

    @Override
    public void run() {
        for (int i=1; i <= 5; i++){
            System.out.println(i + " from thread " + this);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
