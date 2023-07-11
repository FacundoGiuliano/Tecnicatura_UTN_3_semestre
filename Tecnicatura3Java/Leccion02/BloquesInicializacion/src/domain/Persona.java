package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static { // Bloque de inicializacion estatio
        System.out.println("Ejecucion del bloque estatico");
        ++Persona.contadorPersonas;
        // idPersona = 10; No es estatico, por eso tenemos error.
    }
    
    { // Bloque de inicializacion NO estatico o contexto dinamico
        System.out.println("Ejecucion del bloque NO ESTATICO");
        this.idPersona = Persona.contadorPersonas++; // Incrementamos el atributo
    }
    
    // Los bloques de inicializacion se ejeutan antes del construtor de la clase
    
    public Persona() {
        System.out.println("Ejecucion del constructor");
    }
    
    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
