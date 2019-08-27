import java.util.Scanner;
public class NumerosCifras {
    public static int cifras(int n){
        int cont=0;
        Scanner entrada=new Scanner(System.in);
        while (n<0){
            System.out.println("Reingresar numero");
            n=entrada.nextInt();
        }
        while(n>0){
            n=n/10;
            cont++;
        }
        return cont ;
    }


    public static void main(String[]args){
        int nro;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        nro=entrada.nextInt();
        nro= cifras(nro);
        System.out.println("La cantidad de cifras es:"+nro);
    }
}
