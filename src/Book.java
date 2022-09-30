public class Book {
    private  String name;
    private  int since;

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

