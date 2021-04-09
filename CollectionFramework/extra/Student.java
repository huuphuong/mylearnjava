package CollectionFramework.extra;

public class Student implements Comparable<Student> {
    protected int id;
    protected String name;
    protected String gender;

    public Student() {
       
    }

    public Student(int id, String name, String gender) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public static void main(String[] args) {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }

    @Override
    public String toString() {
        return "Student@name=" + this.name + ",id=" + this.id + ",gender=" + this.gender;
    }
}
