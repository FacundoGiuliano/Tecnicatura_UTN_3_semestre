package utn.datos;
import static utn.conexion.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import utn.dominio.Estudiante;

public class EstudianteDAO {
    public List<Estudiante> listar(){
        List<Estudiante> estudiantes = new ArrayList<>();
        // Objetos necesarios para comunicarnos con la bd
        PreparedStatement ps; // Envia la sentencia
        ResultSet rs; // Obtiene el resultado
        // Creamos un objeto de tipo conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                estudiantes.add(estudiante);
            }
        } catch (Exception e){
            System.out.println("Ocurrio un error al seleccionar datos: "+e.getMessage());
        }
        finally{
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: "+e.getMessage());
            }
        }
        return estudiantes;
    }
}
