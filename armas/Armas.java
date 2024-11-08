package armas;
import ataques.Ataque;
import java.util.List;

public interface Armas 
{
    int realizarAtaque(Ataque ataque); // Agregar un método para realizar un ataque
    List<Ataque> getAtaques();  // Agregar un método para obtener los ataques
}

