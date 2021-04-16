package MyJavaThread;

public class MyThreadKeThua extends Thread {
    public static void main(String[] args) {
        MyThreadKeThua thread = new MyThreadKeThua();
        thread.start();   
    }
    
    public void run() {
        System.out.println("Thread is running");
    }
}