//Atributos

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int nropag;

    //Constructor

    public Libro(String ISBN, String titulo, String autor, int nropag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nropag = nropag;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNropag() {
        return nropag;
    }

    public void setNropag(int nropag) {
        this.nropag = nropag;
    }

    @Override
    public String toString() {
        return ("El Libro con ISB=" + ISBN + ", creado por " + autor + " tiene " + nropag + " paginas");
    }

}
