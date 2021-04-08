package CollectionFramework;

import java.util.Set;
import java.util.TreeSet;

import CollectionFramework.extra.Student;

public class JavaTreeSet {
    /**
     * TreeSet là một triển khai implement interface Set & sử dụng cấu trúc cây để lưu trữ phần tử
     * Nó kế thùa AbtractSet và implement thêm NavigableSet. 
     * Các phần tử được lưu theo thứ tự tăng dần
     * 
     * Đặc điểm:
     *      Không chứa các phần tử có giá trị trùng nhau (Đặc điểm này là chung của Set)
     *      Thời gian truy xuất nhanh
     *      Duy trì thứ tự tăng dần
     * @param args
     */
    public static void main(String[] args) {
        Set<String> myTree = new TreeSet<String>();
        myTree.add("PHP");
        myTree.add("Python");
        myTree.add("Java");
        myTree.add("PHP");

        System.out.println(" =========== PRINT =========== ");
        System.out.println(myTree);

        System.out.println(" =========== EXAMPLE WITH STUDENT =========== ");
        Set<Student> students = new TreeSet<Student>();
        Student s1 = new Student(1, "Phuong", "Nam");
        Student s2 = new Student(2, "Ha", "Nu");
        Student s3 = new Student(3, "Luyen", "Nam");
        students.add(s1);
        students.add(s2);
        students.add(s3);

        String fm = "";
        for (Student student : students) {
            fm += String.format("\n\n ID: %d,\n Name: %s,\n Gender: %s", student.getId(), student.getName(), student.getGender());
        }
    }
}
