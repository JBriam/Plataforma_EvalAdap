/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class ExamenAdaptadoDAO {
    public void guardarExamenAdaptado(ExamenAdaptado examen) throws SQLException {
        String query = "INSERT INTO ExamenAdaptado (EvaluacionID, ExamenAdaptado, FechaExamen) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getInstancia().getConexion();
             PreparedStatement pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setInt(1, examen.getEvaluacionID());
            pstmt.setString(2, examen.getExamenAdaptado());
            pstmt.setDate(3, new java.sql.Date(examen.getFechaExamen().getTime()));
            pstmt.executeUpdate();

            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    examen.setExamenID(generatedKeys.getInt(1));
                }
            }
        }
    }
    
    public void insertarExamenAdaptado(ExamenAdaptado examen) throws SQLException {
        String sql = "{CALL sp_insertarExamenAdaptado(?, ?, ?)}";
        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, examen.getEvaluacionID());
            stmt.setString(2, examen.getExamenAdaptado());
            stmt.setDate(3, new java.sql.Date(examen.getFechaExamen().getTime()));

            stmt.execute();
        }
    }

    public List<ExamenAdaptado> leerExamenesAdaptados() throws SQLException {
        List<ExamenAdaptado> examenes = new ArrayList<>();
        String sql = "{CALL sp_leerExamenesAdaptados()}";

        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                ExamenAdaptado examen = new ExamenAdaptado();
                examen.setExamenID(rs.getInt("ExamenId"));
                examen.setEvaluacionID(rs.getInt("EvaluacionID"));
                examen.setExamenAdaptado(rs.getString("ExamenAdaptado"));
                examen.setFechaExamen(rs.getDate("FechaExamen"));

                examenes.add(examen);
            }
        }

        return examenes;
    }

    public void actualizarExamenAdaptado(ExamenAdaptado examen) throws SQLException {
        String sql = "{CALL sp_actualizarExamenAdaptado(?, ?, ?, ?)}";
        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, examen.getExamenID());
            stmt.setInt(2, examen.getEvaluacionID());
            stmt.setString(3, examen.getExamenAdaptado());
            stmt.setDate(4, new java.sql.Date(examen.getFechaExamen().getTime()));

            stmt.execute();
        }
    }

    public void eliminarExamenAdaptado(int examenId) throws SQLException {
        String sql = "{CALL sp_eliminarExamenAdaptado(?)}";
        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, examenId);
            stmt.execute();
        }
    }

    public ExamenAdaptado leerExamenAdaptadoPorId(int examenId) throws SQLException {
        ExamenAdaptado examen = null;
        String sql = "{CALL sp_leerExamenAdaptadoPorId(?)}";

        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, examenId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    examen = new ExamenAdaptado();
                    examen.setExamenID(rs.getInt("ExamenId"));
                    examen.setEvaluacionID(rs.getInt("EvaluacionID"));
                    examen.setExamenAdaptado(rs.getString("ExamenAdaptado"));
                    examen.setFechaExamen(rs.getDate("FechaExamen"));
                }
            }
        }

        return examen;
    }

    // Otros métodos CRUD...
}
