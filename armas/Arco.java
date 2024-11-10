// Paquete armas
package armas;

import java.util.Scanner;

import ataques.AtaqueDeArco;

// Clase Arco que implementa la interfaz Arma
public class Arco implements Arma 
{
    private AtaqueDeArco ataqueDeArco = new AtaqueDeArco();  // Crear una instancia de AtaqueDeArco
    private Scanner scanner = new Scanner(System.in);  // Para leer la opción de ataque

    @Override
    public void seleccionarAtaque() 
    {
        // Seleccionar el ataque
        System.out.println("Selecciona un ataque con el arco:\n 1: Flecha Rápida\n 2: Flecha de Fuego \n 3: Flecha Oscura");
        int opcion = scanner.nextInt();

        // Llamar al método correspondiente según la opción seleccionada
        switch (opcion) 
        {
            case 1:
                ataqueDeArco.FlachaRapida();;  // Ejecutar disparo rápido
                break;
            case 2:
                ataqueDeArco.FlachaDeFuego();;  // Ejecutar disparo explosivo
                break;
            case 3:
                ataqueDeArco.FlachaOscura();;  // Ejecutar disparo oscuro
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
