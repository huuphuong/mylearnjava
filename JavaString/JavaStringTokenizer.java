package JavaString;

import java.util.StringTokenizer;

public class JavaStringTokenizer {
    /**
     * Cho phép phân tách một chuỗi  thành các phần tử token của nó
     * Tham số thứ 3 (boolean): false => dấu phân cách không được tính là phần tử token
     *                          true => tính là phần tử token
     */
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Sài-Gòn-Đẹp---Lắm", "-", true);
        System.out.println("Tổng số token: " + st.countTokens());

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
