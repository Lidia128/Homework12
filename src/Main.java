public class Main {

    public static void main(String[] args) {
        Book warPeace = new Book ("Война и мир", 1953);
        Author lTolstoy = new Author("Лев Толсой");

        System.out.println("warPeace.name = " + warPeace.getName() + " " + lTolstoy.getName());
        System.out.println("warPeace.since = " + warPeace.getSince());
        warPeace.setSince(1960);
        System.out.println("warPeace.getSince() = " + warPeace.getSince());
        Book chika = new Book("Чайка" , 1900 );
        Author aChehov = new Author("Антон Чехов");
        System.out.println("chika.name = " + chika.getName() + " " + aChehov.getName());
        System.out.println("chika.since = " + chika.getSince());
        chika.setSince(2000);
        System.out.println("chika.getSince() = " + chika.getSince());


    }}