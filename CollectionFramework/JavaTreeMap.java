package CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMap {
    /**
     * Là 1 lớp kế thừa AbtractMap và implements NavigableMap
     * Đặc điểm:
     *  + Có tất cả đặc điểm của Map Interface
     *  + KHÔNG cho phép key null, value vẫn đc phép có giá trị null
     *  + Duy trì phần tử đc thêm vào và theo thứ tự key tăng dần
     */
    public static void main(String[] args) {
        Map<Integer, String> myMap = new TreeMap<Integer, String>();
        for (int i=0; i<10; i++) {
            myMap.put(i, String.format("Phần tử thứ %d", i));
        }

        for(Map.Entry<Integer, String> entry: myMap.entrySet()) {
            System.out.println(String.format("Key: %s | Value: %s", entry.getKey(), entry.getValue()));
        }

        // Xóa phần tử
        myMap.remove(0);
        
        // Thử thêm key null
        try {
            myMap.put(null, "Tét 123"); // Báo lỗi
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println(myMap);
        }
    }
}
