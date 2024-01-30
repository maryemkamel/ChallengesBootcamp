public class NonFictionBook extends Book{


    public NonFictionBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }
    @Override
    public void displayInfo(){
        System.out.println("NonFictionBook Information");
        super.displayInfo();
    }
}
