import java.util.*;

public class Main {

    static LinkedList<Empleado> empleados = new LinkedList<>();

    
    
    public static void main(String[] args){
    Empresa miEmpresa = new Empresa("HCH", empleados);
     Empleado empleado1 = new Empleado("Ramirez", (float) 5000);
     Empleado empleado2 = new Empleado("Carlos", (float) 5000);
     
    List<Empleado> emp = miEmpresa.getEmpleados();

        miEmpresa.contratar(empleado1);
        miEmpresa.contratar(empleado2);

        for (Empleado empleado : emp) {
            System.out.println(empleado.getNombre());
        }
       
    }


}