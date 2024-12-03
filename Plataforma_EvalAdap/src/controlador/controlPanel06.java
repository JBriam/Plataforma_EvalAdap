package controlador;

import java.awt.event.*;
import java.util.ArrayList;
import modelo.Estudiante;
import vista.panel06;

public class controlPanel06 implements ActionListener{
    
    panel06 vista;
    ArrayList<Estudiante> auxiliar;
    //ListaClientes lista;
    Estudiante est;
    
    public controlPanel06(panel06 p6) {
        vista = p6;
        vista.btnEliminar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        //lista = new ListaClientes();
        ProcesosEvaluacion.Presentacion3(vista);
        //this.auxiliar = new ArrayList<>();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.btnLimpiar) {
            ProcesosEvaluacion.LimpiarEntradas3(vista);
        }
        /*
        if (e.getSource() == vista.btnRegistrar) {
            String dni = vista.txtdni.getText();
            int index = BusquedaClientes.BuscarPorCodigo(lista.Lista, dni);
            if (index != -1) {
                Cliente clienteExistente = lista.Lista.get(index);
                clienteExistente.setNombre(vista.txtNombre.getText());
                clienteExistente.setTelefono(vista.txtTelefono.getText());
                clienteExistente.setDireccion(vista.txtDireccion.getText());
                lista.GuardarEnBinario();
                OrdenamientosCliente.MostrarDatos(vista.tblTabla, lista.Lista);
                JOptionPane.showMessageDialog(vista, "Cliente modificado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                ProcesosCliente.LimpiarEntradas(vista);
            } else {
                Cliente nuevoCliente = ProcesosCliente.LeerCliente(vista);
                lista.AgregarCliente(nuevoCliente);
                lista.GuardarEnBinario();
                OrdenamientosCliente.MostrarDatos(vista.tblTabla, lista.Lista);
                JOptionPane.showMessageDialog(vista, "Cliente registrado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                ProcesosCliente.LimpiarEntradas(vista);
            }
        }
    */
        
    }
}
