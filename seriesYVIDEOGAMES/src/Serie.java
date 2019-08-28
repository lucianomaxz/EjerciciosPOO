public class Serie {
    private String titulo;
    private int nrotemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    protected static int defectotemporadas=3;
    protected static boolean defectoentregado=false;
    protected static String defectotitulo="";
    protected static String defectogenero="";
    protected static String defectocreador="";

    public Serie() {
        this.titulo = titulo;
        this.nrotemporadas = defectotemporadas;
        this.genero = defectogenero;
        this.creador = defectocreador;
        this.entregado=defectoentregado;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.nrotemporadas = defectotemporadas;
        this.genero = defectogenero;
        this.entregado=defectoentregado;
    }

    public Serie(String titulo, int nrotemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.nrotemporadas = nrotemporadas;
        this.genero = genero;
        this.creador = creador;

    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNrotemporadas() {
        return nrotemporadas;
    }

    public void setNrotemporadas(int nrotemporadas) {
        this.nrotemporadas = nrotemporadas;
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
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", nrotemporadas=" + nrotemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }
}
