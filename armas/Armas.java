package armas;
import ataques.Ataque;
import java.util.List;

public interface Armas 
{
    int realizarAtaque(Ataque ataque); // Agregar un método para realizar un ataque
    List<Ataque> getAtaques();  // Agregar un método para obtener los ataques
    int getMP(); // Agregar un método para obtener los puntos de magia
    void recargarMP(int cantidad); // Agregar un método para recargar los puntos de magia
    int reducirMP(int cantidad); // Agregar un método para reducir los puntos de magia
    void defender(); // Agregar un método para defenderse    
}

