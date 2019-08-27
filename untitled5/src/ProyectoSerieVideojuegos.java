public class ProyectoSerieVideojuegos {
    public static void main(String[]args){
        int cont=0,aux=0;
        double aux2=0;
        boolean entregado=false;
        Serie serie[]=new Serie[5];

        Videojuego videojuego[]=new Videojuego[5];

        serie[0]=new Serie("el sol",5,"terror","yo");

        serie[1]=new Serie("el sol",7,"terror","yo");

        serie[2]=new Serie("el sol",10,"terror","yo");

        serie[3]=new Serie("el sol",2,"terror","yo");

        serie[4]=new Serie("el sol",6,"terror","yo");


        videojuego[0]=new Videojuego("la luna",2,"comedia","the rock");

        videojuego[1]=new Videojuego("la luna",6,"comedia","the rock");

        videojuego[2]=new Videojuego("la luna",8,"comedia","the rock");

        videojuego[3]=new Videojuego("la luna",9,"comedia","the rock");

        videojuego[4]=new Videojuego("la luna",4,"comedia","the rock");

        serie[0].entregar();
        serie[1].entregar();

        serie[1].devolver();

        videojuego[2].entregar();
        videojuego[3].entregar();

        for (int i=0;i<5;i++){
            if((serie[i].isEntregado())==false){
                cont++;
            }if ((videojuego[i].isEntregado())==false){
                cont++;
            }
        }


        System.out.println("Cantidad de entregados es "+cont);

        for(int j=0;j<5;j++){
            if(serie[j].getNrotemporadas()> aux){
                aux=serie[j].getNrotemporadas();
            }if (videojuego[j].getHorasestimadas()> aux2){
                aux2=videojuego[j].getHorasestimadas();
            }
        }

        System.out.println("La serie con mas temporadas es "+aux+" y el videojuego con mas horas es "+aux2);







    }
}
