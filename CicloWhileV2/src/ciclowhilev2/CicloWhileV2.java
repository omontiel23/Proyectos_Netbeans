package ciclowhilev2;

import java.util.Scanner;
public class CicloWhileV2 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Por favor introduce el numero de elementos a iterar:");
        int maxElementos;
        Scanner entradaEscaner = new Scanner(System.in); //Creacion de objeto Scanner para leer datos
        maxElementos = entradaEscaner.nextInt(); //Leemos el valor proporcionado por el usuario
        int contador = 0;//Inicializamos el contador
        while (contador < maxElementos) {
            System.out.println("contador = " + contador);
            contador++;
        }
    }
    
}
