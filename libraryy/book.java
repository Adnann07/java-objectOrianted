package libraryy;

/**
 * Subclass Book
 */
public class book extends LibraryItems {
    private String bookName;
    private String authorName;
    private static int totalBooks = 0;

    public book(String itemNumber, String bookName, String authorName) {
        super(itemNumber);
        this.bookName = bookName;
        this.authorName = authorName;
        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    @Override
    public void showDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Total Books: " + getTotalBooks());
    }
}
