public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Bok 1", 25);
        Book book2 = new Book("Bok 2", 35);
        Book book3 = new Book("Bok 3", 45);

        book1.turnPages();
        System.out.println(book1.GetcurrentPage());
    }
}