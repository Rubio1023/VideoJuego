// Paquete armas
package armas;

import java.util.Scanner;

import ataques.AtaqueDeCuchilla;

// Clase Arco que implementa la interfaz Arma
public class Cuchilla implements Arma 
{
    private AtaqueDeCuchilla ataqueDeCuchilla = new AtaqueDeCuchilla();  // Crear una instancia de AtaqueDeArco
    private Scanner scanner = new Scanner(System.in);  // Para leer la opción de ataque

    @Override
    public void seleccionarAtaque() 
    {
        // Seleccionar el ataque
        System.out.println("Selecciona un ataque con el cuchillo: \n 1: Ataque Furtivo \n 2: Ataque Sigiloso \n 3: Envenenamiento");
        int opcion = scanner.nextInt();

        // Llamar al método correspondiente según la opción seleccionada
        switch (opcion) 
        {
            case 1:
                ataqueDeCuchilla.AtaqueFurtivo();  // Ejecutar Ataque furtivo
                break;
            case 2:
                ataqueDeCuchilla.AtaqueSigiloso();  // Ejecutar Ataque sigiloso
                break;
            case 3:
                ataqueDeCuchilla.Envenenamiento();  // Ejecutar Envenenamiento
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
