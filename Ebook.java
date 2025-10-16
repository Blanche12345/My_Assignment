public class Ebook extends Book {
    public Ebook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        // EBooks have no late fees
        return 0.0;
    }
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Java Basics", "Alan LENGOSSI", "ABC123");
        System.out.println("Title: " + ebook.getTitle());
        System.out.println("Late fee for 5 days: " + ebook.calculateLateFee(5));
    }
}