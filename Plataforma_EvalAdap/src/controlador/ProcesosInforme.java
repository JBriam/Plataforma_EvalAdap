package controlador;

import java.util.*;
import vista.panel10;
import vista.panel11;
import vista.panel12;

public class ProcesosInforme {
       
    public static void LimpiarEntradas1(panel10 p10) {
        p10.txtCod.setText("");
        p10.txtProgreso.setText("");
        p10.txtFecha.setDate(new Date());
    }
    
    public static void Presentacion1(panel10 p10) {
        p10.setTitle("Informe...");
        p10.setVisible(true);
    }
    
    public static void LimpiarEntradas2(panel11 p11) {
        p11.txtCod.setText("");
        p11.txtProgreso.setText("");
        p11.txtFecha.setDate(new Date());
    }
    
    public static void Presentacion2(panel11 p11) {
        p11.setTitle("Informe...");
        p11.setVisible(true);
    }
    
    public static void LimpiarEntradas3(panel12 p12) {
        p12.txtCod.setText("");
        p12.txtProgreso.setText("");
        p12.txtFecha.setDate(new Date());
    }
    
    public static void Presentacion3(panel12 p12) {
        p12.setTitle("Informe...");
        p12.setVisible(true);
    }
    
}
