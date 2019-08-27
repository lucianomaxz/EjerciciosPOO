import java.util.Scanner;
import javax.swing.*;
public class ro {
    public static void main (String args[]){
        int n,d;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de vacas");
        n=ent.nextInt();
        d=7;
        int [][] litrosDias = new int [d][n+2];int contv,contd,litroVacas=0,diaLitros=0,prueba;
        for (contd = 0; contd <d;contd++) {
            prueba=0;
            for (contv = 0; contv < n; contv++) {
                System.out.println("ingrese la cantidad de litros de la Vaca N "+(contv+1)+" El día "+(contd+1) );
                litrosDias[contd][contv]=ent.nextInt();
                litrosDias[contd][n] = litrosDias[contd][n]+litrosDias[contd][contv];
                if (prueba ==n-1){

                    if ((litrosDias[contd][contv-1])<(litrosDias[contd][contv])){
                        litrosDias[contd][n+1] = contv;
                    }else{
                        litrosDias[contd][n+1]=contv-1;
                    }
                    System.out.println(litrosDias[contd][n+1]+" "+contv+" "+litrosDias[contd][contv]+" "+litrosDias[contd][contv-1]);
                }
                prueba=prueba+1;
                //litrosDias[contd][cont]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de litros de la vaca N "+(cont+1)+" del día "+(contd+1), litrosDias[contd][cont]));
            }
        }
        for(contd = 0; contd < d;contd++){
            System.out.println("La vaca que mas leche dio el dia " +(contd+1)+" fue la vaca Nº "+(litrosDias[contd][n+1]+1));}
        for (contd= 0; contd <d;contd++){
            System.out.println("la produccion total del dia " +(contd+1)+" fue de estos litros "+litrosDias[contd][n]);}
    }

}
