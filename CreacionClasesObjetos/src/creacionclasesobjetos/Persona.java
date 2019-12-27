
package creacionclasesobjetos;

public class Persona {
   String nombre;
   String apellidoPaterno;
   String apellidoMaterno;
   
   //constructor
   public Persona(){
       System.out.println("primero en ejecutarse!!");
   }
   
   public void desplegarNombre(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido Paterno: "+ apellidoPaterno);
    System.out.println("Apellido Materno: "+ apellidoMaterno);
   }
}
