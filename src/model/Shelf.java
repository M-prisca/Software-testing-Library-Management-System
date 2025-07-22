package model;

public class Shelf {
    private String shelfId;
    private String bookCategory;
    private int initialStock;
    private int availableStock;
    private int borrowedNumber;
    private String roomId;

    public Shelf(String shelfId, String bookCategory, int initialStock, String roomId) {
        this.shelfId = shelfId;
        this.bookCategory = bookCategory;
        this.initialStock = initialStock;
        this.availableStock = initialStock;
        this.borrowedNumber = 0;
        this.roomId = roomId;
    }

    public String getShelfId() {
        return shelfId;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public int getInitialStock() {
        return initialStock;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public int getBorrowedNumber() {
        return borrowedNumber;
    }

    public String getRoomId() {
        return roomId;
    }

    public void borrowBook() {
        if (availableStock > 0) {
            availableStock--;
            borrowedNumber++;
        }
    }

    public void returnBook() {
        availableStock++;
        borrowedNumber--;
    }
}
