package CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;
import CollectionFramework.extra.Student;;

public class JavaLinkedHashSet {
    /**
     * Là một bản cài đặt bảng băm & danh sách liên kết của giao diện Set
     * 
     * Chứa các phần tử duy nhất <Vì implemenet Set interface>
     * Cho phép có phần tử null
     * Duy trì thứ tự chèn
     * @param args
     */
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");
        linkedHashSet.add("Python");
       
        System.out.println(" ========= PRINT PHẦN TỬ ========= ");
        for (String item : linkedHashSet) {
            System.out.println(item);
        }

        System.out.println(" ========= LINKED HASH SET VỚI ĐỐI TƯỢNG STUDENT ========= ");
        Set<Student> students = new LinkedHashSet<Student>();
        Student s1 = new Student(1, "Phuong", "Nam");
        Student s2 = new Student(2, "Hai", "Nam");
        Student s3 = new Student(3, "Ngoc", "Nu");
        Student s4 = new Student(4, "Hien", "Nu");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        String fm = "";
        for (Student student : students) {
            fm += String.format("\n\n ID: %d,\n Name: %s,\n Gender: %s", student.getId(), student.getName(), student.getGender());
            System.out.println(fm);
        }
    }
} // End class
