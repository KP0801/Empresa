import java.util.*;

public class Main {

    static LinkedList<Empleado> empleados = new LinkedList<>();
    static LinkedList<Cliente> clientes = new LinkedList<>();
    
    
    public static void main(String[] args){
       
     
        
     Empresa miEmpresa = new Empresa("HCH", empleados);
     Empleado empleado1 = new Empleado("Ramirez", (float) 5000);
     Empleado empleado2 = new Empleado("Carlos", (float) 5000);
     Empleado empleado3 = new Empleado("Fernando",(float) 6000);
     

     Cliente cliente1 = new Cliente("Kevin","20",miEmpresa);
     agregarCliente(cliente1);

     
    
       

    List<Empleado> emp = miEmpresa.getEmpleados();

        miEmpresa.contratar(empleado1);
        miEmpresa.contratar(empleado2);
        miEmpresa.contratar(empleado3);

        for (Empleado empleado : emp) {
            System.out.println("Nombre de empleado "+empleado.getNombre() +"   Sueldo : "+empleado.getSueldo());
        }
       
        for (Cliente cliente : clientes) {
            System.out.println("Nombre del cliente "+cliente.getNombre()+" Edad:"+cliente.getEdad()+" Empresa:"+ miEmpresa.getNombre() );
        }

    }

    public static void agregarCliente(Cliente Objcliente){
        
        clientes.add(Objcliente);

    }


}