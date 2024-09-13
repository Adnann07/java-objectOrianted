package libraryy;

/**
 * Subclass Ebook
 */
public class ebook extends LibraryItems {
    private double fileSize;
    private static double maxFileSize = 0.0;

    public ebook(String itemNumber, double fileSize) {
        super(itemNumber);
        this.fileSize = fileSize;
        if (fileSize > maxFileSize) {
            maxFileSize = fileSize;
        }
    }

    public static double getMaxFileSize() {
        return maxFileSize;
    }

    @Override
    public void showDetails() {
        System.out.println("EBook file size: " + fileSize);
        System.out.println("Max File Size: " + getMaxFileSize());
    }
}
