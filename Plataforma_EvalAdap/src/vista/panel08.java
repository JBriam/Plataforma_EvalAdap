
package vista;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.ExamenAdaptado;
import controlador.Ctrl_Examen;


public class panel08 extends javax.swing.JInternalFrame {

    private int ExamenID;
  
    public panel08() {
        initComponents();
        
        //Cargar tabla
        this.CargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtExamen = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Actualizar examen adaptado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 490, 47));

        btnActualizar.setBackground(new java.awt.Color(255, 102, 0));
        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salvar (1).png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 150, 40));

        btnLimpiar.setBackground(new java.awt.Color(255, 102, 0));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrador (1).png"))); // NOI18N
        btnLimpiar.setText("CANCELAR");
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 150, 40));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 670, 10));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 670, 170));

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel3.setText("Id. Evaluación");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        txtCod.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtCod.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 160, 40));

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel4.setText("Examen Adaptado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        txtExamen.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtExamen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        jPanel1.add(txtExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 160, 40));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 160, 40));

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de examen");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtCod.getText().isEmpty() || txtExamen.getText().isEmpty() || txtFecha.getDate().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Completa todos los campos!");
        } else {

            ExamenAdaptado examen = new ExamenAdaptado();
            Ctrl_Examen controlExamen = new Ctrl_Examen();

            examen.setEvaluacionID(Integer.parseInt(txtCod.getText().trim()));
            examen.setExamenAdaptado(txtExamen.getText().trim());
            examen.setFechaExamen(txtFecha.getDate());

            if (controlExamen.actualizar(examen, ExamenID)) {
                JOptionPane.showMessageDialog(null, "¡Datos actualizados!");
                this.CargarTabla();
                this.Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al actualizar!");
            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable tblTabla;
    public javax.swing.JTextField txtCod;
    public javax.swing.JTextField txtExamen;
    public com.toedter.calendar.JDateChooser txtFecha;
    // End of variables declaration//GEN-END:variables

    /*
     * *****************************************************
     * metodo para limpiar
     * *****************************************************
     */
    private void Limpiar() {
        txtCod.setText("");
        txtExamen.setText("");
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
        String sql = "select * from examenadaptado";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            panel08.tblTabla = new JTable(model);
            panel08.jScrollPane1.setViewportView(panel08.tblTabla);

            model.addColumn("N°");//ID
            model.addColumn("Id. Evaluación");
            model.addColumn("Examen Adaptado");
            model.addColumn("Fecha Examen");

            while (rs.next()) {
                Object fila[] = new Object[4];
                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla: " + e);
        }
        
        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        tblTabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = tblTabla.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    ExamenID = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatos(ExamenID);//metodo
                }
            }
        });
    }
    
    /*
     * **************************************************
     * Método que envía datos seleccionados
     * **************************************************
     */
    private void EnviarDatos(int ExamenID) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from examenadaptado where ExamenID = '" + ExamenID + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtCod.setText(rs.getString("EvaluacionID"));
                txtExamen.setText(rs.getString("ExamenAdaptado"));
                txtFecha.setDate(rs.getDate("FechaExamen"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar: " + e);
        }
    }
}
