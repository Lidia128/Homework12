public class Main {

    public static void main(String[] args) {

        Author levTolstoy = new Author ("Лев", "Толстой");
        Book warPeace = new Book ("Война и мир", levTolstoy, 1953);
        System.out.println("warPeace.name = " + warPeace.getName() + " " + warPeace.getAuthor().getName()+ " " + warPeace.getAuthor().getSurname() + warPeace.getSince());
        System.out.println("warPeace.since = " + warPeace.getSince());
        warPeace.setSince(1960);
        System.out.println("warPeace.getSince() = " + warPeace.getSince());

        Author antonChehov = new Author ("Антон", "Чехов");
        Book chika = new Book("Чайка" , antonChehov, 1900 );
        System.out.println("chika.name = " + chika.getName() + " " + chika.getAuthor().getName()+ " " + chika.getAuthor().getSurname() + chika.getSince());
        System.out.println("chika.since = " + chika.getSince());
        chika.setSince(2000);
        System.out.println("chika.getSince() = " + chika.getSince());


    }}