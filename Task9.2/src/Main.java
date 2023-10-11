public class Main {
    public static void main(String[] args) {
        EmployeeController controller1 = new EmployeeController(new Employee(), new EmployeeView());
        controller1.setId(1);
        controller1.setName("Ivan");
        controller1.setHourRate(125.50);
        controller1.setHours(12);
        controller1.printInformation();
        controller1.setHourRate(150.75);
        controller1.printSalary();
    }
}