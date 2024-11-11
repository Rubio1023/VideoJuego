package personajes;

import armas.Arma;

// Clase abstracta Personajes con los atributos y métodos comunes a todos los personajes
public abstract class Personajes 
{
    private String nombre; // Nombre del personaje
    private int HP =100; // Puntos de vida
    private int MP =100; // Puntos de magia
    protected Arma armas; // Arma del personaje
    private boolean defendiendo; // Variable para saber si el personaje se está defendiendo
    
    // Constructor
    public Personajes(String nombre, int HP, int MP, Arma armas) 
    {
        this.nombre = nombre;
        this.HP = HP;
        this.MP = MP;
        this.armas = armas;
        this.defendiendo = false;
    }
    
    // Metodo para obtener el nombre del personaje, la vida, la magia y el arma
    public String getNombre() 
    {
        return this.nombre;
    }
    public int getHP() 
    {
        return this.HP;
    }   
    public int getMP() 
    {
        return this.MP;
    }
    public Arma getArma() 
    {
        return this.armas;
    }
    // Metodos abstractos para atacar sin implementacion
    public abstract void atacar(Personajes atacante,Personajes objetivo);
    
    // Metodo para defenderse con implementacion
    public void defender() 
    {
        this.defendiendo = true;
        System.out.println(nombre + " se prepara para defender.");
    }
    
    // Método para reducir los puntos de mana
    public void reducirMP(int cantidad) 
    {
        // Si la cantidad de mana a reducir es menor o igual a los puntos de mana actuales, se resta la cantidad
        if (cantidad <= MP) 
        {
            MP -= cantidad;
            System.out.println(nombre + " el ataque a consumido :" + cantidad + " puntos de mana. mana restante de :" + MP);
        } else {
            System.out.println(nombre + " no tiene suficiente MP.");
        }
    }
    
    // Metodo para recibir daño con implementacion
    public void recibirDamage(int damage) 
    {
        // Si el personaje no se está defendiendo, recibe el daño normalmente
        if (!defendiendo) 
        {
            this.HP -= damage;
            if (this.HP < 0) 
            {
                this.HP = 0;
            }
            System.out.println(nombre + " recibe " + damage + " de daño recibido. vida restante :" + HP);
        } else {
            System.out.println(nombre + " se defendió y no recibe daño.");
            defendiendo = false;
        }    
    }
    // Metodo para verificar si tiene suficiente MP 
    public boolean tieneSuficienteMP(int costoMP) 
    {
        return this.MP >= costoMP;
    }
    // Metodo para mostrar HP y MP con implementacion del atacante
    public void mostrarHPyMP() 
    {
        System.out.println(nombre + " tiene vida restante :" + HP + " y puntos de mana :" + MP);
    }
    // Metodo de validacion, para verificar que este vivo con implementacion
    public boolean estaVivo() 
    {
        return HP > 0;
    }
    // Método para regenerar mana
    public void recargarMP(int cantidad) 
    {
        this.MP += cantidad;
        System.out.println(nombre + " ha regenerado " + cantidad + " puntos de mana. MP actual: " + MP);
    }
    // Método para verificar si el mana es bajo
    public boolean manaBajo() 
    {
        return this.MP < 30; // Umbral para considerar que el mana es bajo
    }
}
