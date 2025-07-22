package model;

public class Book {
    private String bookId;
    private String title;
    private String ISBNCode;
    private String publisherName;
    private int edition;
    private int publicationYear;
    private String bookStatus;
    private String shelfId;

    public Book(String bookId, String title, String ISBNCode, String publisherName, int edition, int publicationYear,
            String bookStatus, String shelfId) {
        this.bookId = bookId;
        this.title = title;
        this.ISBNCode = ISBNCode;
        this.publisherName = publisherName;
        this.edition = edition;
        this.publicationYear = publicationYear;
        this.bookStatus = bookStatus;
        this.shelfId = shelfId;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getISBNCode() {
        return ISBNCode;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public int getEdition() {
        return edition;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public String getShelfId() {
        return shelfId;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public void setShelfId(String shelfId) {
        this.shelfId = shelfId;
    }
}
