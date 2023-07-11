package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        datos.listar();
        Imprimir(datos);
        datos = new ImplementacionOracle();
        datos.listar();
        Imprimir(datos);
    }

    public static void Imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
