package CollectionFramework;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaProperties {
    /**
     * Cho phép LTV có thể đọc các giá trị config tự tạo: file.properties hoặc các properties của hệ thống
     * Có thể đọc(truy xuất) giá trị của properties thông qua key (values chỉ ở dạng String)
     * Khi thay đổi nội dung file .propeties thì ko cần phải biên dịch
     * P/s: Tính năng này khá giống với config trong Laravel
     */
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("db.properties");

            Properties properties = new Properties(); // System.getProperties();
            properties.load(reader);

            System.out.println(" ========= Lấy ra properties cụ thể ========== ");
            System.out.println(properties.getProperty("user"));
            System.out.println(properties.getProperty("password"));

            System.out.println("\n ========= Lấy ra tất cả properties ========== ");
            
            Set set = properties.entrySet();
            Iterator itr = set.iterator();

            while(itr.hasNext()) {
                Map.Entry entry = (Map.Entry) itr.next();
                System.out.println(entry.getKey() + "===" + entry.getValue());
            }

            // Tạo file properties
            System.out.println("\n ================= Tao File Properties ============== ");
            properties.setProperty("name", "phuong");
            properties.setProperty("AGE", "26");
            properties.store(new FileWriter("db.properties"), "Comment Here");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
