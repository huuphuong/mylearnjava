package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import CollectionFramework.extra.Student;

public class JavaCompareable {
    /**
     * Compareable trong Java được dùng để so sánh các đối tượng
     * VD: So sánh tên của 2 đối tượng Stdeunt sắp xếp theo ASC hoặc DESC
     * @param args
     */
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student(1, "Phuong", "Nam");
        Student s2 = new Student(2, "Ngoc", "Nu");
        Student s3 = new Student(3, "Hoang", "Nam");
        Student s4 = new Student(4, "Hai", "Nam");
        Student s5 = new Student(5, "Xuan", "Nu");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println("\t ====> SORT BY NAME ASC ");
        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student.toString());
        }

        System.out.println("\t ====> SORT BY NAME DESC ");
        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                int result = o2.getName().compareTo(o1.getName());
                return result ;
            }
        });

        for (Student student : list) {
            System.out.println(student.toString());
        }
    }
}
