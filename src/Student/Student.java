package Student;

public class Student {
    String ID;
    String name;
    Integer age;
    String gender;


    public Student(String ID, String name, Integer age, String gender) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        Student student = new Student("1234556", "张三", 18, "男");
        System.out.println(student.getID());
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
    }
}
