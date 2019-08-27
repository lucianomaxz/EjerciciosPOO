public class ProgramaPapel {
    public static void main(String[]args){


        Papel papel1=new Papel("Hola");

        Birome birome=new Birome(3,papel1);






        birome.escribir(papel1);

        birome.escribir(papel1);
        birome.escribir(papel1);
        birome.escribir(papel1);

        System.out.println(papel1.toString());







    }
}
