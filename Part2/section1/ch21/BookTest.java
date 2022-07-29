package Part2.section1.ch21;

public class BookTest {
    public static void main(String[] args)
    {
        Book[] library = new Book[5];
    for(int i= 0;i<library.length;i++)
    {
        library[i] = new Book("title "+i,"정민");
    }
    for(Book book: library)
    {
        book.showInfo();
    }
    }
}
