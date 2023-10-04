import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private int id;
    private String name;

    private String surname;

    private int grade;

    private Date dob;


    public enum DateType{
        SHORT,
        DEFAULT,
        LONG
    }

    public Student(int id, String name, String surname, int grade, Date date_of_birth)
    {
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.grade=(grade>=1 && grade<=11?grade:1);
        this.dob = date_of_birth;
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

    public Date getDateOfBirth()
    {
        return dob;
    }

    @Override
    public String toString() {
        return "Student #"+id+" "+name+" "+surname+" is "+grade+" grade student born "+dob;
    }


    public String toString(DateType dateType) {

        switch(dateType)
        {
            case DEFAULT:
                SimpleDateFormat format1 = new SimpleDateFormat("EEEE, MM.dd.yyyy");
                return "Student #"+id+" "+name+" "+surname+" is "+grade+" grade student born "+format1.format(dob);
            case LONG:
                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
                return "Student #"+id+" "+name+" "+surname+" is "+grade+" grade student born "+format2.format(dob);
            case SHORT:
                SimpleDateFormat format3 = new SimpleDateFormat("dd.MM.yyyy");
                return "Student #"+id+" "+name+" "+surname+" is "+grade+" grade student born "+format3.format(dob);
        }
        return "";
    }
}
