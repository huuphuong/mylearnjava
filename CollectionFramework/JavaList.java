package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    /**
     * Là 1 interface trong java, chưa các methdo để thêm, sửa xóa phần tử
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        JavaList myJavaList = new JavaList();
        myJavaList.addPhanTu(list);
        
        System.out.println("============ SHOW LIST ============");

        myJavaList.showPhanTu(list);
    }

    public void addPhanTu(List<String> list) {
        String luachon = "y";
        Scanner sc = new Scanner(System.in);
        while(luachon.toLowerCase() == "y") {
            System.out.print("\n Moi ban nhap phan tu: ");
            String item = sc.nextLine();
            list.add(item);
            
            System.out.println("Ban muon tiep tuc chu? Y: tiep tuc | Khac: Huy");
            String  tieptuc = sc.nextLine();
                    tieptuc = tieptuc.toLowerCase();
            if (!tieptuc.equalsIgnoreCase("y")) {
                luachon = "n";
            }
        }

        sc.close();
    }

    public void showPhanTu(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}
