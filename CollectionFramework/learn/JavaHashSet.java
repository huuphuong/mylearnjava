package CollectionFramework.learn;

import java.util.HashSet;
import java.util.Iterator;

import CollectionFramework.extra.Student;


public class JavaHashSet {
    /**
     * HashSet là 1 lớp kế thừa AbtractSet và implement Set Interface
     * HashSet sử dụng tạo collection và sử dụng bảng băm để lưu trữ.
     * HashTable (bảng băm) lưu trữ thông tin sử dụng kỹ thuật hashing
     *      Cấu trúc: key => value
     *      Nội dung mang tính chất của "key" được gọi là hash code và sử dụng hash code như một index
     *          để liên sheets với key
     * 
     * Đặc điểm:
     *      + HashSet implement Set Interface nên có đặc tính là CÁC PHẦN TỬ TRONG COLLECTION không được trùng nhau
     * @param args
     */
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<String>();
        setA.add("Python");
        setA.add("C++");
        setA.add("Java");
        setA.add("Scala");
        setA.add("Python");
        System.out.println(setA);
        Iterator<String> itr = setA.iterator();
        while(itr.hasNext()) {
            System.out.println((String) itr.next());
        }

        // Tạo 1 HashSet chứa các thông tin sinh viên
        HashSet<Student> students = new HashSet<Student>();
        Student s1 = new Student(1, "Phuong", "Nam");
        Student s2 = new Student(2, "Ngoc", "Nu");
        Student s3 = new Student(3, "Truong", "Nam");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        
        for (Student student : students) {      
            System.out.println(String.format("\n ID: %d,\n Name: %s,\n Gender: %s", student.getId(), student.getName(), student.getGender()));
        }
    }
} // End class
