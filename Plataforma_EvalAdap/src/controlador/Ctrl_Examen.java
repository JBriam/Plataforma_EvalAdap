package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Conexion;
import modelo.ExamenAdaptado;

public class Ctrl_Examen {

    /**
     * **************************************************
     * metodo para guardar
     * **************************************************
     */
    public boolean guardar(ExamenAdaptado objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into examenadaptado values(?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getEvaluacionID());
            consulta.setString(3, objeto.getExamenAdaptado());
            consulta.setDate(4, new java.sql.Date(objeto.getFechaExamen().getTime()));
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
    public boolean actualizar(ExamenAdaptado objeto, int ExamenID) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update examenadaptado set EvaluacionID=?, ExamenAdaptado= ?, FechaExamen= ? where ExamenID='" + ExamenID + "'");
            consulta.setInt(1, objeto.getEvaluacionID());
            consulta.setString(2, objeto.getExamenAdaptado());
            consulta.setDate(3, new java.sql.Date(objeto.getFechaExamen().getTime()));

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
    public boolean eliminar(int ExamenID) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from examenadaptado where ExamenID ='" + ExamenID + "'");
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
