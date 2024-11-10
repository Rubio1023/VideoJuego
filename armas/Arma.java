package armas;
import personajes.Personajes;
// Interfaz Arma
public interface Arma 
{
    void seleccionarAtaque(Personajes atacante,Personajes objetivo);  // Método para seleccionar el ataque
    void ejecutarAtaque(Personajes atacante,Personajes objetivo);     // Método para ejecutar el ataque
}
