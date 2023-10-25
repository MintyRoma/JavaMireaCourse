public class Main {
    public static void main(String[] args) {
        Pet loki = new Pet(Animal.Type.Dog, "Loki");
        Storage<String, SerClass, Pet> record = new Storage<>("Nice", new SerClass(),loki);
        System.out.println(record);
        System.out.println(record.getTypes());
    }
}