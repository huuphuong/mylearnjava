package MyJavaThread;

public class MyThreadNaming extends Thread {
    public static void main(String[] args) {
        MyThreadNaming t1 = new MyThreadNaming();
        MyThreadNaming t2 = new MyThreadNaming();

        t1.start();
        t2.start();

        t1.setName("Auto Find Umaghe");
        System.out.println("t1 after changing name is: " + t1.getName());
        System.out.println("t2 name is : " + t2.getName());
    }

    public void run() {
        // System.out.println("running...");

        // Lấy name của thread hiện tại
        String currentThreadName = Thread.currentThread().getName();
        System.out.println("Current thread name is: " + currentThreadName);
    }
}
