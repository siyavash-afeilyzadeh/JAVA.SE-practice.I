package black;

import java.time.LocalDate;

public class BorrowTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setId(1);
        person1.setName("Siyavash");
        person1.setFamily("Afeilyzadeh");
        person1.setAge(32);

        Book book1 = new Book();
        book1.setId(1);
        book1.setName("Lord of the Rings");
        book1.setAuthor("J.R.R.Tolkin");
        book1.setPage(1456);

        Borrow borrow1 = new Borrow();
        borrow1.setId(1);
        borrow1.setPerson(person1);
        borrow1.setBook(book1);
        borrow1.setBorrowDate(LocalDate.of(1997,11,24));
        borrow1.setReturnDate(LocalDate.of(2012,10,9));

        System.out.println(borrow1);




    }
}
