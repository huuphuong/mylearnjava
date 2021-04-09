package CollectionFramework;

import java.util.EnumMap;
import java.util.Map;

public class JavaEnumMap {
    /**
     * Là một cài đặt chuyên biệt để sử dụng với các enum keys 
     *  Có nghĩa là: các giá trị trong enums sẽ coi là 1 keys, và mình có thể set value thông qua key đó
     * Kế thừa AbstractMap
     * @param args
     */
    
    public enum Days {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    };

    public static void main(String[] args) {
        EnumMap<Days, String> enumMap = new EnumMap<Days, String>(Days.class);
        enumMap.put(Days.Monday, "Day la thu hai");
        enumMap.put(Days.Tuesday, "Day la thu ba");
        enumMap.put(Days.Wednesday, "Day la thu tu");

        for(Map.Entry<Days, String> entry: enumMap.entrySet()) {
            System.out.println("KEY: " + entry.getKey() + " | Value: " + entry.getValue());
        }
    }
}
