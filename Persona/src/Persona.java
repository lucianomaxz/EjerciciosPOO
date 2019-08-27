public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    protected static final String apellidodefecto=" ";
    protected static final int edaddefecto=0;
    protected static final char sexodefecto='H';
    protected static final double pesodefecto=0;
    protected static final double alturadefecto=0;

    public Persona(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public Persona(String nombre, String apellido, int edad, String DNI, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso=pesodefecto;
        this.altura=alturadefecto;
    }
    public Persona(String nombre, String apellido, int edad, String DNI, char sexo,double peso,double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso=peso;
        this.altura=altura;
    }

    public double calcularMC(){
        if(peso/(altura*altura)<20){
            System.out.println("Peso ideal");
            return -1;
        }else if(peso/(altura*altura)>19 && peso/(altura*altura)<21){
            System.out.println("Debajo del Peso ideal");
            return 0;
        }else{
            System.out.println("Sobrepeso");
            return 1;
        }
    }

    public boolean mayoredad(){
        if(edad>17){
            boolean flag=true;
            System.out.println("Mayor ");
            return flag;
        }else{
            boolean flag=false;
            System.out.println("Menor ");
            return flag;
        }
    }
    public void comprobarsexo(){
        if(sexo!='H' || sexo!='M'){
            sexo='H';
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}