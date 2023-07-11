/*
    En Java, el autoboxing es un mecanismo que permite convertir automáticamente un tipo primitivo en su correspondiente
    clase envolvente (wrapper class) y viceversa, sin que el programador tenga que hacerlo explícitamente.
    Por ejemplo, cuando se asigna un valor de tipo int a una variable de tipo Integer, o cuando se agrega un valor de
    tipo int a una colección de objetos Integer, el autoboxing convierte automáticamente el valor int en un objeto
    Integer. De manera similar, cuando se extrae un valor de una colección de objetos Integer y se asigna a una variable
    de tipo int, el autoboxing convierte automáticamente el objeto Integer en un valor int.
    El autoboxing se introdujo en Java 5 para simplificar el código y hacerlo más legible. Antes de la introducción del
    autoboxing, era necesario realizar conversiones explícitas de tipos primitivos a objetos y viceversa utilizando
    métodos como Integer.valueOf() o intValue(), lo que hacía el código más tedioso de escribir y de leer.
    Por ejemplo, el siguiente código muestra cómo se puede utilizar el autoboxing para asignar un valor int a una
    variable Integer:
    int valorEntero = 42;
    Integer valorInteger = valorEntero; // Autoboxing de int a Integer
    En este ejemplo, el valor int 42 se convierte automáticamente en un objeto Integer a través del autoboxing al
    asignarlo a la variable valorInteger.
    Es importante tener en cuenta que el autoboxing puede tener un impacto en el rendimiento de una aplicación, ya que
    implica una sobrecarga adicional para la JVM en la creación de objetos y la gestión de memoria. Por lo tanto, se
    recomienda utilizar el autoboxing con moderación y siempre tener en cuenta su impacto en el rendimiento de la aplicación.
*/

package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        /*
            Clases envolventes o Wrapper
            De tipos primitivos:
        int = La clase envolvente es Integer
        long = La clase envolvente es Long
        float = La clase envolvente es Float
        double = La clase envolvente es Double
        boolean = La clase envolvente es Boolean
        byte = La clase envolvente es Byte
        char = La clase envolvente es Character
        short = La clase envolvente es Short
        */
        
        int enteroPrim = 10; // Tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        
        Integer entero = 10; // Tipo Object con la clase Integer
        System.out.println("entero = " + entero.doubleValue()); // Autoboxing
        
        int entero2 = entero; // Unboxing
        System.out.println("entero2 = " + entero2);
    }
}
