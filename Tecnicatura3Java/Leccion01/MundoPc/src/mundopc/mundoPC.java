package mundopc;

import ar.com.sytem2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); // Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 32); // Importar la clase
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorACER = new Monitor("ACER", 13); // Importar la clase
        Teclado tecladoACER = new Teclado("Bluetooth", "ACER");
        Raton ratonACER = new Raton("Bluetooth", "ACER");
        Computadora computadoraACER = new Computadora("Computadora ACER", monitorACER, tecladoACER, ratonACER);
        
        Monitor monitorDELL = new Monitor("DELL", 13); // Importar la clase
        Teclado tecladoDELL = new Teclado("Bluetooth", "DELL");
        Raton ratonDELL = new Raton("Bluetooth", "DELL");
        Computadora computadoraDELL = new Computadora("Computadora DELL", monitorDELL, tecladoDELL, ratonDELL);
        
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        
        Orden orden1 = new Orden(); // Inicializamos el arreglo vacio
        Orden orden2 = new Orden(); // Una nueva lista oara el objeto orden2
        
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraACER);
        orden1.agregarComputadora(computadoraDELL);
        orden1.agregarComputadora(computadorasVarias);
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraACER);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraDELL);
        
        orden2.agregarComputadora(computadorasVarias);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
        //Crear mas objetos de tipo omptuadora con todos sus elementos
        //completar una lista en el objeto orden1 que llegue a los 10 elementos
    }
}
