package JavaInner;

public class JavaNestedInterface implements iShowable.Message {
    /**
     * 1 interface nằm trong 1 interface hoặc nằm trong 1 class khác được gọi là: Nested Interface
     * Lưu ý:
     *      + Nếu Nested Interface nằm trong outter Intterface thì phải public mọi thứ
     *      + Nếu Nested Interface nằm trong outter Class thì có thể có access modifier khác: 
     *              VD: protected, private, default...
     *      + Nested Interface đc khai báo static một cách hiển nhiên
     * @param args
     */
    public static void main(String[] args) {
        iShowable.Message jvni = new JavaNestedInterface();
        jvni.msg();
    }

    public void msg () {
        System.out.println("Hello nested interface - method msg()");
    }
}
