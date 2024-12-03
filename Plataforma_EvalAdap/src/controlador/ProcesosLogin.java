package controlador;

import controlador.controlMenu;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import vista.*;

public class ProcesosLogin {
    
    public static void ValidarDatos(String usuario, String contraseña, frmLogin vista) {
        if (usuario.equals("admin") && contraseña.equals("123")) {
            controlMenu cm = new controlMenu(new frmMain());
            vista.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
        }
    }
    
    public static void MostrarContraseña(JCheckBox cb, JPasswordField jp) {
        if (cb.isSelected()) {
            jp.setEchoChar((char) 0);
        } else {
            jp.setEchoChar('*');
        }
    }
    
    
    
    
}
