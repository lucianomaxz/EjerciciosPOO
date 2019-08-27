public class Papel {
    public String texto;


    public Papel(String texto) {
        this.texto = texto;
    }


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }





    public void escribir(String cadena){

        this.texto=cadena;
    }








    @Override
    public String toString() {
        return "Papel{" +
                "texto='" + texto + '\'' +
                '}';
    }
}
