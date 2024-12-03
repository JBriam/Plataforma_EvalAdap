package controlador;

import java.awt.event.*;
import java.util.ArrayList;
import modelo.Estudiante;
import vista.panel03;

public class controlPanel03 implements ActionListener{
    
    panel03 vista;
    ArrayList<Estudiante> auxiliar;
    //ListaClientes lista;
    
    public controlPanel03(panel03 p3) {
        vista = p3;
        vista.btnEliminar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        //lista = new ListaClientes();
        ProcesosEstudiante.Presentacion3(vista);
        //this.auxiliar = new ArrayList<>();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.btnLimpiar) {
            ProcesosEstudiante.LimpiarEntradas3(vista);
        }
        /*
        if (e.getSource() == vista.btnEliminar) {
            String dni = JOptionPane.showInputDialog("Ingrese el DNI: ");
            if (dni != null && !dni.isEmpty()) {
                if (!lista.Lista.isEmpty()) {
                    boolean eliminado = ProcesosCliente.EliminarCliente(lista.Lista, dni);
                    if (eliminado) {
                        JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                        OrdenamientosCliente.MostrarDatos(vista.tblTabla, lista.Lista);
                    } else {
                        JOptionPane.showMessageDialog(null, "No encontrado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay clientes para eliminar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un DNI válido");
            }
        }
        */
        
    }
}
