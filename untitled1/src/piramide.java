import java.util.Scanner;
public class piramide {
    public static void filas(int n) {
        int cont=n;
        for (int alto = 1; alto <= n; alto++) {
            for (int espacios = 1; espacios <=n-alto; espacios++) {
                System.out.print(" ");
            }
            for (int asterisco = 1; asterisco <= ( alto* 2)-1; asterisco++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
        return;
    }

    public static void main (String[]args){
        int fil;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar cantidad de filas:");
        fil = entrada.nextInt();
        filas(fil);
    }
}
