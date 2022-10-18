package futbol;

public abstract class Futbolista implements Comparable<Object> {
	
    private String nombre="";
    private int edad=0;
    private final String posicion;

    public Futbolista(String nombre, int edad, String posicion) { 
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    
    
    @Override
    public String toString() {
        return "El futbolista " + this.nombre + " tiene " + getEdad() + ", y juega de " + this.posicion;
    }

    
//GET Y SET
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }
    

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }


    public boolean equals(Futbolista jugador) {
        if(jugador != this) {return false;}
        return true;
        }


    public abstract boolean jugarConLasManos();

    
}
