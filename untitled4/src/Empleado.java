public class Empleado {
    private String nombre;
    private String CUIT;
    private int edad;
    private boolean casado;
    private double salario_base;

    protected final double DefectoSalario=8000;


    public Empleado(String nombre, String CUIT, int edad, boolean casado, double salario_base) {
        this.nombre = nombre;
        this.CUIT = CUIT;
        this.edad = edad;
        this.casado = casado;
        this.salario_base = salario_base;
    }

    public Empleado(String nombre, String CUIT, int edad, boolean casado) {
        this.nombre = nombre;
        this.CUIT = CUIT;
        this.edad = edad;
        this.casado = casado;
        this.salario_base=DefectoSalario;
    }

    public char antiguedad(){
       char antiguedad;
        if(edad<=21){
            antiguedad='C';
        }else if(edad>=22 && edad<=35){
            antiguedad='B';
        }else{
            antiguedad='A';
        }
        return antiguedad;
    }

    public void aumentarSalario(){
        if(antiguedad()=='C'){
            salario_base=(salario_base*0.05)+salario_base;
            System.out.println("Su nuevo salario es de "+salario_base);
        }else if(antiguedad()=='B'){
            salario_base=(salario_base*0.10)+salario_base;
            System.out.println("Su nuevo salario es de "+salario_base);
        }else {
            salario_base=(salario_base*0.20)+salario_base;
            System.out.println("Su nuevo salario es de "+salario_base);
        }
    }

    public double getSalario_base() {
        return salario_base;
    }
}
