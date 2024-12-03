package controlador;

import java.util.*;
import vista.panel04;
import vista.panel05;
import vista.panel06;

public class ProcesosEvaluacion {
       
    public static void LimpiarEntradas1(panel04 p4) {
        p4.txtCod.setText("");
        p4.txtResultados.setText("");
        p4.txtTiempo.setText("");
        p4.txtDificultad.setText("");
    }
    
    public static void Presentacion1(panel04 p4) {
        p4.setTitle("Evaluaciones...");
        p4.setVisible(true);
    }
    
    public static void LimpiarEntradas2(panel05 p5) {
        p5.txtCod.setText("");
        p5.txtResultados.setText("");
        p5.txtTiempo.setText("");
        p5.txtDificultad.setText("");
    }
    
    public static void Presentacion2(panel05 p5) {
        p5.setTitle("Evaluaciones...");
        p5.setVisible(true);
    }
    
    public static void LimpiarEntradas3(panel06 p6) {
        p6.txtCod.setText("");
        p6.txtResultados.setText("");
        p6.txtTiempo.setText("");
        p6.txtDificultad.setText("");
    }
    
    public static void Presentacion3(panel06 p6) {
        p6.setTitle("Evaluaciones...");
        p6.setVisible(true);
    }
    
}
