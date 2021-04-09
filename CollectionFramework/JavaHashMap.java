package CollectionFramework;
import java.util.HashMap;
import java.util.Map;

public class JavaHashMap implements Cloneable {
    /**
     * Là 1 implements của Map Interface nên sẽ có đặc điểm lưu trữ cặp key: value làm phần tử
     * Có thể truy cập lấy value thông qua key
     * 
     * Đặc điểm:
     *  Key là duy nhất
     *  Key có thể là null 
     *  Các phần tử trong HashMap KHÔNG theo thứ tự
     */
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(1, "Java");
        myMap.put(2, "PHP");
        myMap.put(2, "SQL");
        myMap.put(3, "Golang");

        // Hiển thị thông tin phần tử của HashMap
        System.out.println("===== Hiển thị thông tin phần tử của HashMap ==== ");
        System.out.println(myMap);

        for(Map.Entry<Integer, String> entry: myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }

        // Một số phương thức trong HashMap
        System.out.println(" ===== Một số phương thức trong HashMap ==== ");
        System.out.println("\t myMap có chứa phần tử có giá trị là \"Java\" không?: " + myMap.containsValue("Java"));
        System.out.println("\t myMap có chứa phần tử có key là \"2\" không?: " + myMap.containsKey(2));
        System.out.println("\t Collection view ánh xạ: " + myMap.entrySet()); // Return collection
        System.out.println("\t Số lượng phần tử có trong HashMap là: " + myMap.size());
        myMap.clear();
        System.out.println("\t Toàn bộ phần tử sau khi clear(): " + myMap);
    }
}
