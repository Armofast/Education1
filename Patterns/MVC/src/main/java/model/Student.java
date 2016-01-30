package model;

/**
 * Created by dirty on 30.01.16.
 */
public class Student {
    String name;
    String faculty;
    int age;

    public Student(String name, String faculty, int age) {
        this.name = name;
        this.faculty = faculty;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
