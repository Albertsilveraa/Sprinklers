/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.integrador.optisprout.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author LAB-USR-PT116-C309
 */
public class Login extends javax.swing.JFrame {

    private int xMouse, yMouse;

    Border borde = BorderFactory.createLineBorder(Color.BLACK, 2);

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        jPanel1.setBorder(borde);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        jlbInicio = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        jlbFondo = new javax.swing.JLabel();
        jlbUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jlbContraseña = new javax.swing.JLabel();
        passContra = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlblClose = new javax.swing.JLabel();
        jlblMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        Fondo.setBackground(new java.awt.Color(0, 51, 51));
        Fondo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbInicio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlbInicio.setForeground(new java.awt.Color(255, 255, 255));
        jlbInicio.setText("INICIAR SESIÓN");
        Fondo.add(jlbInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, 30));

        jlbTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_admin1.png"))); // NOI18N
        jlbTitulo.setText("OptisSprout");
        Fondo.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jlbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gif aspersos.gif"))); // NOI18N
        Fondo.add(jlbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 400, 530));

        jlbUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlbUsuario.setText("USUARIO");
        Fondo.add(jlbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(0, 0, 0));
        txtUsuario.setForeground(new java.awt.Color(29, 72, 116));
        txtUsuario.setText("admin");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        Fondo.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 170, 10));

        jlbContraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlbContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jlbContraseña.setText("CONTRASEÑA");
        Fondo.add(jlbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 140, -1));

        passContra.setBackground(new java.awt.Color(0, 0, 0));
        passContra.setForeground(new java.awt.Color(29, 72, 116));
        passContra.setText("********");
        passContra.setBorder(null);
        passContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passContraMousePressed(evt);
            }
        });
        passContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passContraActionPerformed(evt);
            }
        });
        Fondo.add(passContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 160, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 170, 10));

        Login.setBackground(new java.awt.Color(26, 26, 26));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 225, 13));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INGRESAR");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 160, 50));

        jlblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cerrar_min.png"))); // NOI18N
        jlblClose.setText("jLabel4");
        jlblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblCloseMouseClicked(evt);
            }
        });

        jlblMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menos.png"))); // NOI18N
        jlblMin.setText("jLabel3");
        jlblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblMin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if (txtUsuario.getText().equals("Ingrese el nombre de usuario")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.white);
        }
        if (String.valueOf(passContra.getPassword()).isEmpty()) {
            passContra.setText("");
        }

    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void passContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passContraMousePressed
        if (passContra.getText().equals("********")) {
            passContra.setText("");
            passContra.setForeground(Color.white);
        }
        if (String.valueOf(txtUsuario.getText()).isEmpty()) {
            passContra.setText("");
        }
    }//GEN-LAST:event_passContraMousePressed

    private void passContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passContraActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String Usuario = "admin";
        String Contraseña = "root";

        String pass = new String(passContra.getPassword());

        if (txtUsuario.getText().equals(Usuario) && pass.equals(Contraseña)) {
            JOptionPane.showMessageDialog(this, "Se ingresó correctamente");
            Vistainicio cine = new Vistainicio();
          
            // Configura la ventana para que se abra en el centro de la pantalla
            cine.setLocationRelativeTo(null);
            cine.setVisible(true);
            this.dispose();
            jPanel1.setBorder(borde);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrecta");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        Login.setBackground(new Color(10, 49, 88));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        Login.setBackground(new Color(26, 26, 26));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jlblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlblCloseMouseClicked

    private void jlblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMinMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jlblMinMouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlbContraseña;
    private javax.swing.JLabel jlbFondo;
    private javax.swing.JLabel jlbInicio;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel jlbUsuario;
    private javax.swing.JLabel jlblClose;
    private javax.swing.JLabel jlblMin;
    private javax.swing.JPasswordField passContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
