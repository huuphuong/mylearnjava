package JavaInner;

public class LocalInner {
    private int data = 50;
    /**
     * giống như tên
     * 1 lớp được viết ra từ trong PHƯƠNG THỨC CỦA LỚP KHÁC được gọi là local Inner
     * @param args
     */
    public static void main(String[] args) {
        LocalInner lci = new LocalInner();
        lci.showMessage();
    }

    void showMessage() {
        class MyLocal {
            void msg() {
                System.out.println("My local data can use: " + data);
            }
        }

        MyLocal lc = new MyLocal();
        lc.msg();
    }
}
