package black;

import java.time.LocalDate;

public class Borrow {

    private int id;
    private Person person;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public Person getPerson(){
        return person;
    }
    public void setPerson(Person person){
        this.person = person;
    }

    public Book getBook(){
        return book;
    }
    public void setBook(Book book){
        this.book = book;
    }

    public LocalDate getBorrowDate(){
        return borrowDate;
    }
    public void setBorrowDate(LocalDate borrowDate){
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate(){
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate){
        this.returnDate = returnDate;
    }

    public String toString(){
        return "Borrow Information No " +
                id + " --> " +
                "| Boroower: " + person +
                " | Book: " + book +
                " | Borrow Date: " + borrowDate +
                " | Return Date: " + returnDate;
    }
}
