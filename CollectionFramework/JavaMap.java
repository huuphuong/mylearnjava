package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaMap {
    /**
     * Map được dùng để lưu trữ và truy xuất dữ liệu theo dạng key value.
     * Mỗi cặp key value đc gọi là một entry (mục nhập)
     * key là duy nhất (Nếu cố tình đè key vào key cũ thì sẽ nhận giá trị mới)
     * 
     * Tương tự với Set: Map cũng là 1 interface và đc implement bởi: HashMap, LinkedHashMap, TreeMap, EnumMap
     * @param args
     */
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("Phuong", 17);
        myMap.put("Hong", 18);
        myMap.put("Ngoc", 20);
        myMap.put("Phuong", 15);
        
        Set<String> set = myMap.keySet();  // Tập con của Map là 1 String (tương ứng với tham số String trong Map lúc định nghĩa)
        for (String key : set) {
            System.out.println("key: " + key + " | Value: " + myMap.get(key));
        }

        // Cách lặp thứ hai sử dụng Map.Entry Interface
        System.out.println(" =========== USE MAP ENTRY ========== ");
        for (Map.Entry<String, Integer> entry: myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
    }
}
