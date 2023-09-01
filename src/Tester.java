import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Tester {
    public static void main(String[] args) {

        Book MyDiary = new Book("My Diary");
        Book BloodSweatAndPixels = new Book("Blood Sweat & Pixels", new ArrayList<String>(Arrays.asList("Doom","Kojima")));


        System.out.println(MyDiary);
        System.out.println(BloodSweatAndPixels);
        System.out.println("BSAP Page 2:" + BloodSweatAndPixels.getPage(2));
        System.out.println("MD Page 2:" + MyDiary.getPage(2));

        MyDiary.addPage("Дорогой дневник, мне не подобрать слов, чтобы описать боль и унижение, которое я испытал.");
        System.out.println("Diary pages: " + MyDiary.countPages());

        BloodSweatAndPixels.removePageAt(3);
        System.out.println("BSAP Pages: " + BloodSweatAndPixels.countPages());

        System.out.println("Diary page 2: "+MyDiary.getPage(2));
        }
    }