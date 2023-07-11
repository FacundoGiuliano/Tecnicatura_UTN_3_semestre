package excepciones;

public class OperacionExcepcion extends RuntimeException{
    
    public OperacionExcepcion(String mensaje) { // Constructor
        super(mensaje);
    }
}
