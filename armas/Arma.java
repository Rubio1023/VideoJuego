package armas;
import personajes.Personajes;
// Interfaz Arma
public interface Arma 
{
    void seleccionarAtaque(Personajes objetivo);  // Método para seleccionar el ataque
    void ejecutarAtaque(Personajes objetivo);     // Método para ejecutar el ataque
}
