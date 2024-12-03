package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.*;

public class controlLogin implements ActionListener {

    frmLogin vista;

    public controlLogin(frmLogin fl) {
        vista = fl;
        vista.setTitle("Ingrese al sistema");
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.btnIngresar.addActionListener(this);
        vista.ckbMostrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnIngresar) {
            String usuario = vista.txtUsuario.getText();
            String contraseña = vista.txtContraseña.getText();
            ProcesosLogin.ValidarDatos(usuario, contraseña, vista);
        }

        if (e.getSource() == vista.ckbMostrar) {
            ProcesosLogin.MostrarContraseña(vista.ckbMostrar, vista.txtContraseña);
        }

    }

}
