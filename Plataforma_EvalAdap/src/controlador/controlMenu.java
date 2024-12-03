package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import vista.*;

public class controlMenu implements ActionListener {
    frmMain fm;

    public controlMenu(frmMain fm) {
        this.fm = fm;
        fm.setTitle("Plataforma de Evaluación Adaptativa");
        fm.setVisible(true);
        fm.setLocationRelativeTo(null);
        fm.opc11.addActionListener(this);
        fm.opc12.addActionListener(this);
        fm.opc13.addActionListener(this);
        fm.opc21.addActionListener(this);
        fm.opc22.addActionListener(this);
        fm.opc23.addActionListener(this);
        fm.opc31.addActionListener(this);
        fm.opc32.addActionListener(this);
        fm.opc33.addActionListener(this);
        fm.opc41.addActionListener(this);
        fm.opc42.addActionListener(this);
        fm.opc43.addActionListener(this);
    }

    public void MostrarForma(JInternalFrame internal) {
        fm.desktop.removeAll();
        fm.desktop.add(internal);
        internal.setVisible(true);
        fm.desktop.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fm.opc11) {
            panel01 f1 = new panel01();
            controlPanel01 cp1 = new controlPanel01(f1);
            f1.setTitle("Estudiante");
            MostrarForma(f1);
        }
        
        if (e.getSource() == fm.opc12) {
            panel02 f2 = new panel02();
            controlPanel02 cp2 = new controlPanel02(f2);
            f2.setTitle("Estudiante");
            MostrarForma(f2);
        }
        if (e.getSource() == fm.opc13) {
            panel03 f3 = new panel03();
            controlPanel03 cp3 = new controlPanel03(f3);
            f3.setTitle("Estudiante");
            MostrarForma(f3);
        }
        if (e.getSource() == fm.opc21) {
            panel04 f4 = new panel04();
            controlPanel04 cp4 = new controlPanel04(f4);
            f4.setTitle("Evaluación");
            MostrarForma(f4);
        }
        if (e.getSource() == fm.opc22) {
            panel05 f5 = new panel05();
            controlPanel05 cp5 = new controlPanel05(f5);
            f5.setTitle("Evaluación");
            MostrarForma(f5);
        }

        if (e.getSource() == fm.opc23) {
            panel06 f6 = new panel06();
            controlPanel06 cp6 = new controlPanel06(f6);
            f6.setTitle("Evaluación");
            MostrarForma(f6);
        }

        if (e.getSource() == fm.opc31) {
            panel07 f7 = new panel07();
            controlPanel07 cp7 = new controlPanel07(f7);
            f7.setTitle("Examen adaptado");
            MostrarForma(f7);
        }

        if (e.getSource() == fm.opc32) {
            panel08 f8 = new panel08();
            controlPanel08 cp8 = new controlPanel08(f8);
            f8.setTitle("Examen adaptado");
            MostrarForma(f8);
        }

        if (e.getSource() == fm.opc33) {
            panel09 f9 = new panel09();
            controlPanel09 cp9 = new controlPanel09(f9);
            f9.setTitle("Informe de progreso");
            MostrarForma(f9);
        }
        
        if (e.getSource() == fm.opc41) {
            panel10 f10 = new panel10();
            controlPanel10 cp10 = new controlPanel10(f10);
            f10.setTitle("Informe de progreso");
            MostrarForma(f10);
        }

        if (e.getSource() == fm.opc42) {
            panel11 f11 = new panel11();
            controlPanel11 cp11 = new controlPanel11(f11);
            f11.setTitle("Informe de progreso");
            MostrarForma(f11);
        }

        if (e.getSource() == fm.opc43) {
            panel12 f12 = new panel12();
            controlPanel12 cp12 = new controlPanel12(f12);
            f12.setTitle("Informe de progreso");
            MostrarForma(f12);
        }

    }

}
