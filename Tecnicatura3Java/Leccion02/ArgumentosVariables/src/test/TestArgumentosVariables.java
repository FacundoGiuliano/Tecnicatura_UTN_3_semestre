
package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(1, 2);
        imprimirNumeros(3, 4, 5, 6);
        variosParámetros("Juan", "Alvez", 7, 8, 9);
    }
    
    private static void variosParámetros(String nombre, String apellido, int ...numeros) {
        imprimirNumeros(numeros);
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido);
    }
    
    private static void imprimirNumeros(int ...numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: "+numeros[i]);
        }
    }
}
