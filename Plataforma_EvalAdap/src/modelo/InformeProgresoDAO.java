
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class InformeProgresoDAO {
    public void insertarInformeProgreso(InformeProgreso informe) throws SQLException {
        String sql = "{CALL sp_insertarInforme(?, ?, ?)}";
        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, informe.getEstudianteID());
            stmt.setString(2, informe.getProgreso());
            stmt.setDate(3, new java.sql.Date(informe.getFechaInforme().getTime()));
            stmt.execute();
        }
    }

    public List<InformeProgreso> leerInformesProgreso() throws SQLException {
        List<InformeProgreso> informes = new ArrayList<>();
        String sql = "{CALL sp_leerInformes()}";

        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                InformeProgreso informe = new InformeProgreso();
                informe.setInformeID(rs.getInt("InformeID"));
                informe.setEstudianteID(rs.getInt("EstudianteID"));
                informe.setProgreso(rs.getString("Progreso"));
                informe.setFechaInforme(rs.getDate("FechaInforme"));

                informes.add(informe);
            }
        }

        return informes;
    }

    public void actualizarInformeProgreso(InformeProgreso informe) throws SQLException {
        String sql = "{CALL sp_actualizarInforme(?, ?, ?, ?)}";
        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, informe.getInformeID());
            stmt.setInt(2, informe.getEstudianteID());
            stmt.setString(3, informe.getProgreso());
            stmt.setDate(4, new java.sql.Date(informe.getFechaInforme().getTime()));

            stmt.execute();
        }
    }

    public void eliminarInformeProgreso(int informeId) throws SQLException {
        String sql = "{CALL sp_eliminarInforme(?)}";
        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, informeId);
            stmt.execute();
        }
    }

    // Otros métodos CRUD...
}
