public class Electrodomesticos {
    private double preciobase;
    private String color;
    private String consumo;
    private int peso;

    protected final String ColorDefecto = "Blanco";

    protected final String ConsumoDefecto = "F";

    protected final double PrecioDefecto = 100.00;

    protected final int PesoDefect = 5;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double preciobase, int peso) {
        this.preciobase = preciobase;
        this.peso = peso;
    }

    public Electrodomesticos(double preciobase, String color, String consumo, int peso) {
        this.preciobase = preciobase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public String getColor() {
        return color;
    }

    public String getConsumo() {
        return consumo;
    }

    public int getPeso() {
        return peso;
    }

    static protected String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
    static protected String consumos[] = {"A", "B", "C", "D", "F"};

    public void ComprobarColor(String color) {
        boolean bandera = false;
        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equals(color)) {
                bandera = true;
                this.color = color;
            } else {
                this.color = ColorDefecto;
            }
        }
    }


    public void ComprobarConsumo(String consumo) {
        for (int j = 0; j < consumos.length; j++) {
            if (consumos[j].equals(consumo)) {
                this.consumo = consumo;
            } else {
                this.consumo = ConsumoDefecto;
            }
        }
    }

    public double PrecioFinal() {
        double plus = 0;
        switch (consumo){
            case "A": plus+=100;break;
            case "B": plus+=80;break;
            case "C": plus+=60;break;
            case "D": plus+=50;break;
            case "E": plus+=30;break;
            case "F": plus+=10;break;
        }
        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso <=49){
            plus+=50;
        }else if(peso>=50 && peso <=79){
            plus+=80;
        }else if(peso>=80) {
            plus += 100;
        }
        return preciobase + plus;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "preciobase=" + preciobase +
                ", color='" + color + '\'' +
                ", consumo='" + consumo + '\'' +
                ", peso=" + peso +
                '}';
    }
}