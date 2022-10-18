package futbol;

public class Portero extends Futbolista{
	
    public short golesRecibidos=0;
    public byte dorsal=0;
    
    public Portero(String nombre, int edad,  short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + this.dorsal + ". Le han marcado " 
                + golesRecibidos;
    }
    
    
//Methods

    public int compareTo(Object port){
        Portero por=(Portero) port;
        return Math.abs(this.golesRecibidos-por.golesRecibidos);
    }
    public boolean jugarConLasManos(){
        return true;
    }

     //Getters and setters
    
    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
}