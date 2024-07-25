package homework.lesson8;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int course;

    public Student() {

    }

    public Student(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return STR."Student ID = \{id}, name = \{name}, course = \{course}.";
    }

    @Override
    public int compareTo(Student o) {
        int result = this.id - o.id;
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
