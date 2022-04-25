package practical6;

import java.util.Arrays;

public class Test{
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            MyThreading myThread = new MyThreading(i);
            myThread.start();
        }
        
    }
}
