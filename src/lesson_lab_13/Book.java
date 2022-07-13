package lesson_lab_13;

public class Book {
    private int iSBN;
    private String title;
    private String author;
    private int year;

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + iSBN +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public int getISBN() {
        return iSBN;
    }

    public int setISBN(int ISBN) {
        this.iSBN = ISBN;
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        this.title = title;
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String setAuthor(String author) {
        this.author = author;
        return author;
    }

    public int getYear() {
        return year;
    }

    public int setYear(int year) {
        this.year = year;
        return year;
    }

    public Book(int iSBN, String title, String author, int year) {
        this.iSBN = iSBN;
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
