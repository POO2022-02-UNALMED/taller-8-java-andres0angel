package futbol;

public class Jugador extends Futbolista {
    public short  golesMarcados=0;
    public byte dorsal=0;
    
    
     
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados=golesMarcados;
        this.dorsal=dorsal;
    }
    public Jugador(){
        super();
        this.golesMarcados=289;
        this.dorsal=7;
    }
    
    
    
    
    //GET Y SET
    
    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short goles) {
        this.golesMarcados = goles;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsalJugador) {
        this.dorsal = dorsalJugador;
    }

    
    @Override
    public int compareTo(Object jug){
        Jugador ju=(Jugador) jug;
        int x=0;
        if (this.getEdad()-ju.getEdad()>0){
            x=this.getEdad()-ju.getEdad();
        }else{
            x= Math.abs(this.getEdad()-ju.getEdad());
        }
        return x;
    }
    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + dorsal;
    }
    public boolean jugarConLasManos() {
        return false;
    }
    
  
}