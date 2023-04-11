/**
 * En esta clase gestionamos los datos de un telefono.
 */
public class Telefono {
    //Marca del telefono.
    private String marca;
    //Tamaño de almacenamiento del telefono.
    private int capacidad;
    //Si esta encendido o apagado el telefono.
    private boolean encendido;
    
    public Telefono(String nuevaMarca, int nuevaCapacidad) {
        marca = nuevaMarca;
        capacidad = nuevaCapacidad;
        encendido = true;
    }
    
    /**
     * Devuelve la marca del telefono.
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Devuelve el tamaño de almacenamiento del telefono.
     */
    public int getCapacidad() {
        return capacidad;
    }
    
    /**
     * Devuelve si esta encendido el telefono.
     */
    public boolean getEncendido() {
        return encendido;
    }
    
    /**
     * Cambia la marca del telefono.
     */
    public void setMarca(String nuevaMarca) {
        marca = nuevaMarca;
    }
    
    /**
     * Aumenta el tamaño de almacenamiento del telefono.
     */
    public void setAumentarCapacidad(int masCapacidad) {
        capacidad = capacidad + masCapacidad;
    }
    
    /**
     * Cambia estado del telefono, de encendido a apagado o viceversa.
     */
    public void pulsarBoton() {
        encendido = !encendido;
    }
    
    /**
     * Imprime por pantalla los detalles del telefono.
     */
    public void imprimirDetalles() {
        String sinoEncendido = "";
        if(encendido == true) {
            sinoEncendido = "si";
        }
        else {
            sinoEncendido = "no";
        }
        System.out.println("Esta es la marca del telefono: " + marca + " | Este es el tamaño de alamacenamiento del telefono: " + capacidad + "Gb" + " | ¿Este telefono esta encendido?: " + sinoEncendido);
    }
    
    /**
     * Devuelve los detalles del telefono.
     */
    public String getDetalles() {
        String sinoEncendido = "";
        if(encendido == true) {
            sinoEncendido = "si";
        }
        else {
            sinoEncendido = "no";
        }
        return "Esta es la marca del telefono: " + marca + " | Este es el tamaño de alamacenamiento del telefono: " + capacidad + "Gb" + " | ¿Este telefono esta encendido?: " + sinoEncendido;
    }
}