/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Concectar.Conetion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pineda
 */
public class AgregarAlumno extends javax.swing.JFrame {

    /**
     * Creates new form AgregarAlumno
     */
    public AgregarAlumno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alumno = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        BotonAgregar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtnombre = new javax.swing.JLabel();
        txtnombre1 = new javax.swing.JLabel();
        txtnombre2 = new javax.swing.JLabel();
        txtnombre3 = new javax.swing.JLabel();
        txtnombre4 = new javax.swing.JLabel();
        txtnombre5 = new javax.swing.JLabel();
        txtnombre6 = new javax.swing.JLabel();
        txtnombre7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNombre = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtapellidop = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtapellidom = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtma = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtmatricula = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtcreditos = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtedad = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtmr = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Menu principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BotonAgregar.setText("Agregar ");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombre.setText("Nombre");

        txtnombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombre1.setText("Apellido P");

        txtnombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombre2.setText("Apellido M");

        txtnombre3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombre3.setText("Materias aprobadas");

        txtnombre4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombre4.setText("Matriculas");

        txtnombre5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombre5.setText("Creditos");

        txtnombre6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombre6.setText("Materias reprobadas");

        txtnombre7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombre7.setText("Edad");

        jScrollPane1.setViewportView(txtNombre);

        jScrollPane2.setViewportView(txtapellidop);

        jScrollPane3.setViewportView(txtapellidom);

        jScrollPane4.setViewportView(txtma);

        jScrollPane5.setViewportView(txtmatricula);

        jScrollPane6.setViewportView(txtcreditos);

        jScrollPane7.setViewportView(txtedad);

        jScrollPane8.setViewportView(txtmr);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Agregar alumno");

        javax.swing.GroupLayout alumnoLayout = new javax.swing.GroupLayout(alumno);
        alumno.setLayout(alumnoLayout);
        alumnoLayout.setHorizontalGroup(
            alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumnoLayout.createSequentialGroup()
                        .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumnoLayout.createSequentialGroup()
                        .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnombre3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtnombre1)
                                .addComponent(txtnombre2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre6)
                            .addComponent(txtnombre7)
                            .addComponent(txtnombre5)
                            .addComponent(txtnombre4))
                        .addGap(30, 30, 30)
                        .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
            .addGroup(alumnoLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        alumnoLayout.setVerticalGroup(
            alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnoLayout.createSequentialGroup()
                .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alumnoLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre3)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(alumnoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(alumnoLayout.createSequentialGroup()
                                .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(alumnoLayout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)
                                        .addGap(31, 31, 31))
                                    .addGroup(alumnoLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(49, 49, 49)))
                                .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(txtnombre1)
                                .addGap(5, 5, 5))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alumnoLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtnombre2)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumnoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumnoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumnoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(alumnoLayout.createSequentialGroup()
                                    .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(alumnoLayout.createSequentialGroup()
                                            .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtnombre6)
                                                .addGroup(alumnoLayout.createSequentialGroup()
                                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(5, 5, 5)))
                                            .addGap(29, 29, 29)
                                            .addComponent(txtnombre7)
                                            .addGap(52, 52, 52))
                                        .addComponent(txtnombre5))
                                    .addGap(44, 44, 44)
                                    .addComponent(txtnombre4))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(alumno, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu p1 = new Menu();
        alumno.removeAll();
        alumno.add(p1.menu);   
        alumno.revalidate();
        alumno.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Alumnos p1 = new Alumnos();
        alumno.removeAll();
        alumno.add(p1.alumnos);   
        alumno.revalidate();
        alumno.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        int matricula,materiasA,materiasR,creditos,edad;
        String nombre,apellidoP,apellidoM;
        
        edad=Integer. parseInt(txtedad.getText());
        matricula=Integer. parseInt(txtmatricula.getText());
        creditos=Integer.parseInt(txtcreditos.getText());
        nombre=txtNombre.getText();
        apellidoP=txtapellidop.getText();
        apellidoM=txtapellidom.getText();
        materiasA=Integer. parseInt(txtmr.getText());
        materiasR=Integer.parseInt(txtma.getText());
        
        try {
            Conetion p1 = new Conetion();
            p1.InsertEstudiante(matricula,nombre, apellidoP, apellidoM, edad, materiasA, materiasR, creditos);
        } catch (SQLException ex) {
            Logger.getLogger(AgregarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Alumnos p1 = new Alumnos();
        alumno.removeAll();
        alumno.add(p1.alumnos);   
        alumno.revalidate();
        alumno.repaint();
        
    }//GEN-LAST:event_BotonAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    public static javax.swing.JPanel alumno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextPane txtNombre;
    private javax.swing.JTextPane txtapellidom;
    private javax.swing.JTextPane txtapellidop;
    private javax.swing.JTextPane txtcreditos;
    private javax.swing.JTextPane txtedad;
    private javax.swing.JTextPane txtma;
    private javax.swing.JTextPane txtmatricula;
    private javax.swing.JTextPane txtmr;
    private javax.swing.JLabel txtnombre;
    private javax.swing.JLabel txtnombre1;
    private javax.swing.JLabel txtnombre2;
    private javax.swing.JLabel txtnombre3;
    private javax.swing.JLabel txtnombre4;
    private javax.swing.JLabel txtnombre5;
    private javax.swing.JLabel txtnombre6;
    private javax.swing.JLabel txtnombre7;
    // End of variables declaration//GEN-END:variables
}
