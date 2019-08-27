public class Proyecto {
    public static void main(String[]args){

        Empleado empleado[]=new Empleado[4];

        empleado[0]= new Empleado("luciano","201542325",18,false,15000);

        empleado[1]= new Empleado("luciano","201542325",26,false,20000);

        empleado[2]= new Empleado("luciano","201542325",40,false,12000);

        empleado[3]= new Empleado("luciano","201542325",34,false);

        for(int i=0;i<4;i++){
            empleado[i].aumentarSalario();
        }

    }

}
