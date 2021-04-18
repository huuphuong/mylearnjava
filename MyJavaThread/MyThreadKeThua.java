package MyJavaThread;

public class MyThreadKeThua extends Thread {
    public static void main(String[] args) {
        MyThreadKeThua thread = new MyThreadKeThua();
        thread.setDaemon(true);
        thread.start();   
    }
    
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Day la luong hiem");
        }
        System.out.println("Thread is running");
    }
}