package library;

class Book {
    int id;
    String title;
    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return id + ": " + title;
    }
}