public class Proyecto2 {
    public static void main(String[]args){

        Libro libro1=new Libro("123456789","Soledad","Luciano",250);

        Libro libro2=new Libro("987456321","Luna","Lucho",250);

        System.out.println(libro1.toString());

        System.out.println(libro2.toString());

        if(libro1.getNropag()>libro2.getNropag()){
            System.out.println("Libro con mayor numero de paginas "+libro1.getTitulo());
        }else if(libro1.getNropag()<libro2.getNropag()){
            System.out.println("Libro con mayor numero de paginas "+libro2.getTitulo());
        }else if(libro1.getNropag()==libro2.getNropag()){
            System.out.println("Los libros tienen la misma cantidad de paginas ");
        }
    }
}
