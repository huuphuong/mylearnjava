package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.border.StrokeBorder;

public class JavaSet {
    /**
     * Là 1 interface  kế thừa Collection Interface trong Java
     *  + Không thể chứa 2 giá trị trùng lặp
     *  + Được triển khai (implement) bởi HashSet, LinkedHashSet, TreeSet hoặc EnumSet
     *      1. HashSet lưu trữ phần tử trong HashTable (bảng băm), 
     *          tốt nhất nhưng KHÔNG ĐẢM BẢO được thứ tự phần tử mới đc thêm vào
     *      2. TreeSet lưu trữ phần tử trong 1 case, sắp xếp phần tử dựa trên giá trị, chậm hơn HashSet
     *      3. LinkedHashSet được triển khai dưới dạng HashTable với cấu trúc dữ liệu Danh sách liên kết,
     *          sắp xếp phần tử dựa trên thứ tự chúng đc thêm vào Tập hợp
     *      4. EnumSet đc dùng để sử dụng với các kiểu Enum
     * 
     */
    public static void main(String[] args) {
        Set<String> setA = new HashSet<String>();
        setA.add("Java");
        setA.add("Python");
        setA.add("PHP");

        // Không thêm được: vì Set không thể có 2 phần tử giống nhau, câu lệnh này không gây ra lỗi
        setA.add("Java"); 

        System.out.println(" =================== Cơ bản về Set ================== ");
        System.out.println("Danh sách phần tử:" + setA);
        System.out.println("setA chứa Java?: " + setA.contains("Java"));
        System.out.println("Số lượng phần tử của setA: " + setA.size());

        // Thêm 1 collection khác vào 1 set mới
        // 
        System.out.println(" =================== Chèn 1 tập hợp của Set sang 1 Set khác ================== ");
        Set<String> setB = new TreeSet<String>();
        setB.addAll(setA);
        System.out.println("Danh sách phần tử setB: " + setB);
        System.out.println("setB có giá trị hay không? " + setB.isEmpty());

        System.out.println(" =================== Convert Set thành List ================== ");
        List<String> listA = new ArrayList<String>();
        listA.addAll(setB); // Thêm được vì setB bản chất vẫn là 1 collection
        System.out.println(listA);
    }
}
