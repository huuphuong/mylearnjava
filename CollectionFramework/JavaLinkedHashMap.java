package CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

import CollectionFramework.extra.Student;

public class JavaLinkedHashMap {
    /**
     * Cũng khá giống với HashMap tuy nhiên LinkedHashMap CÓ duy trì & kiểm soát được phần tử theo thứ tự chèn
     */
    public static void main(String[] args) {
        Map<Integer, String> myMap = new LinkedHashMap<Integer, String>();
        for (int i=1; i<10; i++) {
            myMap.put(i, String.format("Phần tử thứ %d", i));
        }

        System.out.println(" ======= Danh sách phần tử trong map ======= ");
        for(Map.Entry<Integer, String> entry: myMap.entrySet()) {
            String msg = String.format("\t Key: %d | Value: %s", entry.getKey(), entry.getValue());
            System.out.println(msg);
        }

        System.out.println(" ======= Ví dụ về Map có value là 1 object Student ======= ");
        Map<Integer, Student> mySecondMap = new LinkedHashMap<Integer, Student>();
        mySecondMap.put(11, new Student(1, "Phuong", "Gender"));
        mySecondMap.put(22, new Student(1, "Phuong", "Gender"));
        mySecondMap.put(33, new Student(1, "Phuong", "Gender"));

        for(Map.Entry<Integer, Student> entry: mySecondMap.entrySet()) {
            Student currentStudent = entry.getValue();
            System.out.println(currentStudent.toString());
        }
    }
}
