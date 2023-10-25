public class Main {
    public static void main(String[] args) {
        String[] daat = new String[]{
                "Alpha",
                "Bravo",
                "Charlie",
                "Delta"
        };

        MyList<String> data = new MyList<>();
        data.add("Echo");
        data.add("Foxtrot");
        data.add("Golf");
        int size = data.size();
        for(int i=0;i<size;i++) System.out.println(data.get(i));

        data.fromArray(daat);
        size = data.size();
        for(int i=0;i<size;i++) System.out.println(data.get(i));
    }
}