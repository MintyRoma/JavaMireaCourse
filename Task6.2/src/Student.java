public class Student implements Comparator {

    private int id;
    private String name;

    private String surname;

    private int score;

    public Student(int id, String name, String surname, int score)
    {
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.score =(score >=0 && score <=100? score :0);
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

    @Override
    public int getScore()
    {
        return score;
    }

    public void setScore(int new_grade)
    {
        if(score >=1 && score <=11) score =new_grade;
    }

    @Override
    public String toString() {
        return "Student #"+id+" "+name+" "+surname+" has "+ score +" points";
    }

    @Override
    public boolean betterThan(Comparator compare) {
        if(score>= compare.getScore()) return true;
        return false;
    }
}
