package personajes;
import java.util.List;
import armas.Armas;
import ataques.Ataque;

public class Archimago extends Personajes
{
    private Armas arma;
    // Constructor
    public Archimago(String nombre, int HP, int MP, Armas armas) 
    {
        super(nombre, HP, MP, armas);
    }
    // Método para realizar un ataque
    @Override
    public void atacar(Personajes enemigo, int indiceAtaque)
    {
        List<Ataque> listaAtaques = this.arma.getAtaques();
        
        // Verifica que el índice sea válido
        if (indiceAtaque >= 0 && indiceAtaque < listaAtaques.size()) 
        {
            Ataque ataque = listaAtaques.get(indiceAtaque);  // Selecciona el ataque por índice
            
            if (this.arma.getMP() >= ataque.getCostoMP()) 
            {
                int damage = ataque.realizarAtaque();  // Realiza el ataque
                enemigo.recibirDamage(damage);  // Aplica el daño al enemigo
                this.arma.reducirMP(ataque.getCostoMP());  // Reduce el MP del personaje
            } else {
                System.out.println("No tienes suficiente MP para realizar este ataque.");
            }
        } else {
            System.out.println("Índice de ataque no válido.");
        }
    }
}
