public class ProyectoPersona {
    public static void main(String[]args){
        Persona persona1=new Persona("Luciano","Canteros",18,"42789611",'g',67,1.60);

        persona1.comprobarsexo();

        persona1.calcularMC();

        persona1.mayoredad();

        System.out.println(persona1.toString());
    }
}

