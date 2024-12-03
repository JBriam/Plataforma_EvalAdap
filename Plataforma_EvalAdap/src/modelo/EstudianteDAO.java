
package modelo;

import java.sql.*;
import modelo.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import vista.panel01;

public class EstudianteDAO {
// Método para insertar un nuevo estudiante usando el procedimiento almacenado
    public boolean insertarEstudiante(Estudiante estudiante) {
        String sql = "{CALL sp_insertarEstudiante(?, ?, ?, ?)}";
        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, estudiante.getNombre());
            stmt.setInt(2, estudiante.getEdad());
            stmt.setString(3, estudiante.getNivelAcademico());
            stmt.setDate(4, new java.sql.Date(estudiante.getFechaInscripcion().getTime()));

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al insertar el estudiante: " + e.getMessage());
            return false;
        }
    }

    // Método para leer todos los estudiantes usando el procedimiento almacenado
    public List<Estudiante> leerEstudiantes() {
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        String sql = "{CALL sp_leerEstudiantes()}";

        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setEstudianteID(rs.getInt("EstudianteId"));
                estudiante.setNombre(rs.getString("Nombre"));
                estudiante.setEdad(rs.getInt("Edad"));
                estudiante.setNivelAcademico(rs.getString("NivelAcademico"));
                estudiante.setFechaInscripcion(rs.getDate("FechaInscripcion"));
                listaEstudiantes.add(estudiante);
            }

        } catch (SQLException e) {
            System.out.println("Error al leer estudiantes: " + e.getMessage());
        }

        return listaEstudiantes;
    }

    // Método para actualizar un estudiante usando el procedimiento almacenado
    public boolean actualizarEstudiante(Estudiante estudiante) {
        String sql = "{CALL sp_actualizarEstudiante(?, ?, ?, ?, ?)}";

        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, estudiante.getEstudianteID());
            stmt.setString(2, estudiante.getNombre());
            stmt.setInt(3, estudiante.getEdad());
            stmt.setString(4, estudiante.getNivelAcademico());
            stmt.setDate(4, new java.sql.Date(estudiante.getFechaInscripcion().getTime()));

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al actualizar el estudiante: " + e.getMessage());
            return false;
        }
    }

    // Método para eliminar un estudiante usando el procedimiento almacenado
    public boolean eliminarEstudiante(int estudianteId) {
        String sql = "{CALL sp_eliminarEstudiante(?)}";

        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, estudianteId);
            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al eliminar el estudiante: " + e.getMessage());
            return false;
        }
    }

    // Método para leer un estudiante por su ID usando el procedimiento almacenado
    public Estudiante leerEstudiantePorId(int estudianteId) {
        String sql = "{CALL sp_leerEstudiantePorId(?)}";
        Estudiante estudiante = null;

        try (Connection conn = Conexion.getInstancia().getConexion();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, estudianteId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    estudiante = new Estudiante();
                    estudiante.setEstudianteID(rs.getInt("EstudianteId"));
                    estudiante.setNombre(rs.getString("Nombre"));
                    estudiante.setEdad(rs.getInt("Edad"));
                    estudiante.setNivelAcademico(rs.getString("NivelAcademico"));
                    estudiante.setFechaInscripcion(rs.getDate("FechaInscripcion"));
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al leer estudiante por ID: " + e.getMessage());
        }

        return estudiante;
    }
    
    
}

    
