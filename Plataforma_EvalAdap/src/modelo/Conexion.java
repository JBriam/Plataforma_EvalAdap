
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    // Instancia única del Singleton
    private static Conexion instancia;
    // Conexión a la base de datos
    private Connection conexion;
    // Credenciales y URL de la base de datos
    private final String url = "jdbc:mysql://localhost:3306/Plataforma_EvalAdap"; // Reemplaza con tu URL de MySQL
    private final String usuario = "root";  // Reemplaza con tu usuario
    private final String clave = "root"; // Reemplaza con tu contraseña

    // Constructor privado para evitar instanciación desde otras clases
    private Conexion() throws SQLException {
        try {
            // Registrar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Crear la conexión a la base de datos
            this.conexion = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error, No hay Conexión");
            System.out.println("Error al cargar el controlador MySQL: " + e.getMessage());
        }
    }

    // Método para obtener la instancia única
    public static Conexion getInstancia() throws SQLException {
        if (instancia == null) {
            instancia = new Conexion();
        } else if (instancia.getConexion().isClosed()) {
            instancia = new Conexion();
        }
        return instancia;
    }

    // Método para obtener la conexión
    public Connection getConexion() {
        return conexion;
    }
    
    
    //**Para que conecte, añadido recientemente**
    //conexion local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/plataforma_evalAdap", "root", "root");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return null;
    }
}
