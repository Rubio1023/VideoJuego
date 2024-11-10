// Paquete armas
package armas;

import java.util.Scanner;

import ataques.AtaqueDeBaston;

// Clase Arco que implementa la interfaz Arma
public class Baston implements Arma 
{
    private AtaqueDeBaston ataqueDeBaston = new AtaqueDeBaston();  // Crear una instancia de AtaqueDeArco
    private Scanner scanner = new Scanner(System.in);  // Para leer la opción de ataque

    @Override
    public void seleccionarAtaque() 
    {
        // Seleccionar el ataque
        System.out.println("Selecciona un ataque con el bastón:\n 1: Hechizo Basico\n 2: Hechizo Elemental \n 3: Hechizo Arcano");
        int opcion = scanner.nextInt();

        // Llamar al método correspondiente según la opción seleccionada
        switch (opcion) 
        {
            case 1:
                ataqueDeBaston.HechizoBasico();  // Ejecutar Hechizo básico
                break;
            case 2:
                ataqueDeBaston.HechizoElemental(); // Ejecutar Hechizo elemental
                break;
            case 3:
                ataqueDeBaston.HechizoArcano();  // Ejecutar Hechizo arcano
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
