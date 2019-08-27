public class Birome {

    public int cantinta;



    Papel papel;


    public Birome(int cantinta, Papel papel) {
        this.cantinta = cantinta;
        this.papel = papel;
    }


    public Papel getPapel() {
        return papel;
    }


    public void escribir(Papel papel){


        if(cantinta>0){
            this.cantinta=cantinta-1;
        }else{
            System.out.println("Se acabo la tinta");
        }

    }





}
