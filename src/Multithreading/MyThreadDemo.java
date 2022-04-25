package Multithreading;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread1");
        MyThread thread2 = new MyThread("Thread2");

        thread1.start();
        thread2.start();
    }
}

class MyThread extends Thread{
    String[] message = {"Java ", "is ", "very, ", "interesting, ", " and ", "invigorating"};
    MyThread(String name){
        super(name);
    }

    public void run(){
        String threadName = this.getName();
        for(int i=0; i<message.length; i++){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName+": "+message[i]);
        }
    }
}
