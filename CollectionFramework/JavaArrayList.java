package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayList {
    /**
     * Là lớp kế thừa AbtractList và implement interface List
     * Đặc điểm: 
     *  + Chứa các phần tử trùng lặp
     *  + Có thể thêm bớt phần từ
     *  + Có thể truy cập phần tử theo index (chỉ muc)
     *  + Thao tác chậm về hiệu năng vì khi có sự thay đổi <xóa phần tử> sẽ phải đánh lại index 
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<String>();
        listString.add("PHP");
        listString.add("JAVA");
        listString.add("Python");
        listString.add(2, "Scala");
        

        ArrayList<String> listB = new ArrayList<String>();
        listB.add("PHP");
        listB.add("C++");
        listB.add("Python");

        // listString.retainAll(listB);
        // System.out.println(listString);
        System.out.println("============= Duyệt qua từng phần tử =============");
        Iterator<String> itr = listString.iterator();
        while(itr.hasNext()) {
            System.out.println((String) itr.next());
        }

        // Truy cap phan tu
        System.out.println("=========== Truy cập phần tử thứ: 0 của listB ========");
        System.out.println(listB.get(0)); // PHP

        // Xóa các phần tử của listB ra khỏi list gốc
        System.out.println("=========== Xóa phần tử listB ra khỏi list gốc ========");
        listString.removeAll(listB); 
        System.out.println(listString); // JAVA, Scala

        System.out.println("============ Cập nhật giá trị phần tử ===========");
        listString.set(1, "SQL");
        System.out.println(listString); // JAVA, SQL
    }
}
