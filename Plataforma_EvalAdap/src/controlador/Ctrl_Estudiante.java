package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTextField;
import modelo.Conexion;
import modelo.Estudiante;

public class Ctrl_Estudiante {

    /**
     * **************************************************
     * metodo para guardar
     * **************************************************
     */
    public boolean guardar(Estudiante objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into estudiantes values(?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getEdad());
            consulta.setString(4, objeto.getNivelAcademico());
            consulta.setDate(5, new java.sql.Date(objeto.getFechaInscripcion().getTime()));
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para actualizar
     * **************************************************
     */
    public boolean actualizar(Estudiante objeto, int EstudianteID) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update estudiantes set Nombre=?, Edad= ?, NivelAcademico= ?, FechaInscripcion = ? where EstudianteID='" + EstudianteID + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getEdad());
            consulta.setString(3, objeto.getNivelAcademico());
            consulta.setDate(4, new java.sql.Date(objeto.getFechaInscripcion().getTime()));

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar
     * **************************************************
     */
    public boolean eliminar(int EstudianteID) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from estudiantes where EstudianteID ='" + EstudianteID + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e);
        }
        return respuesta;
    }

}
