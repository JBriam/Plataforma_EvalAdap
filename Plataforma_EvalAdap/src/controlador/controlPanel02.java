package controlador;

import java.awt.event.*;
import java.util.ArrayList;
import modelo.Estudiante;
import vista.panel02;

public class controlPanel02 implements ActionListener{
    
    panel02 vista;
    ArrayList<Estudiante> auxiliar;
    //ListaClientes lista;
    
    public controlPanel02(panel02 p2) {
        vista = p2;
        vista.btnActualizar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        //lista = new ListaClientes();
        ProcesosEstudiante.Presentacion2(vista);
        //this.auxiliar = new ArrayList<>();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.btnLimpiar) {
            ProcesosEstudiante.LimpiarEntradas2(vista);
        }
        /*
        if (e.getSource() == vista.btnModificar) {
            String codigoModificar = JOptionPane.showInputDialog("Ingrese el código del cliente a modificar:");
            if (codigoModificar != null && !codigoModificar.isEmpty()) {
                int indexModificar = BusquedaClientes.BuscarPorCodigo(lista.Lista, codigoModificar);
                if (indexModificar != -1) {
                    Cliente clienteModificar = lista.Lista.get(indexModificar);
                    vista.txtNombre.setText(clienteModificar.getNombre());
                    vista.txtdni.setText(clienteModificar.getDni());
                    vista.txtTelefono.setText(clienteModificar.getTelefono());
                    vista.txtDireccion.setText(clienteModificar.getDireccion());
                } else {
                    JOptionPane.showMessageDialog(vista, "Cliente no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(vista, "Debe ingresar un código válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        */
        
    }
}
