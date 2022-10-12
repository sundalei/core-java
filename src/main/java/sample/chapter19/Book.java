package sample.chapter19;

public class Book {
    private String title;
    private String isbn;

    private Author[] authors;
    private Publisher publisher;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
