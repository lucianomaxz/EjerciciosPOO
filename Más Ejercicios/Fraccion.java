public class Fraccion {
    private double dividendo;
    private double divisor;

    public Fraccion(double dividendo, double divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    @Override
    public String toString() {
        return "Fraccion{" +
                "X=" + dividendo +
                ", Y=" + divisor +
                '}';
    }

   public double sumar(double num,double deno){
        return ((this.dividendo/this.divisor)+(num/deno));
   }

    public double multiplicacion (double num,double deno){
        return ((this.dividendo/this.divisor)+(num/deno));
    }

}
