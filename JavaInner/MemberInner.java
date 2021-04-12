package JavaInner;


public class MemberInner {
    /**
     * Lớp inner lồng trong outter
     *  + Có thể truy cập đến toàn bộ phương thức của lớp outter kể cả private
     */
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("Data is: " + data);
        }
    }

    public static void main(String[] args) {
        MemberInner mb = new MemberInner();
        MemberInner.Inner in = mb.new Inner();
        in.msg();
    }
}
