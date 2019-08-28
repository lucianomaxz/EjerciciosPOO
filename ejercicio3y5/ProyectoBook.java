public class ProyectoBook {
    public static void main(String[] args) {

        Author authors []= new Author[2];

        authors[0]=new Author("luciano","email@",'m');
        authors[1]=new Author("lucas","email@",'h');


       Book book=new Book("Luciano",authors,20,30);

              System.out.println(book.getAuthorNames());
              System.out.println(book.toString());




    }
}
