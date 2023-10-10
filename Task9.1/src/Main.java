
public class Main {
    public static void main(String[] args) {

        StudentController controller1 = new StudentController(new Student(), new StudentView());
        controller1.setStudentName("Alex");
        controller1.setRollNo("132456");
        controller1.updateView();

        controller1.setRollNo("0000");
        controller1.updateView();

        StudentController controller2 = new StudentController(new Student(), new StudentView());
        controller2.setStudentName("Angela");
        controller2.setRollNo("44458");
        controller2.updateView();
        controller1.updateView();
    }
}