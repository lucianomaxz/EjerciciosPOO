import java.util.Scanner;
public class arreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc;
        double articulo;
        int cont = 0;
        int vector[] = new int[5];
        System.out.println("Elejir opcion\n1-Venta\n2-Compra");
        opc = entrada.nextInt();
        switch (opc) {
            case 1:
                for (int i =0; i < 5; i++) {
                    System.out.println("Ingrese articulo");
                     vector[i]= entrada.nextInt();

                    System.out.println("Pecio final del articulo es: " + (  vector[i] - (  vector[i] * 0.2)));
                }
                break;
            case 2:
                for (int i =0; i < 5; i++) {
                    System.out.println("Ingrese articulo");
                    vector[i]= entrada.nextInt();

                    System.out.println("Pecio final del articulo es: " + (  vector[i] + (  vector[i] * 0.2)));
                }
        }
    }
}
