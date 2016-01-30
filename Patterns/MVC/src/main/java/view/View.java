package view;

/**
 * Created by dirty on 30.01.16.
 */
public class View {
    public void printStudentInformation(String name,String faculty,int age){
       String s= String.format("%s is a %d years old student of %s",name,age,faculty);
        System.out.println(name + " is a " + age + " years old student of " + faculty);
        System.out.println(s);
    }
}
