package fisklame;

import java.awt.Dimension;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author FiskFisk33
 */
public class MainWindow extends javax.swing.JFrame {
    
    private Converter conv;
    boolean more = false;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        conv = new Converter();
        qualPanel.setVisible(more);
        this.setSize(new Dimension(450, 279));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        qualityGroup = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        filesLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        destLabel = new javax.swing.JLabel();
        goBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        moreBtn = new javax.swing.JToggleButton();
        qualPanel = new javax.swing.JPanel();
        qualLabel = new javax.swing.JLabel();
        qualBtnHigh = new javax.swing.JRadioButton();
        qualBtnMed = new javax.swing.JRadioButton();
        qualBtnLow = new javax.swing.JRadioButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Some problem occured");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(43, 43, 43))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FiskLame");
        setResizable(false);

        jButton2.setText("Choose files to convert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        filesLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        filesLabel.setText("No Files Chosen");

        jButton1.setText("Set Destination Folder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        destLabel.setText("Not Set");

        goBtn.setText("Go!");
        goBtn.setEnabled(false);
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Convert .wav to .mp3");

        jLabel3.setText("<^><");

        moreBtn.setText("More");
        moreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreBtnActionPerformed(evt);
            }
        });

        qualPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        qualLabel.setText("Quality");

        qualityGroup.add(qualBtnHigh);
        qualBtnHigh.setSelected(true);
        qualBtnHigh.setText("High (default)");
        qualBtnHigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualBtnHighActionPerformed(evt);
            }
        });

        qualityGroup.add(qualBtnMed);
        qualBtnMed.setText("Medium");
        qualBtnMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualBtnMedActionPerformed(evt);
            }
        });

        qualityGroup.add(qualBtnLow);
        qualBtnLow.setText("Low");
        qualBtnLow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualBtnLowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout qualPanelLayout = new javax.swing.GroupLayout(qualPanel);
        qualPanel.setLayout(qualPanelLayout);
        qualPanelLayout.setHorizontalGroup(
            qualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qualPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(qualPanelLayout.createSequentialGroup()
                        .addComponent(qualBtnHigh)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(qualPanelLayout.createSequentialGroup()
                        .addGroup(qualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qualBtnLow)
                            .addGroup(qualPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(qualLabel))
                            .addComponent(qualBtnMed))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        qualPanelLayout.setVerticalGroup(
            qualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qualPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qualLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qualBtnHigh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qualBtnMed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qualBtnLow)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(destLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(filesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(moreBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(goBtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(qualPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(filesLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(destLabel))
                .addGap(18, 18, 18)
                .addComponent(goBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moreBtn)
                .addGap(18, 18, 18)
                .addComponent(qualPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser filechooser = new JFileChooser();
        filechooser.setMultiSelectionEnabled(true);
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter(".wav files", "wav"));
        filechooser.setAcceptAllFileFilterUsed(false);
        filechooser.showOpenDialog(this);
        File[] f = filechooser.getSelectedFiles();
        if(f.length == 0)
            return;
        if (f.length > 1){
            filesLabel.setText(f.length + " files chosen");
        }else if (f.length == 1) {
            filesLabel.setText(f.length + " file chosen");
        }
        destLabel.setText(f[0].getParent());
        conv.setFiles(f);
        conv.setDir(f[0].getParentFile());
        toggleGoBtn();
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        filechooser.showOpenDialog(this);
        File d = filechooser.getSelectedFile();
        if (d == null)
            return;
        destLabel.setText("" + d);
        conv.setDir(d);
        toggleGoBtn();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        for(File f : conv.getFiles()){
            try{
            conv.convert(f);
            }catch(Exception e){
                System.out.println(""+e);
                jLabel1.setText(""+e);
                jDialog1.setVisible(true);
            }
        }
    }//GEN-LAST:event_goBtnActionPerformed

    private void qualBtnHighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualBtnHighActionPerformed
        conv.setQuality(0);
    }//GEN-LAST:event_qualBtnHighActionPerformed

    private void qualBtnMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualBtnMedActionPerformed
        conv.setQuality(2);
    }//GEN-LAST:event_qualBtnMedActionPerformed

    private void qualBtnLowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualBtnLowActionPerformed
        conv.setQuality(4);
    }//GEN-LAST:event_qualBtnLowActionPerformed

    private void moreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreBtnActionPerformed
        more = !more;
        qualPanel.setVisible(more);
        Dimension size;
        if(more){
            size = new Dimension(450, 390);
            this.setSize(size);
        }else{
            size = new Dimension(450, 279);
            this.setSize(size);
            
        }
    }//GEN-LAST:event_moreBtnActionPerformed
    
    private void toggleGoBtn() {
        goBtn.setEnabled(conv.ready());
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println(LameExe.getPath());
        
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel destLabel;
    private javax.swing.JLabel filesLabel;
    private javax.swing.JButton goBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton moreBtn;
    private javax.swing.JRadioButton qualBtnHigh;
    private javax.swing.JRadioButton qualBtnLow;
    private javax.swing.JRadioButton qualBtnMed;
    private javax.swing.JLabel qualLabel;
    private javax.swing.JPanel qualPanel;
    private javax.swing.ButtonGroup qualityGroup;
    // End of variables declaration//GEN-END:variables
}
