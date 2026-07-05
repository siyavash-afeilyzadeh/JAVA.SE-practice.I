import black.Book;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setId(1);
        book1.setName("Lord of the Rings");
        book1.setAuthor("J.R.R.Tolkin");
        book1.setPage(1456);

        System.out.println(book1);

    }
}
