package enumeraciones;

public enum Continentes {
    AFRICA(53, "1.2 billones"),
    EUROPA(36, "2 billones"),
    ASIA(44, "3.5 billones"),
    AMERICA(34, "2 billones"),
    OCEANIA(14, "1 billon");
    
    private final int paises;
    private final String habitantes;
    
    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    //Metodo Get
    public int getPaises() {
        return this.paises;
    }
    
    public String getHabitantes() {
        return this.habitantes;
    }
}
