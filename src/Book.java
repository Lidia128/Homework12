import java.util.Objects;

public class Book {
    private final String name;
    private int since;
    private final Author author;

    public Book(String name, Author author, int since) {
        this.name = name;
        this.since = since;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getSince() {
        return this.since;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String toString() {
        return this.name + " " + this.author + " " + this.since;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book that = (Book) obj;
        return this.name.equals(that.name) && this.author.equals(that.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, author, since);
    }
}