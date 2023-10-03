public class Main {
    public static void main(String[] args) {

        Ball myball = new Ball(30,"Latex",3,"Завод резиновых изделий");
        System.out.println(myball);
        myball.Inflate(4);
        System.out.println(myball);
        myball.Blowaway(10);
        System.out.println(myball);
    }
}