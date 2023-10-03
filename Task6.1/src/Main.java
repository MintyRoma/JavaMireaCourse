import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        int amount = 100;
        Random rnd = new Random();
        for(int i=0; i<amount;i++) {
            int id = rnd.nextInt(0,10000);
            int grade = rnd.nextInt(1,11);
            String name = TestDictionary.Names.get(rnd.nextInt(TestDictionary.Names.size()));
            String surname = TestDictionary.Surnames.get(rnd.nextInt(TestDictionary.Surnames.size()));
            students.add(new Student(id,name,surname,grade));
        }
        for (Student s:students) {
            System.out.println(s);
        }

        students = Sort(students);
        System.out.println("=============");
        for (Student s:students) {
            System.out.println(s);
        }
    }

    public static ArrayList<Student> Sort(ArrayList<Student> original)
    {
        if (original.size()<=1)return original;
        Student target = original.get(original.size()/2);
        ArrayList<Student> less = new ArrayList<Student>();
        ArrayList<Student> more = new ArrayList<Student>();
        original.remove(target);
        for (Student s:original) {
            if (target.getID()>=s.getID())less.add(s);
            else more.add(s);
        }
        less = Sort(less);
        more = Sort(more);
        less.add(target);
        less.addAll(more);
        return less;
    }
}