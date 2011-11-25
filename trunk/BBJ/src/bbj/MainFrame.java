/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Nov 14, 2011, 3:54:23 AM
 */
package bbj;

/**
 *
 * @author Lemon
 */
public class MainFrame extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jToolBar1 = new javax.swing.JToolBar();
        btnSelect = new javax.swing.JToggleButton();
        btnLifeline = new javax.swing.JToggleButton();
        btnMessage = new javax.swing.JToggleButton();
        btnReply = new javax.swing.JToggleButton();
        btnCreate = new javax.swing.JToggleButton();
        btnDestroy = new javax.swing.JToggleButton();
        btnStop = new javax.swing.JToggleButton();
        btnComment = new javax.swing.JToggleButton();
        btnCancel = new javax.swing.JToggleButton();
        btnDelete = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        actCreate = new javax.swing.JMenuItem();
        actOpen = new javax.swing.JMenuItem();
        actSave = new javax.swing.JMenuItem();
        actSaveAs = new javax.swing.JMenuItem();
        actSaveAsPict = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        actExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        actAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Beaver by Java");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jToolBar1.setRollover(true);

        btnSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bbj/resources/select.PNG"))); // NOI18N
        btnSelect.setText("Select");
        btnSelect.setFocusable(false);
        btnSelect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSelect.setName(""); // NOI18N
        btnSelect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSelect);

        btnLifeline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bbj/resources/lifeline.PNG"))); // NOI18N
        btnLifeline.setText("LifeLine");
        btnLifeline.setToolTipText("");
        btnLifeline.setFocusable(false);
        btnLifeline.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLifeline.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLifeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLifelineActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLifeline);

        btnMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bbj/resources/message.PNG"))); // NOI18N
        btnMessage.setText("Message");
        btnMessage.setFocusable(false);
        btnMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMessage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMessageActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMessage);

        btnReply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bbj/resources/replymessage.PNG"))); // NOI18N
        btnReply.setText("Reply Message");
        btnReply.setFocusable(false);
        btnReply.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReply.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnReply);

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bbj/resources/createmessage.PNG"))); // NOI18N
        btnCreate.setText("Create Message");
        btnCreate.setFocusable(false);
        btnCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCreate);

        btnDestroy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bbj/resources/destroymessage.PNG"))); // NOI18N
        btnDestroy.setText("Destroy Message");
        btnDestroy.setFocusable(false);
        btnDestroy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDestroy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDestroy);

        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bbj/resources/stop.PNG"))); // NOI18N
        btnStop.setText("Stop");
        btnStop.setFocusable(false);
        btnStop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnStop);

        btnComment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bbj/resources/comment.PNG"))); // NOI18N
        btnComment.setText("Comment");
        btnComment.setFocusable(false);
        btnComment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnComment);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bbj/resources/cancel.PNG"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setEnabled(false);
        btnCancel.setFocusable(false);
        btnCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCancel);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bbj/resources/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDelete);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        actCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        actCreate.setText("Create");
        jMenu1.add(actCreate);

        actOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        actOpen.setText("Open...");
        jMenu1.add(actOpen);

        actSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        actSave.setText("Save");
        jMenu1.add(actSave);

        actSaveAs.setText("Save as...");
        jMenu1.add(actSaveAs);

        actSaveAsPict.setText("Save as a picture...");
        jMenu1.add(actSaveAsPict);
        jMenu1.add(jSeparator1);

        actExit.setText("Exit");
        jMenu1.add(actExit);

        menuBar.add(jMenu1);

        jMenu2.setText("Help");

        actAbout.setText("About...");
        jMenu2.add(actAbout);

        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnLifelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLifelineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLifelineActionPerformed

    private void btnMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMessageActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actAbout;
    private javax.swing.JMenuItem actCreate;
    private javax.swing.JMenuItem actExit;
    private javax.swing.JMenuItem actOpen;
    private javax.swing.JMenuItem actSave;
    private javax.swing.JMenuItem actSaveAs;
    private javax.swing.JMenuItem actSaveAsPict;
    private javax.swing.JToggleButton btnCancel;
    private javax.swing.JToggleButton btnComment;
    private javax.swing.JToggleButton btnCreate;
    private javax.swing.JToggleButton btnDelete;
    private javax.swing.JToggleButton btnDestroy;
    private javax.swing.JToggleButton btnLifeline;
    private javax.swing.JToggleButton btnMessage;
    private javax.swing.JToggleButton btnReply;
    private javax.swing.JToggleButton btnSelect;
    private javax.swing.JToggleButton btnStop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
