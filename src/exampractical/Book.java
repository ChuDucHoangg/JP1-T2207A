package exampractical;

public class Book {
    private String title;
    private Author nameauthor;
    private double price;

    public Book(String title, Author nameauthor, double price) {
        this.title = title;
        this.nameauthor = nameauthor;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getNameauthor() {
        return nameauthor;
    }

    public void setNameauthor(Author nameauthor) {
        this.nameauthor = nameauthor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "Title: " +this.title+ "\n" + "Author: " +this.nameauthor+ "\n" + "Price: " +this.price;
    }
}

