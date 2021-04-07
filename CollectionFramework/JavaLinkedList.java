package CollectionFramework;

import java.util.LinkedList;

public class JavaLinkedList {
    /**
     * Kế thừa AbtractSequentialList và implement List, Queue Interface
     * Sử dụng cấu trúc danh sách liên kết đôi Doubly để lưu trữ phần tử
     * Đặc điểm:
     *  + Có thể chứa các phần tử trùng lặp
     *  + Duy trì thứ tự của phần tử thêm vào
     *  + Bất đồng bộ
     *  + Thao tác nhanh vì ko phải đánh lại index nếu có hành động xóa phần tử
     *  + Có thể sử dụng là 1 list (danh sách), ngăn xếp (stack) hoặc hàng đợi (queued)
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        list.add("Python");
        System.out.println(list);
        for (String item : list) {
            System.out.println(item);
        }

        // Chèn toàn bộ phần tử của linked list này cho 1 linked list khác
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("C++");
        listB.add("Python");
        System.out.println(" ========== Danh sách phần tử listB ========== ");
        System.out.println(listB);

        // Xóa hết phần tử khỏi list với điều kiện các phần tử đó PHẢI NẰM TRONG listB
        // System.out.println("============ Xoa het phan tu khoi list ========== ");
        // list.removeAll(listB);
        // System.out.println(list); // [Java, PHP, Python]

        // Xóa phần tử thuộc list gốc với điều kiện các phần tử đó KHÔNG NẰM trong listB
        System.out.println(" ========== Xoa het phan tu khoi list retianAll ========== ");
        list.retainAll(listB);
        System.out.println(list); // [C++, Python]

        // Xóa phần tử của list
        System.out.println(" ========== Xoa 1 phan tu khoi list goc ========== ");
        list.remove(1);
        System.out.println(list); // [C++]

         // Xóa toàn bộ phần tử của list
        System.out.println(" ========== Xoa toan bo phan tu khoi list goc ========== ");
        list.clear();
        System.out.println(list); // []
        
    }
} // End class
