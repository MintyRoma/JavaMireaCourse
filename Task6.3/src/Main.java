import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students1 = new ArrayList<Student>();
        int amount = 50;
        Random rnd = new Random();
        for(int i=0; i<amount;i++) {
            int id = rnd.nextInt(0,10000);
            int grade = rnd.nextInt(1,11);
            String name = TestDictionary.Names.get(rnd.nextInt(TestDictionary.Names.size()));
            String surname = TestDictionary.Surnames.get(rnd.nextInt(TestDictionary.Surnames.size()));
            students1.add(new Student(id,name,surname,grade));
        }
        System.out.println("List 1:");
        for (Student s:students1) {
            System.out.println(s);
        }

        ArrayList<Student> students2 = new ArrayList<Student>();
        for(int i=0; i<amount;i++) {
            int id = rnd.nextInt(0,10000);
            int grade = rnd.nextInt(1,11);
            String name = TestDictionary.Names.get(rnd.nextInt(TestDictionary.Names.size()));
            String surname = TestDictionary.Surnames.get(rnd.nextInt(TestDictionary.Surnames.size()));
            students2.add(new Student(id,name,surname,grade));
        }

        System.out.println("List 2:");
        for (Student s:students2) {
            System.out.println(s);
        }

        ArrayList<Student> students = Sort(Consolidate(students1,students2));
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

    private static ArrayList<Student> Consolidate(ArrayList<Student> list1, ArrayList<Student> list2)
    {
        list1.addAll(list2);
        return list1;
    }
}