package MyJavaThread;

public class ThreadScheduler extends Thread {
    /**
     * Test luôn phương thức sleep 
     * 1. Trong một thời điểm - CHỈ CÓ 1 THREAD đc chạy
     * 2. khi ts sleep -> hệ thống phát hiện ts đang ngủ và nó thấy đc t2 bắt đầu 
     *  chạy và ts2 chạy
     *  ts2 chạy và ngủ => hệ thống thấy ts lại wake-up và chạy ts
     * 
     * Tương tự như vậy, output sẽ là kết quả in song song của cả 2 luồng
     * 0
     * 0
     * 1
     * 1
     * 2
     * 2
     * 3
     * 3
     * 4
     * 4
     */
    public static void main(String[] args) {
        ThreadScheduler ts = new ThreadScheduler();
        ThreadScheduler ts2 = new ThreadScheduler();

        ts.start();
        ts2.start();
    }

    public void run() {
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println(i);
        }
    }
} // End class
