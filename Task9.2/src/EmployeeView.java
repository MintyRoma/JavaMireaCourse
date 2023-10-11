public class EmployeeView {

    public void printTotalInformation(String name, double hourRate, int id, int hours)
    {
        System.out.println("Employee:" +
                "\nId: "+id +
                "\nName: "+name+
                "\nHour rate: "+hourRate+
                "\nHours completed: "+hours);
    }

    public void printSalaryInfo(double salary, int id, String name)
    {
        System.out.println("Employee "+name+":"+id+" earned "+salary);
    }
}
