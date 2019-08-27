import java.util.Scanner;
public class autorizacion {
    public static void main (String args []){
        int bdatos [] = new int [5],posicion=0;
        Scanner entr = new Scanner(System.in);
        for (int cont = 0; cont < 5; cont++){
            System.out.println("Ingrese la cantidad de accesos de la posicion "+ (cont+1));
            bdatos[cont] = entr.nextInt();
            if (bdatos[posicion]<bdatos[cont]){
                posicion = cont;
            }
        }
        System.out.println("La posicion con mayor numero es "+ (posicion+1) + "\nSu valor es de " + bdatos[posicion]);
    }
}
