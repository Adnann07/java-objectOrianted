/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libraryy;

/**
 *
 * @author HP
 */
public class Libraryy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         book book1 = new book("B001", "1984", "George Orwell");
        book book2 = new book("B002", "To Kill a Mockingbird", "Harper Lee");

        ebook ebook1 = new ebook("E001", 2.5);
        ebook ebook2 = new ebook("E002", 3.0);
        ebook ebook3 = new ebook("E003", 1.5);

        book1.showItem();
        book1.checkOut();
        book1.showDetails();

        System.out.println();

        book2.showItem();
        book2.checkOut();
        book2.showDetails();

        System.out.println();

        ebook1.showItem();
        ebook1.checkOut();
        ebook1.showDetails();

        System.out.println();

        ebook2.showItem();
        ebook2.checkOut();
        ebook2.showDetails();

        System.out.println();

        ebook3.showItem();
        ebook3.checkOut();
        ebook3.showDetails();
    }
}
    
    

