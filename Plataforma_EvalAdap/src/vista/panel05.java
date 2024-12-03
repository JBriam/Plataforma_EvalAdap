
package vista;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Evaluacion;
import controlador.Ctrl_Evaluacion;


public class panel05 extends javax.swing.JInternalFrame {

    private int EvaluacionID;
    
    public panel05() {
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
        txtCod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtResultados = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDificultad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        txtTiempo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Actualizar evaluación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 390, 47));

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel3.setText("ID. Estudiante");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        txtCod.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtCod.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 1, true));
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 160, 40));

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel7.setText("Resultados anteriores");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        txtResultados.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtResultados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 1, true));
        jPanel1.add(txtResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 160, 40));

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel4.setText("Tiempo respuesta");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        txtDificultad.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtDificultad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 1, true));
        jPanel1.add(txtDificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 160, 40));

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel9.setText("Dificultad percibida");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(0, 204, 51));
        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salvar (1).png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 150, 40));

        btnLimpiar.setBackground(new java.awt.Color(0, 204, 51));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrador (1).png"))); // NOI18N
        btnLimpiar.setText("CANCELAR");
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 150, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 670, 190));

        txtTiempo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtTiempo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 1, true));
        jPanel1.add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtCod.getText().isEmpty() || txtResultados.getText().isEmpty() || txtTiempo.getText().isEmpty() || txtDificultad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Completa todos los campos!");
        } else {

            Evaluacion evaluacion = new Evaluacion();
            Ctrl_Evaluacion controlEvaluacion = new Ctrl_Evaluacion();

            evaluacion.setEstudianteID(Integer.parseInt(txtCod.getText().trim()));
            evaluacion.setResultadosAnteriores(txtResultados.getText().trim());
            evaluacion.setTiempoPromedioRespuesta(Double.parseDouble(txtTiempo.getText().trim()));
            evaluacion.setDificultadPercibida(txtDificultad.getText().trim());

            if (controlEvaluacion.actualizar(evaluacion, EvaluacionID)) {
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable tblTabla;
    public javax.swing.JTextField txtCod;
    public javax.swing.JTextField txtDificultad;
    public javax.swing.JTextField txtResultados;
    public javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
    
    /*
     * *****************************************************
     * metodo para limpiar
     * *****************************************************
     */
    private void Limpiar() {
        txtCod.setText("");
        txtResultados.setText("");
        txtTiempo.setText("");
        txtDificultad.setText("");
    }
    
    /*
     * *****************************************************
     * Método para mostrar todos los registros
     * *****************************************************
     */
    
    private void CargarTabla() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from evaluaciones";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            panel05.tblTabla = new JTable(model);
            panel05.jScrollPane1.setViewportView(panel05.tblTabla);

            model.addColumn("N°");//ID
            model.addColumn("Id. Estudiante");
            model.addColumn("Resultados Anteriores");
            model.addColumn("T. Promedio Respuesta");
            model.addColumn("Dificultad Percibida");

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
        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        tblTabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = tblTabla.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    EvaluacionID = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatos(EvaluacionID);//metodo
                }
            }
        });
    }
    
    /*
     * **************************************************
     * Método que envía datos seleccionados
     * **************************************************
     */
    private void EnviarDatos(int EvaluacionID) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from evaluaciones where EvaluacionID = '" + EvaluacionID + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtCod.setText(rs.getString("EstudianteID"));
                txtResultados.setText(rs.getString("ResultadosAnteriores"));
                txtTiempo.setText(rs.getString("TiempoPromedioRespuesta"));
                txtDificultad.setText(rs.getString("DificultadPercibida"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar: " + e);
        }
    }

}
