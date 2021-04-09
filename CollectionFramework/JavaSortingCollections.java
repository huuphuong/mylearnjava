package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaSortingCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("PHP");
        list.add("C++");
        list.add("C#");

        Collections.sort(list);
        System.out.println(list);

        // Sắp xếp ngược không có hàm nên phải build hàm
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // o2 > o1
            }
        });

    }
}
