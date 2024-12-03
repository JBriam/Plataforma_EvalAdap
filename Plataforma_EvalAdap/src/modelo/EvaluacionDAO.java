
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class EvaluacionDAO {
    public void insertarEvaluacion(Evaluacion evaluacion) throws SQLException {
        String sql = "{CALL sp_insertarEvaluacion(?, ?, ?, ?)}";
        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, evaluacion.getEstudianteID());
            stmt.setString(2, evaluacion.getResultadosAnteriores());
            stmt.setFloat(3, (float)evaluacion.getTiempoPromedioRespuesta());
            stmt.setString(4, evaluacion.getDificultadPercibida());
            stmt.execute();
        }
    }

    public List<Evaluacion> leerEvaluaciones() throws SQLException {
        List<Evaluacion> evaluaciones = new ArrayList<>();
        String sql = "{CALL sp_leerEvaluaciones()}";

        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Evaluacion evaluacion = new Evaluacion();
                evaluacion.setEvaluacionID(rs.getInt("EvaluacionID"));
                evaluacion.setEstudianteID(rs.getInt("EstudianteID"));
                evaluacion.setResultadosAnteriores(rs.getString("ResultadosAnteriores"));
                evaluacion.setTiempoPromedioRespuesta(rs.getFloat("TiempoPromedioRespuesta"));
                evaluacion.setDificultadPercibida(rs.getString("DificultadPercibida"));

                evaluaciones.add(evaluacion);
            }
        }

        return evaluaciones;
    }

    public void actualizarEvaluacion(Evaluacion evaluacion) throws SQLException {
        String sql = "{CALL sp_actualizarEvaluacion(?, ?, ?, ?, ?)}";
        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, evaluacion.getEvaluacionID());
            stmt.setInt(2, evaluacion.getEstudianteID());
            stmt.setString(3, evaluacion.getResultadosAnteriores());
            stmt.setFloat(4, (float)evaluacion.getTiempoPromedioRespuesta());
            stmt.setString(5, evaluacion.getDificultadPercibida());

            stmt.execute();
        }
    }

    public void eliminarEvaluacion(int evaluacionId) throws SQLException {
        String sql = "{CALL sp_eliminarEvaluacion(?)}";
        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, evaluacionId);
            stmt.execute();
        }
    }

    public Evaluacion leerEvaluacionPorId(int evaluacionId) throws SQLException {
        Evaluacion evaluacion = null;
        String sql = "{CALL sp_leerEvaluacionPorId(?)}";

        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, evaluacionId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    evaluacion = new Evaluacion();
                    evaluacion.setEvaluacionID(rs.getInt("EvaluacionId"));
                    evaluacion.setEstudianteID(rs.getInt("EstudianteID"));
                    evaluacion.setResultadosAnteriores(rs.getString("ResultadosAnteriores"));
                    evaluacion.setTiempoPromedioRespuesta(rs.getFloat("TiempoPromedioRespuesta"));
                    evaluacion.setDificultadPercibida(rs.getString("DificultadPercibida"));
                }
            }
        }

        return evaluacion;
    }
    
    // Otros métodos CRUD...
}

    
