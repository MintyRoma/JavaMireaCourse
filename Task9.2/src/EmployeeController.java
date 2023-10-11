public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee employee, EmployeeView employeeView)
    {
        model = employee;
        view = employeeView;
    }

    public String getName()
    {
        return model.getName();
    }

    public int getId()
    {
        return model.getId();
    }

    public double getHourRate()
    {
        return model.getHourRate();
    }

    public int getHours()
    {
        return model.getHours();
    }

    public double getSalary()
    {
        return model.getHourRate()*model.getHours();
    }

    public void setName(String name)
    {
        model.setName(name);
    }

    public void setId(int id)
    {
        model.setId(id);
    }

    public void setHourRate(double hourRate)
    {
        model.setHourRate(hourRate);
    }

    public void setHours(int hours)
    {
        model.setHours(hours);
    }

    public void printInformation()
    {
        view.printTotalInformation(model.getName(), model.getHourRate(), model.getId(),model.getHours());
    }

    public void printSalary()
    {
        view.printSalaryInfo(model.getHourRate()* model.getHours(), model.getId(), model.getName());
    }
}
