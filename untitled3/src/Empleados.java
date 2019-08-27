public class Empleados {
    private String nombre;
    private String CUIT;
    private int edad;
    private boolean casado;
    private double salario_base;


    protected static final double SalarioDefecto = 8000;


    public Empleados(String nombre, String CUIT, int edad, boolean casado, double salario_base) {
        this.nombre = nombre;
        this.CUIT = CUIT;
        this.edad = edad;
        this.casado = casado;
        this.salario_base = salario_base;
    }


    public Empleados(String nombre, String CUIT, int edad, boolean casado) {
        this.nombre = nombre;
        this.CUIT = CUIT;
        this.edad = edad;
        this.casado = casado;
        this.salario_base=SalarioDefecto;
    }


    public char antiguedad() {

        char categoria;
        if (edad <= 21) {
             categoria = 'C';
        } else if (edad >= 22 && edad <= 35) {
            categoria = 'B';
        } else {
           categoria = 'A';
        }

        return categoria;
    }


    public double getSalario_base() {
        return salario_base;
    }

    public void aumentarsalario() {

        if (antiguedad() == 'A') {
            salario_base = salario_base + ((salario_base * 0.20));

            System.out.println(salario_base);
        } else if (antiguedad() == 'B') {
            salario_base = salario_base + ((salario_base * 0.10));
            System.out.println("Su nuevo salario es "+salario_base);
        } else {
            salario_base = salario_base + ((salario_base * 0.05));
            System.out.println("Su nuevo salario es "+salario_base);
        }

    }
    }




