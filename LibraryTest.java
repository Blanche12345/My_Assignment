import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {
    @Test
    void testLateFee() {
        Book printedBook = new PrintedBook("Book A", "Author X", "123");
        assertEquals(2.5, printedBook.calculateLateFee(5));
        Book eBook = new Ebook("Book B", "Author Y", "456");
        assertEquals(0.0, eBook.calculateLateFee(5));
    }

}

