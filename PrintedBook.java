public class PrintedBook extends Book {
    public PrintedBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 0.5;
    }

    public static void main(String[] args) {
        PrintedBook pb = new PrintedBook("2004", "Giraldine-Blanche GAMBOMI", "12345");
        System.out.println("Book Title: " + pb.getTitle());
        System.out.println("Book Author: " + pb.getAuthor());
        System.out.println("Book ISBN: " + pb.getIsbn());
        System.out.println("Late Fee for 5 days: " + pb.calculateLateFee(5));
    }
}
