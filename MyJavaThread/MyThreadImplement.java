package MyJavaThread;

public class MyThreadImplement implements Runnable {
    public static void main(String[] args) {
        MyThreadImplement threadRunable = new MyThreadImplement();
        Thread t1 = new Thread(threadRunable);
        t1.start();
    }

    public void run () {
        System.out.println("Thread is running");
    }
}
