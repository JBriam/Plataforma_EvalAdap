package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Conexion;
import modelo.Evaluacion;

public class Ctrl_Evaluacion {

    /**
     * **************************************************
     * metodo para guardar
     * **************************************************
     */
    public boolean guardar(Evaluacion objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into evaluaciones values(?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getEstudianteID());
            consulta.setString(3, objeto.getResultadosAnteriores());
            consulta.setDouble(4, objeto.getTiempoPromedioRespuesta());
            consulta.setString(5, objeto.getDificultadPercibida());
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
    public boolean actualizar(Evaluacion objeto, int EvaluacionID) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update evaluaciones set EstudianteID=?, ResultadosAnteriores= ?, TiempoPromedioRespuesta= ?, DificultadPercibida = ? where EvaluacionID='" + EvaluacionID + "'");
            consulta.setInt(1, objeto.getEstudianteID());
            consulta.setString(2, objeto.getResultadosAnteriores());
            consulta.setDouble(3, objeto.getTiempoPromedioRespuesta());
            consulta.setString(4, objeto.getDificultadPercibida());

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
    public boolean eliminar(int EvaluacionID) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from evaluaciones where EvaluacionID ='" + EvaluacionID + "'");
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
