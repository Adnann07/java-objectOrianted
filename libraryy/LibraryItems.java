package libraryy;

/**
 * Base class LibraryItems
 */
public abstract class LibraryItems {
    private String itemNumber;

    public LibraryItems(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void checkOut() {
        System.out.println("Checked Out of Library");
    }

    public void showItem() {
        System.out.println("Item Number is: " + itemNumber);
    }

    public abstract void showDetails();
}