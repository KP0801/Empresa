import java.util.List;

public class Cliente {
    private  String nombre;
    private String edad;
    private Empresa empresa;
    private static List<Cliente> clientes;

    public Cliente(String nombre , String edad,Empresa empresa){
        this.nombre=nombre;
        this.edad=edad;
        this.empresa=empresa;
    }


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getEdad(){
        return edad;
    }
    public void setEdad(String edad){
        this.edad=edad;
    }



    public void setEmpresa(Empresa empresa){
        this.empresa=empresa;
    }
    

    public  Empresa  getEmpresa(){
        return empresa;
    }

    
    
    public String toString(){
        return nombre;
    }
  
}




