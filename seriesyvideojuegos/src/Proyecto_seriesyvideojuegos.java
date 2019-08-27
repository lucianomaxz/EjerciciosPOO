public class Proyecto_seriesyvideojuegos {
    public static void main(String[]rgs){
        int cont=0,cont2=0,aux=0,aux2=0;
        Serie serie[]=new Serie[5];

        serie[0]=new Serie("rey leon",5,"triste","simba");
        serie[1]=new Serie("rey leon",2,"triste","simba");
        serie[2]=new Serie("rey leon",13,"triste","simba");
        serie[3]=new Serie("rey luna",9,"alegre","simon");
        serie[4]=new Serie();

        videojuegos videojuegos[]=new videojuegos[5];

        videojuegos[0]=new videojuegos("titanic",15);
        videojuegos[1]=new videojuegos("titanic",23);
        videojuegos[2]=new videojuegos("titanic",34);
        videojuegos[3]=new videojuegos("titanic",4);
        videojuegos[4]=new videojuegos();

        serie[2].entregar();
        serie[4].entregar();

        videojuegos[0].entregar();
        videojuegos[2].entregar();
        videojuegos[3].entregar();

        for (int i=0;i<5;i++){
            if(serie[i].isEntregado()==false){
                cont++;
            }
            if (videojuegos[i].isEntregado()==false){
                cont2++;
            }
        }

        System.out.println("Hay "+cont+" series entregados");
        System.out.println("Hay "+cont2+" videojuegos entregados");

        for(int j=0;j<5;j++){
            if(serie[j].getNrotemporadas()>aux){
                aux=serie[j].getNrotemporadas();
            }
            if(videojuegos[j].getHoras()>aux2){
                aux2=videojuegos[j].getHoras();
            }
        }



        for(int k=0;k<5;k++){
            if (serie[k].getNrotemporadas()==aux){
                serie[k].isEntregado();
                System.out.println("La serie con mas temporada es: "+serie[k].toString());
            }
            if (videojuegos[k].getHoras()==aux2){
                videojuegos[k].isEntregado();
                System.out.println("El videojuego con mas horas es: "+videojuegos[k].toString());
            }
        }


    }
}
