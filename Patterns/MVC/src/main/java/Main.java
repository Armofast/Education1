import controller.Controller;
import model.Student;
import view.View;

/**
 * Created by dirty on 30.01.16.
 */
public class Main {
    public static void main(String[] args) {
        Student model=new Student("Sanya","IITaCS",21);
        View view=new View();
        Controller controller=new Controller(model,view);
        controller.updateView();
    }
}
