public class Main {
    public static void main(String[] args) {
        Storage<Integer, String, Character> data = new Storage<>(7,"Ok", 'a');
        System.out.println(data);
        data.getTypes();
    }
}