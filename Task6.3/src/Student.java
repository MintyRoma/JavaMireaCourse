public class Student {

    private int id;
    private String name;

    private String surname;

    private int grade;

    public Student(int id, String name, String surname, int grade)
    {
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.grade=(grade>=1 && grade<=11?grade:1);
    }

    public int getID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGrade(int new_grade)
    {
        if(grade>=1 && grade<=11) grade=new_grade;
    }

    @Override
    public String toString() {
        return "Student #"+id+" "+name+" "+surname+" is "+grade+" grade student";
    }
}
