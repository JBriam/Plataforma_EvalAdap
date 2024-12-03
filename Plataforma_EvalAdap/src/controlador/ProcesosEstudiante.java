package controlador;

import java.util.*;
import vista.panel01;
import vista.panel02;
import vista.panel03;

public class ProcesosEstudiante {
    
    /*public static Estudiante LeerEstudiante(panel01 p1) {
        Estudiante e = new Estudiante();
        e.setNombre(p1.txtNombre.getText());
        e.setEdad(Integer.parseInt(p1.txtEdad.getText()));
        e.setNivelAcademico(p1.txtNivel.getText());
        e.setFechaInscripcion(p1.txtFecha.getDate());
        return e;
    }
    
    public static boolean EliminarEstudiante(ArrayList<Estudiante> lista, int cod) {
        Iterator<Estudiante> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Estudiante estudiante = iterator.next();
            if (estudiante.getEstudianteID() == cod) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }*/
    
    public static void LimpiarEntradas1(panel01 p1) {
        p1.txtNombre.setText("");
        p1.txtEdad.setText("");
        p1.txtNivel.setText("");
        p1.txtFecha.setDate(new Date());
    }
    
    public static void Presentacion1(panel01 p1) {
        p1.setTitle("Estudiantes...");
        p1.setVisible(true);
    }
    
    public static void LimpiarEntradas2(panel02 p2) {
        p2.txtNombre.setText("");
        p2.txtEdad.setText("");
        p2.txtNivel.setText("");
        p2.txtFecha.setDate(new Date());
    }
    
    public static void Presentacion2(panel02 p2) {
        p2.setTitle("Estudiantes...");
        p2.setVisible(true);
    }
    
    public static void LimpiarEntradas3(panel03 p3) {
        p3.txtNombre.setText("");
        p3.txtEdad.setText("");
        p3.txtNivel.setText("");
        p3.txtFecha.setDate(new Date());
    }
    
    public static void Presentacion3(panel03 p3) {
        p3.setTitle("Estudiantes...");
        p3.setVisible(true);
    }
    
}
