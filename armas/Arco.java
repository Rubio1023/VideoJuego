// Paquete armas
package armas;

import java.util.Scanner;
import ataques.arco.AtaqueDeArco;  // Asegúrate de importar AtaqueDeArco

// Clase Arco que implementa la interfaz Arma
public class Arco implements Arma 
{
    private AtaqueDeArco ataqueDeArco = new AtaqueDeArco();  // Crear una instancia de AtaqueDeArco
    private Scanner scanner = new Scanner(System.in);  // Para leer la opción de ataque

    @Override
    public void seleccionarAtaque() 
    {
        // Seleccionar el ataque
        System.out.println("Selecciona un ataque con el arco:");
        System.out.println("1: Disparo Rápido");
        System.out.println("2: Disparo Explosivo");

        int opcion = scanner.nextInt();

        // Llamar al método correspondiente según la opción seleccionada
        switch (opcion) 
        {
            case 1:
                ataqueDeArco.disparoRapido();  // Ejecutar disparo rápido
                break;
            case 2:
                ataqueDeArco.disparoExplosivo();  // Ejecutar disparo explosivo
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
