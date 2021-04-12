package JavaInner;

public class StaticNested {
    /**
     * 1 lớp static được viết bên trong 1 lớp khác được gọi là: Static Nested (Static Inner)
     * Đặc điểm: 
     *  + Nó chi có thể truy cập thành viên dữ liệu (thuộc tính, phương thức) dạng static
     */
    static int data = 30;
    int myAge = 27; // Statied Nested sẽ không call đc thuộc tính này

    static class Inner {
        void msg() {
            System.out.println("Data is: " + getMyName());
        }
    }

    public static void main(String[] args) {
        StaticNested.Inner sn = new StaticNested.Inner();
        sn.msg();    
    }
    
    // Static Nested cũng ko thể gọi phương thức này <bởi vì phương thức này ko cùng kiểu static> với static inner
    String getMyName() {
       return "Get My Name Method";
    }
}
