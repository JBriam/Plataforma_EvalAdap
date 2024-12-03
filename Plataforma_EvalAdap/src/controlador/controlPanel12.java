package controlador;

import java.awt.event.*;
import java.util.ArrayList;
import modelo.Estudiante;
import vista.panel12;

public class controlPanel12 implements ActionListener{
    
    panel12 vista;
    ArrayList<Estudiante> auxiliar;
    //ListaClientes lista;
    Estudiante est;
    
    public controlPanel12(panel12 p12) {
        vista = p12;
        vista.btnEliminar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        //lista = new ListaClientes();
        ProcesosInforme.Presentacion3(vista);
        //this.auxiliar = new ArrayList<>();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.btnLimpiar) {
            ProcesosInforme.LimpiarEntradas3(vista);
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
