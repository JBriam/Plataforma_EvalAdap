package controlador;

import java.util.*;
import vista.panel07;
import vista.panel08;
import vista.panel09;

public class ProcesosExamen {
       
    public static void LimpiarEntradas1(panel07 p7) {
        p7.txtCod.setText("");
        p7.txtExamen.setText("");
        p7.txtFecha.setDate(new Date());
    }
    
    public static void Presentacion1(panel07 p7) {
        p7.setTitle("Exámenes adaptados...");
        p7.setVisible(true);
    }
    
    public static void LimpiarEntradas2(panel08 p8) {
        p8.txtCod.setText("");
        p8.txtExamen.setText("");
        p8.txtFecha.setDate(new Date());
    }
    
    public static void Presentacion2(panel08 p8) {
        p8.setTitle("Exámenes adaptados...");
        p8.setVisible(true);
    }
    
    public static void LimpiarEntradas3(panel09 p9) {
        p9.txtCod.setText("");
        p9.txtExamen.setText("");
        p9.txtFecha.setDate(new Date());
    }
    
    public static void Presentacion3(panel09 p9) {
        p9.setTitle("Exámenes adaptados...");
        p9.setVisible(true);
    }
    
}
