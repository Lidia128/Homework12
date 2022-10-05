public class Book {
    private final String name;
    private  int since;
    private final Author author;

    public Book (String name, Author author, int since) {
        this.name = name;
        this.since = since;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }
    public int getSince () {
        return this.since;
    }
    public void setSince(int since) {
       this.since = since;
    }
    public Author getAuthor() { return this.author; }


}

