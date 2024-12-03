
package vista;

public class frmMain extends javax.swing.JFrame {

    public frmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuEstudiante = new javax.swing.JMenu();
        opc11 = new javax.swing.JMenuItem();
        opc12 = new javax.swing.JMenuItem();
        opc13 = new javax.swing.JMenuItem();
        menuEvaluacion = new javax.swing.JMenu();
        opc21 = new javax.swing.JMenuItem();
        opc22 = new javax.swing.JMenuItem();
        opc23 = new javax.swing.JMenuItem();
        menuExamen = new javax.swing.JMenu();
        opc31 = new javax.swing.JMenuItem();
        opc32 = new javax.swing.JMenuItem();
        opc33 = new javax.swing.JMenuItem();
        menuInforme = new javax.swing.JMenu();
        opc41 = new javax.swing.JMenuItem();
        opc42 = new javax.swing.JMenuItem();
        opc43 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktop.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 550));

        jMenuBar1.setBackground(new java.awt.Color(102, 153, 255));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(637, 32768));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(637, 27));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(637, 27));

        menuEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        menuEstudiante.setText("Estudiante");
        menuEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuEstudiante.setPreferredSize(new java.awt.Dimension(190, 26));

        opc11.setText("Agregar estudiante");
        menuEstudiante.add(opc11);

        opc12.setText("Actualizar estudiante");
        menuEstudiante.add(opc12);

        opc13.setText("Eliminar estudiante");
        menuEstudiante.add(opc13);

        jMenuBar1.add(menuEstudiante);

        menuEvaluacion.setForeground(new java.awt.Color(255, 255, 255));
        menuEvaluacion.setText("Evaluación");
        menuEvaluacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuEvaluacion.setPreferredSize(new java.awt.Dimension(190, 26));

        opc21.setText("Agregar evaluación");
        menuEvaluacion.add(opc21);

        opc22.setText("Actualizar evaluación");
        menuEvaluacion.add(opc22);

        opc23.setText("Eliminar evaluación");
        menuEvaluacion.add(opc23);

        jMenuBar1.add(menuEvaluacion);

        menuExamen.setForeground(new java.awt.Color(255, 255, 255));
        menuExamen.setText("Examen Adaptado");
        menuExamen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuExamen.setPreferredSize(new java.awt.Dimension(190, 26));

        opc31.setText("Agregar examen");
        menuExamen.add(opc31);

        opc32.setText("Actualizar examen");
        menuExamen.add(opc32);

        opc33.setText("Eliminar examen");
        menuExamen.add(opc33);

        jMenuBar1.add(menuExamen);

        menuInforme.setForeground(new java.awt.Color(255, 255, 255));
        menuInforme.setText("Informes");
        menuInforme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuInforme.setPreferredSize(new java.awt.Dimension(190, 26));

        opc41.setText("Agregar informe");
        menuInforme.add(opc41);

        opc42.setText("Actualizar informe");
        menuInforme.add(opc42);

        opc43.setText("Eliminar informe");
        menuInforme.add(opc43);

        jMenuBar1.add(menuInforme);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenu menuEstudiante;
    public javax.swing.JMenu menuEvaluacion;
    public javax.swing.JMenu menuExamen;
    public javax.swing.JMenu menuInforme;
    public javax.swing.JMenuItem opc11;
    public javax.swing.JMenuItem opc12;
    public javax.swing.JMenuItem opc13;
    public javax.swing.JMenuItem opc21;
    public javax.swing.JMenuItem opc22;
    public javax.swing.JMenuItem opc23;
    public javax.swing.JMenuItem opc31;
    public javax.swing.JMenuItem opc32;
    public javax.swing.JMenuItem opc33;
    public javax.swing.JMenuItem opc41;
    public javax.swing.JMenuItem opc42;
    public javax.swing.JMenuItem opc43;
    // End of variables declaration//GEN-END:variables
}
