package JavaString;

public class JavaStringBuffer {
    /**
     * Được sử dụng để tạo chuỗi có thể thay đổi
     * @param args
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");

        // Thêm 1 chuỗi vào đuôi của chuỗi gốc
        // sb.append("Java"); // Hello Java
        
        // Chèn thêm chuỗi con vào 1 vị trí chỉ định của chuỗi gốc
        //sb.insert(1, "Java"); // HJavaello

        // Xóa chuỗi còn trong chuỗi gốc với vị trí <start, end-1> chỉ định
        //sb.delete(1, 3); // Hlo

        // Đảo ngược chuỗi
        sb.reverse(); // olleH
        System.out.println(sb); 

        // Trả về dung lượng của bộ nhớ đệm, nếu số lượng ký tự trong chuỗi tăng lên thì = (dung lượng cũ * 2) + 2
        // Mặc định khi khởi tạo buffer, dung lượng bộ nhớ đệm là 16 <empty contracutor>
        
        System.err.println("Dung lượng bộ nhớ đệm: " + sb.capacity());
        sb.append("Hit you with that ddu du ddu du");
        System.out.println("Dung lượng bộ nhớ đệm sau khi thay đổi giá trị buffer: " + sb.capacity()); // 46

        // ensureCapacity() Đảm bảo dung lượng đã cho là tối thiểu với dung lượng hiện tại: ca
        sb.ensureCapacity(50); // Dung lượng đã cho là 50
        
        
        // 46 < 50: Dung lượng đã cho ít hơn dung lượng hiện tại
        // dẫn đến bộ nhớ đệm sẽ được cấp thêm theo công thức (dung lượng hiện tại * 2) + 2 
        System.out.println("Check ensure buffer: " + sb.capacity());  // (46*2) + 2 =94
    }
}
