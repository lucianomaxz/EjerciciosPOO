public class Serie {
    private String titulo;
    private int nrotemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    protected static final boolean DefectoEntregado=false;
    protected static final int DefectoTemp=3;
    protected static final String DefectoTitulo=" ";
    protected static final String Defectogenero=" ";
    protected static final String DefectoCreador=" ";

    public Serie() {
        this.titulo=DefectoTitulo;
        this.nrotemporadas=DefectoTemp;
        this.entregado=DefectoEntregado;
        this.genero=Defectogenero;
        this.creador=DefectoCreador;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.nrotemporadas=DefectoTemp;
        this.entregado=DefectoEntregado;
        this.genero=Defectogenero;
    }

    public Serie(String titulo, int nrotemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.nrotemporadas = nrotemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado=DefectoEntregado;
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

}
