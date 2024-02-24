/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqt;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo A. Di Iorio
 */
public class Herramienta extends javax.swing.JDialog {

    public static boolean IntExt = false;
    String Tool = "";

    /**
     * Creates new form Herr
     */
    public Herramienta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Configuracion de la herramienta utilizada");
        txt_T.setText("");
        txt_Geo.setText("");
        txt_Des.setText("");
        txt_Geo.setEnabled(false);
        txt_Des.setEnabled(false);
        mnu_Interpolacion.setEnabled(false);
        mnu_Cilindrado.setEnabled(false);
        mnu_Ranurado.setEnabled(false);
        mnu_Refrentado.setEnabled(false);
        mnu_Taladrado.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Des = new javax.swing.JTextField();
        btn_Aceptar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        txt_T = new javax.swing.JTextField();
        txt_Geo = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu_Interpolacion = new javax.swing.JMenu();
        mnu_Cilindrado = new javax.swing.JMenu();
        mnu_CilExt = new javax.swing.JMenuItem();
        mnu_CilInt = new javax.swing.JMenuItem();
        mnu_Refrentado = new javax.swing.JMenu();
        mnu_Ranurado = new javax.swing.JMenu();
        mnu_Taladrado = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("N° de Herramienta: T");

        jLabel2.setText("N° de geometría:");

        jLabel8.setText("Descripcion:");

        txt_Des.setToolTipText("Nombre descriptivo de la herramienta");
        txt_Des.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_DesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_DesFocusLost(evt);
            }
        });
        txt_Des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DesActionPerformed(evt);
            }
        });

        btn_Aceptar.setText("Aceptar");
        btn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AceptarActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        txt_T.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_T.setToolTipText("Numero de posicion en la torreta de herramientas");
        txt_T.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TFocusLost(evt);
            }
        });
        txt_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TActionPerformed(evt);
            }
        });

        txt_Geo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Geo.setToolTipText("Numero de geometria de la herramienta");
        txt_Geo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_GeoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_GeoFocusLost(evt);
            }
        });
        txt_Geo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GeoActionPerformed(evt);
            }
        });

        mnu_Interpolacion.setText("Interpolacion");
        mnu_Interpolacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_InterpolacionMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnu_Interpolacion);

        mnu_Cilindrado.setText("Cilindrado");

        mnu_CilExt.setText("Exterior");
        mnu_CilExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_CilExtActionPerformed(evt);
            }
        });
        mnu_Cilindrado.add(mnu_CilExt);

        mnu_CilInt.setText("Interior");
        mnu_CilInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_CilIntActionPerformed(evt);
            }
        });
        mnu_Cilindrado.add(mnu_CilInt);

        jMenuBar1.add(mnu_Cilindrado);

        mnu_Refrentado.setText("Refrentado");
        mnu_Refrentado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_RefrentadoMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnu_Refrentado);

        mnu_Ranurado.setText("Ranurado");
        mnu_Ranurado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_RanuradoMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnu_Ranurado);

        mnu_Taladrado.setText("Taladrado");
        mnu_Taladrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_TaladradoMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnu_Taladrado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btn_Aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Geo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txt_Des)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txt_T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Geo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Aceptar)
                    .addComponent(btn_Cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnu_InterpolacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_InterpolacionMouseClicked
        new Interpolacion(null, true).setVisible(true);
    }//GEN-LAST:event_mnu_InterpolacionMouseClicked

    private void mnu_CilExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_CilExtActionPerformed
        IntExt = false;
        new Cilindrado(null, true).setVisible(true);
    }//GEN-LAST:event_mnu_CilExtActionPerformed

    private void mnu_CilIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_CilIntActionPerformed
        IntExt = true;
        new Cilindrado(null, true).setVisible(true);
    }//GEN-LAST:event_mnu_CilIntActionPerformed

    private void txt_DesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_DesFocusGained
        txt_Des.setBackground(Color.lightGray);
    }//GEN-LAST:event_txt_DesFocusGained

    private void txt_DesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_DesFocusLost
        txt_Des.setBackground(Color.white);
        txt_Des.setText(txt_Des.getText().toUpperCase());
    }//GEN-LAST:event_txt_DesFocusLost

    private void txt_DesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DesActionPerformed
        txt_Des.setText(txt_Des.getText().toUpperCase());
        txt_Des.transferFocus();
    }//GEN-LAST:event_txt_DesActionPerformed

    private void btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AceptarActionPerformed
        String linea = txt_T.getText() + txt_Geo.getText();
        if (!txt_T.getText().equals("")) {
            if (!txt_Geo.getText().equals("")) {
                if (Inicial.Herr) {
                    if (!linea.equals(Tool)) {
                        Tool = linea;
                        if (!txt_Des.getText().equals("")) {
                            Principal.Herramienta = Principal.Herramienta + "T" + Tool + " (" + txt_Des.getText() + ");" + '\n';
                        } else {
                            Principal.Herramienta = Principal.Herramienta + "T" + Tool + ";" + '\n';
                        }
                    }
                    Principal.Herramienta = Principal.Herramienta + Principal.Procesos;
                    Principal.Procesos = "";
                    this.dispose();
                } else {
                    JOptionPane.showConfirmDialog(this, "Debe aplicar al menos un proceso para la herramienta.", "FALTA PROCESO", JOptionPane.CLOSED_OPTION);
                }
            } else {
                JOptionPane.showConfirmDialog(this, "Debe elegir una geometría de herramienta.", "FALTA GEOMETRIA DE HERRAMIENTA", JOptionPane.CLOSED_OPTION);
            }
        } else {
            JOptionPane.showConfirmDialog(this, "Debe elegir un número de herramienta.", "FALTA NUMERO DE HERRAMIENTA", JOptionPane.CLOSED_OPTION);
        }
    }//GEN-LAST:event_btn_AceptarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void txt_TFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TFocusGained
        txt_T.setBackground(Color.lightGray);
    }//GEN-LAST:event_txt_TFocusGained

    private void txt_TFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TFocusLost
        txt_T.setBackground(Color.white);
    }//GEN-LAST:event_txt_TFocusLost

    private void txt_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TActionPerformed
        txt_Geo.setEnabled(true);
        txt_T.transferFocus();
    }//GEN-LAST:event_txt_TActionPerformed

    private void txt_GeoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_GeoFocusGained
        txt_Geo.setBackground(Color.lightGray);
    }//GEN-LAST:event_txt_GeoFocusGained

    private void txt_GeoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_GeoFocusLost
        txt_Geo.setBackground(Color.white);
    }//GEN-LAST:event_txt_GeoFocusLost

    private void txt_GeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GeoActionPerformed
        int lng = txt_Geo.getText().length();
        if (lng <= 1) {
            String str = "0" + txt_Geo.getText();
            txt_Geo.setText(str);
        }
        txt_Des.setEnabled(true);
        mnu_Interpolacion.setEnabled(true);
        mnu_Cilindrado.setEnabled(true);
        mnu_Ranurado.setEnabled(true);
        mnu_Refrentado.setEnabled(true);
        mnu_Taladrado.setEnabled(true);
        txt_Geo.transferFocus();
    }//GEN-LAST:event_txt_GeoActionPerformed

    private void mnu_RefrentadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_RefrentadoMouseClicked
        new Refrentado(null, true).setVisible(true);
    }//GEN-LAST:event_mnu_RefrentadoMouseClicked

    private void mnu_TaladradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_TaladradoMouseClicked
        new Taladrado(null, true).setVisible(true);
    }//GEN-LAST:event_mnu_TaladradoMouseClicked

    private void mnu_RanuradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_RanuradoMouseClicked
        new Ranurado(null, true).setVisible(true);
    }//GEN-LAST:event_mnu_RanuradoMouseClicked

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
            java.util.logging.Logger.getLogger(Herramienta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Herramienta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Herramienta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Herramienta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Herramienta dialog = new Herramienta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Aceptar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnu_CilExt;
    private javax.swing.JMenuItem mnu_CilInt;
    private javax.swing.JMenu mnu_Cilindrado;
    private javax.swing.JMenu mnu_Interpolacion;
    private javax.swing.JMenu mnu_Ranurado;
    private javax.swing.JMenu mnu_Refrentado;
    private javax.swing.JMenu mnu_Taladrado;
    private javax.swing.JTextField txt_Des;
    private javax.swing.JTextField txt_Geo;
    private javax.swing.JTextField txt_T;
    // End of variables declaration//GEN-END:variables
}
