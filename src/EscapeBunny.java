
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class EscapeBunny extends javax.swing.JFrame {

    /**
     * Creates new form EscapeBunny
     */
    public EscapeBunny() {
        initComponents();       
        InfoLog ig = new InfoLog();
        ig.setVisible(true);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBack = new javax.swing.JPanel();
        btnBunny = new javax.swing.JButton();
        lbMsg = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escape Bunny");
        setUndecorated(true);

        panelBack.setLayout(null);

        btnBunny.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bunny3re.jpg"))); // NOI18N
        btnBunny.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBunny.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBunnyMouseEntered(evt);
            }
        });
        btnBunny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBunnyActionPerformed(evt);
            }
        });
        panelBack.add(btnBunny);
        btnBunny.setBounds(740, 370, 80, 70);

        lbMsg.setBackground(new java.awt.Color(255, 255, 255));
        lbMsg.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        lbMsg.setForeground(new java.awt.Color(0, 51, 153));
        lbMsg.setText("Catch me if you can ........");
        panelBack.add(lbMsg);
        lbMsg.setBounds(500, 370, 240, 40);

        btnQuit.setBackground(new java.awt.Color(255, 255, 255));
        btnQuit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(0, 153, 204));
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        panelBack.add(btnQuit);
        btnQuit.setBounds(830, 10, 60, 25);

        lbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cloud3.jpg"))); // NOI18N
        panelBack.add(lbBack);
        lbBack.setBounds(0, 0, 900, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBack, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBack, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBunnyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBunnyMouseEntered
        // TODO add your handling code here:
        lbMsg.setVisible(false);
        Random d=new Random();
        int a = d.nextInt(200);
        int b = d.nextInt(200);
        btnBunny.setLocation(a, b);
    }//GEN-LAST:event_btnBunnyMouseEntered

    private void btnBunnyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBunnyActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "OOPs You caught me!!!");
        dispose();
    }//GEN-LAST:event_btnBunnyActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Nobody can catch me!!\nBetter Luck Next Time.");
        dispose();
    }//GEN-LAST:event_btnQuitActionPerformed

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
            java.util.logging.Logger.getLogger(EscapeBunny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscapeBunny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscapeBunny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscapeBunny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscapeBunny().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBunny;
    private javax.swing.JButton btnQuit;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbMsg;
    private javax.swing.JPanel panelBack;
    // End of variables declaration//GEN-END:variables
}
