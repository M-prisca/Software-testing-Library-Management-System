package model;

import java.util.Date;

public class Borrower {
    private String id;
    private String bookId;
    private String readerId;
    private Date pickupDate;
    private Date dueDate;
    private Date returnDate;
    private int fine;
    private int lateChargeFees;

    public Borrower(String id, String bookId, String readerId, Date pickupDate, Date dueDate) {
        this.id = id;
        this.bookId = bookId;
        this.readerId = readerId;
        this.pickupDate = pickupDate;
        this.dueDate = dueDate;
        this.fine = 0;
        this.lateChargeFees = 0;
    }

    public String getId() {
        return id;
    }

    public String getBookId() {
        return bookId;
    }

    public String getReaderId() {
        return readerId;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public int getFine() {
        return fine;
    }

    public int getLateChargeFees() {
        return lateChargeFees;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public void setLateChargeFees(int fees) {
        this.lateChargeFees = fees;
    }
}
