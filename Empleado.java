public class Empleado {
        private String nombre;
        private Float sueldo;

        public Empleado(String nombre,Float sueldo){
            this.nombre=nombre;
            this.sueldo=sueldo;
        }

        public Float getSueldo(){
            return sueldo;
        }

        public void setSueldo(Float sueldo){
            this.sueldo=sueldo;
        }

        public String getNombre(){
            return nombre;
        }

        public  void setNombre(String nombre){
            this.nombre=nombre;
        }

       
}
