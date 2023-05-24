package by.sterlikov.homework.lesson16;

public class Book {
    private String author;
    private String bookTitle;
    private int yearPublishing;

    public Book(String author, String bookTitle, int yearPublishing) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.yearPublishing = yearPublishing;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", yearPublishing=" + yearPublishing +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (yearPublishing != book.yearPublishing) return false;
        if (!author.equals(book.author)) return false;
        return bookTitle.equals(book.bookTitle);
    }

    @Override
    public int hashCode() {
        int result = author.hashCode();
        result = 31 * result + bookTitle.hashCode();
        result = 31 * result + yearPublishing;
        return result;
    }
}
