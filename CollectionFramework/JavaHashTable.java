package CollectionFramework;

import java.util.Hashtable;

public class JavaHashTable {
    /**
     * Kê thừa Dicionary
     * Là 1 mảng của list. Mỗi lỗi đc xác định bằng việc gọi phương thức hashcode()
     * Đặc điểm:
     *  + Lưu trữ dưới dưới cặp giá trị: key-value
     *  + Cả key và giá trị ĐỀU KHÔNG CHẤP NHẬN GIÁ TRỊ: NULL
     *  + Đồng bộ
     * 
     *  Về tốc độ: HashTable cho tốc dộ chậm hn so với HashMap
     *  Cộng với việc không cho phép bất kỳ key và giá trị null nào nên có thể dẫn tới lỗi trong quá trình code nhanh
     * @param args
     */
    public static void main(String[] args) {
        Hashtable<Integer, String> myHashTable = new Hashtable<Integer, String>();
        for (int i=1; i<=10; i++) {
            myHashTable.put(i, String.format("Phần tử thú %d", i));
        }

        System.out.println(myHashTable);

        // Thử thêm 1 phần tử key null
        // myHashTable.put(null, 1234);  // Lỗi
        // myHashTable.put(1212, null);  // Lỗi
        System.out.println(myHashTable);
    }
}
