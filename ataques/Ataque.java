package ataques;
import personajes.Personajes;

// Interfaz Ataque
public interface Ataque
{
    void ejecutarAtaque(Personajes atacante,Personajes objetivo);  // Método para ejecutar el ataque
}