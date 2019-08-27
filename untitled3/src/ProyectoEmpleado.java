public class ProyectoEmpleado {
    public static void main(String[]args){


        Empleados empleados[]=new Empleados[4];

        empleados[0]=new Empleados("Luciano","204278961",26,false,10000);

        empleados[1]=new Empleados("Lucas","256128961",20,false,15000);

        empleados[2]=new Empleados("Rodrigo","204538961",19,true,12000);

        empleados[3]=new Empleados("Fabricio","259878961",43,false,20000);


        for(int i=0;i<4;i++){

            empleados[i].aumentarsalario();

        }



    }






}