import java.util.Scanner;
public class matrix {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        int matrix[][] = new int[3][5];
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingresar valor de columna " + (j + 1) + "   fila  " + (i + 1) + "=");
                matrix[i][j] = entrada.nextInt();
                suma = suma + matrix[i][j];
            }
        }
        System.out.println("valor total:"+suma);
    }
}
