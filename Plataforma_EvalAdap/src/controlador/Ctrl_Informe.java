package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Conexion;
import modelo.InformeProgreso;

public class Ctrl_Informe {

    /**
     * **************************************************
     * metodo para guardar
     * **************************************************
     */
    public boolean guardar(InformeProgreso objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into informesprogreso values(?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getEstudianteID());
            consulta.setString(3, objeto.getProgreso());
            consulta.setDate(4, new java.sql.Date(objeto.getFechaInforme().getTime()));
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
    public boolean actualizar(InformeProgreso objeto, int InformeID) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update informesprogreso set EstudianteID=?, Progreso= ?, FechaInforme= ? where InformeID='" + InformeID + "'");
            consulta.setInt(1, objeto.getEstudianteID());
            consulta.setString(2, objeto.getProgreso());
            consulta.setDate(3, new java.sql.Date(objeto.getFechaInforme().getTime()));

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
    public boolean eliminar(int InformeID) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from informesprogreso where InformeID ='" + InformeID + "'");
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
