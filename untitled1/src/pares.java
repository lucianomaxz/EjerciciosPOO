import java.util.Scanner;
public class pares {
    public static void main(String args[]) {
        int cont, vec[] = new int[20];
        Scanner entrada = new Scanner(System.in);
        for (cont = 0; cont < 20; cont++) {
            System.out.println("Ingrese un numero");
            vec[cont] = entrada.nextInt();
        }
        System.out.println("Los pares son");
        cont = 0;
        while (cont<20) {
            if (vec[cont]%2==0){
                System.out.print(vec[cont]+" ");}
            cont++;
        }
    }
}