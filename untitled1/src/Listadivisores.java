import java.util.Scanner;
public class Listadivisores {
    public static void divisor(int n){
        int cont=1;
        int acum;
        while(cont<=n){
           acum=n%cont;
           if(acum==0) {
               System.out.println(cont);
           }
            cont++;
        }
        while(cont/2<n){
            System.out.println(cont);
            cont++;
        }

        return ;
    }
    public static void main(String[]args){
        int nro;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresar un numero entero");
        nro=entrada.nextInt();
        divisor(nro);
    }
}
