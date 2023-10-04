import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        //Array list bench
        ArrayList<String> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        list.add("Alpha");
        list.add("Bavo");
        list.add("Charlie");
        list.add("Delta");
        list.add("Echo");

        list.remove("Bavo");
        list.add(1,"Bravo");
        list.replaceAll(p->p.toUpperCase());
        for (String s:list) {
            System.out.println(s);
        }

        long stop = System.currentTimeMillis();

        System.out.println("ArrayList benchmark:\n" +
                "Started: "+start+"\n" +
                "Completed: "+stop+"\n" +
                "Delta: "+(stop-start));


        //Linked list Bench
        LinkedList<String> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        linkedList.add("Alpha");
        linkedList.add("Bavo");
        linkedList.add("Charlie");
        linkedList.add("Delta");
        linkedList.add("Echo");

        linkedList.remove("Bavo");
        linkedList.add(1,"Bravo");
        linkedList.replaceAll(p->p.toUpperCase());
        for (String s:linkedList) {
            System.out.println(s);
        }

        stop = System.currentTimeMillis();
        System.out.println("LinkedList benchmark:\n" +
                "Started: "+start+"\n" +
                "Completed: "+stop+"\n" +
                "Delta: "+(stop-start));
    }
}