public class Videojuego {
    private String titulo;
    private double horasestimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    protected static final double DefectoHoras=10;
    protected static final boolean DefectoEntregado=false;
    protected static final String DefectoTitulo="";
    protected static final String Defectogenero="";
    protected static final String DefectoCompañia="";

    public Videojuego() {
        this.compañia=DefectoCompañia;
        this.entregado=DefectoEntregado;
        this.genero=Defectogenero;
        this.horasestimadas=DefectoHoras;
        this.titulo=DefectoTitulo;
    }

    public Videojuego(String titulo, double horasestimadas) {
        this.titulo = titulo;
        this.horasestimadas = horasestimadas;
        this.compañia=DefectoCompañia;
        this.entregado=DefectoEntregado;
        this.genero=Defectogenero;
    }

    public Videojuego(String titulo, double horasestimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasestimadas = horasestimadas;
        this.genero = genero;
        this.compañia = compañia;
        this.entregado=DefectoEntregado;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getHorasestimadas() {
        return horasestimadas;
    }

    public void setHorasestimadas(double horasestimadas) {
        this.horasestimadas = horasestimadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void entregar(){
        entregado=true;
    }

    public void devolver(){
        entregado=false;
    }
    public boolean isEntregado(){
        if(entregado==true){
            entregado=false;
        }else{
            entregado=true;
        }
        return entregado;
    }

}
