// Paquete armas
package armas;

import java.util.Scanner;

import ataques.AtaqueDeEspada;

// Clase Arco que implementa la interfaz Arma
public class Espada implements Arma 
{
    private AtaqueDeEspada ataqueDeEspada = new AtaqueDeEspada();  // Crear una instancia de AtaqueDeArco
    private Scanner scanner = new Scanner(System.in);  // Para leer la opción de ataque

    @Override
    public void seleccionarAtaque() 
    {
        // Seleccionar el ataque
        System.out.println("Selecciona un ataque con la espada :\n1: Filo Cortante \n2: Rebanador \n 3: Ataque del Berserker");
        int opcion = scanner.nextInt();

        // Llamar al método correspondiente según la opción seleccionada
        switch (opcion) 
        {
            case 1:
                ataqueDeEspada.FiloCortante();  // Ejecutar Filo cortante
                break;
            case 2:
                ataqueDeEspada.Rebanador();  // Ejecutar Rebanador
                break;
            case 3:
                ataqueDeEspada.AtaqueDelBerserker();  // Ejecutar Ataque del Berserker
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
