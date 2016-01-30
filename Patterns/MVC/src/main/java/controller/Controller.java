package controller;

import model.Student;
import view.View;

/**
 * Created by dirty on 30.01.16.
 */
public class Controller {
    Student model;
    View view;

    public Controller(Student student, View view) {
        this.model = student;
        this.view = view;
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public void setStudentAge(int age){
        model.setAge(age);
    }
    public void setStudentFaculty(String faculty){
        model.setFaculty(faculty);
    }
public void updateView(){
    view.printStudentInformation(model.getName(),model.getFaculty(),model.getAge());
}
}
