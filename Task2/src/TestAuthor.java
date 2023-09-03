public class TestAuthor {
    public static void main(String[] args) {
        Author Durrell = new Author("Gerald Durrell", "publishing@astpress.com",'m');
        Author King = new Author("Stephen King", "s.king@umaine.edu",'m');
        Author Doncova = new Author("Daria Doncova", "doncova.d@ya.ru",'f');

        System.out.println(Durrell);
        System.out.println(King);
        System.out.println(Doncova);

        Durrell.setEmail("archivedauthor@astpress.com");
        System.out.println(Durrell.getEmail());
        System.out.println(King.getName());
        System.out.println(Doncova.getGender());
    }
}