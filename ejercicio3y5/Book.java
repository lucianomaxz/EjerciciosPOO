import java.util.Arrays;

public class Book {
    private String name;
    private Author authors [];
    private double price;
    private int qty;



    public Book(String name,Author[]authors,double price,int qty) {
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    public Book(String name,Author[]authors,double price) {
        this.name=name;
        this.authors=authors;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames(){

        String names="";

        for(int i=0; i<authors.length;i++){

            names = names +authors[i].getName()+", ";
        }

        return names;

    }
}
