public class videojuegos {
    private String titulo;
    private int horas;
    private boolean entregado;
    private String genero;
    private String compañia;

    protected static int defectohoras=10;
    protected static boolean defectoentregado=false;
    protected static String defectotitulo="";
    protected static String defectogenero="";
    protected static String defectocompañia="";

    public videojuegos() {
        this.titulo = defectotitulo;
        this.horas = defectohoras;
        this.genero = defectogenero;
        this.compañia = defectocompañia;
        this.entregado=defectoentregado;
    }

    public videojuegos(String titulo, int horas) {
        this.titulo = titulo;
        this.horas = horas;
        this.genero = defectogenero;
        this.compañia = defectocompañia;
        this.entregado=defectoentregado;
    }

    public videojuegos(String titulo, int horas, String genero, String compañia) {
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.compañia = compañia;

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

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
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

    @Override
    public String toString() {
        return "videojuegos{" +
                "titulo='" + titulo + '\'' +
                ", horas=" + horas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }
}
