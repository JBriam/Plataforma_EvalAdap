
package vista;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Estudiante;
import controlador.Ctrl_Estudiante;


public class panel01 extends javax.swing.JInternalFrame {
    
    public panel01() {
        initComponents();
        
        //Cargar tabla
        this.CargarTabla();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNivel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        txtFecha = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 204, 255));
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Agregar estudiante");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 390, 47));

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        txtNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 160, 40));

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel7.setText("Edad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        txtEdad.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtEdad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 160, 40));

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel4.setText("Nivel Académico");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        txtNivel.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtNivel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel1.add(txtNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 160, 40));

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel9.setText("Fecha de inscripción");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salvar (1).png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 150, 40));

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrador (1).png"))); // NOI18N
        btnLimpiar.setText("CANCELAR");
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 150, 40));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 670, 10));

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 670, 180));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Estudiante estudiante = new Estudiante();
        Ctrl_Estudiante controlEstudiante = new Ctrl_Estudiante();

        if (!txtNombre.getText().isEmpty() && !txtEdad.getText().isEmpty() && !txtNivel.getText().isEmpty() && !txtFecha.getDate().toString().isEmpty()) {
            //JOptionPane.showMessageDialog(null, "Correcto");

            //if (!controlEstudiante.existeCliente(txt_cedula.getText().trim())) {

                estudiante.setNombre(txtNombre.getText().trim());
                estudiante.setEdad(Integer.parseInt(txtEdad.getText().trim()));
                estudiante.setNivelAcademico(txtNivel.getText().trim());
                estudiante.setFechaInscripcion(txtFecha.getDate());

                if (controlEstudiante.guardar(estudiante)) {
                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    this.CargarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }

            /*} else {
                JOptionPane.showMessageDialog(null, "El estudiante ya está registrado en la Base de Datos.");
                txtNombre.setBackground(Color.white);
                txtEdad.setBackground(Color.white);
                txtNivel.setBackground(Color.white);
                txtFecha.setBackground(Color.white);
            }*/
        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        }
        //metodo limpiar
        this.Limpiar();
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable tblTabla;
    public javax.swing.JTextField txtEdad;
    public com.toedter.calendar.JDateChooser txtFecha;
    public javax.swing.JTextField txtNivel;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
     
    /*
     * *****************************************************
     * metodo para limpiar
     * *****************************************************
     */
    private void Limpiar() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtNivel.setText("");
        txtFecha.setDate(new Date());
    }
    
    /*
     * *****************************************************
     * Método para mostrar todos los registros
     * *****************************************************
     */
    
    private void CargarTabla() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from estudiantes";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            panel01.tblTabla = new JTable(model);
            panel01.jScrollPane1.setViewportView(panel01.tblTabla);

            model.addColumn("N°");//ID
            model.addColumn("Nombre");
            model.addColumn("Edad");
            model.addColumn("Nivel Académico");
            model.addColumn("Fecha de Inscripción");

            while (rs.next()) {
                Object fila[] = new Object[5];
                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla: " + e);
        }
    }
    
}
