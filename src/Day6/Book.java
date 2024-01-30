public class Book {
    private String title;
    private String author;
    private String isbn;
    public Book (String title,String author,String isbn){
        this.author=author;
        this.isbn=isbn;
        this.title=title;
    }
     public void setTitle(String title){
            this.title=title;
     }
     public String getTitle(){
        return title;
     }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void displayInfo(){
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Isbn : "+getIsbn());
    }
}
