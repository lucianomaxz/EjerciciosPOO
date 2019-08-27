import java.util.Scanner;
public class vector {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
       int  datos[]= new int[5];
       int cont=0;
       int posicion=0;
       for (cont=0;cont<5;cont++) {
           System.out.println("Ingresar dato:  " + (cont + 1));
           datos[cont] = entrada.nextInt();
           if (datos[posicion] < datos[cont]) {
               posicion = cont;
           }
       }
        System.out.println("La posicion con mayor numero es:" +(posicion+1) + "\nSu valor es de " + datos[posicion]);
    }
}
