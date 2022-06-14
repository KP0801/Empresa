import java.util.List;

public class Empresa {
     private String nombre;
     private final List<Empleado> empleados;



     public Empresa (String nombre,List<Empleado> empleados){
       this.nombre=nombre;
       this.empleados=empleados;
    }
    
    

     public String getNombre(){
            return nombre;
     }

     public void setNombre(String nombre){
         this.nombre=nombre;
     }

     public List<Empleado> getEmpleados(){
         return empleados;
     }

     void contratar(Empleado objEmpleado){
        empleados.add(objEmpleado);
     }

     

}

