public class Book {

    public String Name;
    private int currentPage = 0;
    public int Pages;

    public Book(String n, int p) {
        this.Name = n;
        this.Pages = p;
        this.currentPage = 0;
    }

    public void turnPages() {
        currentPage ++;
    }

    public int GetcurrentPage() {
        return this.currentPage;
    }

}
