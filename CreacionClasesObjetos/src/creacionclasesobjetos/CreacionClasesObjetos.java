
package creacionclasesobjetos;

public class CreacionClasesObjetos {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        
                p1.desplegarNombre();

        p1.nombre = "Armando";
        p1.apellidoPaterno = "Esparza";
        p1.apellidoMaterno = "Lara";
        
        p1.desplegarNombre();
        
    }
    
}
  