public class Book {
    private String name;
    private  int since;

    private Author author;

    public Book (String name, int since) {
        this.name = name;
        this.since = since;
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
}

