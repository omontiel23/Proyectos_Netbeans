package calculames;

public class CalculaMes {

      public static void main(String[] args) {
        // TODO code application logic here
        int mes = 6; // Mes del año
        
        String estacion;
        
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Verano";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Invierno";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Otoño";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Primavera";
        } else {
            estacion = "Mes incorrecto";
        }
        System.out.println("La estacion para el mes " + mes + " es: " + estacion);
    }
        
        
}
