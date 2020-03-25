/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.CardLayout;
import java.io.File;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Vishu PC
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    CardLayout cardLayout;
    public Index() {
        initComponents();
        
        cardLayout = (CardLayout)(card.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectionButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        card = new javax.swing.JPanel();
        selection = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MultipleFile = new javax.swing.JButton();
        singleFile = new javax.swing.JButton();
        filechoose = new javax.swing.JPanel();
        choosetxt = new javax.swing.JTextField();
        choosebtn = new javax.swing.JButton();
        uploadbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        functions = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sizebtn = new javax.swing.JButton();
        inheritancebtn = new javax.swing.JButton();
        couplingbtn = new javax.swing.JButton();
        csbtn = new javax.swing.JButton();
        overallbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/code.png"))); // NOI18N
        jLabel1.setText("CODE COMPLEXITY TOOL");
        jLabel1.setPreferredSize(new java.awt.Dimension(313, 80));

        card.setLayout(new java.awt.CardLayout());

        selection.setPreferredSize(new java.awt.Dimension(1100, 600));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Do you want to upload Single file or Multiple files ?");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        MultipleFile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MultipleFile.setText("Multiple File");
        MultipleFile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MultipleFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultipleFileActionPerformed(evt);
            }
        });

        singleFile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        singleFile.setText("Single File");
        singleFile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        singleFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectionLayout = new javax.swing.GroupLayout(selection);
        selection.setLayout(selectionLayout);
        selectionLayout.setHorizontalGroup(
            selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionLayout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addGroup(selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionLayout.createSequentialGroup()
                        .addComponent(MultipleFile, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(362, 362, 362))))
            .addGroup(selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionLayout.createSequentialGroup()
                    .addContainerGap(394, Short.MAX_VALUE)
                    .addComponent(singleFile, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(363, 363, 363)))
        );
        selectionLayout.setVerticalGroup(
            selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addGap(169, 169, 169)
                .addComponent(MultipleFile, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(selectionLayout.createSequentialGroup()
                    .addGap(179, 179, 179)
                    .addComponent(singleFile, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(345, Short.MAX_VALUE)))
        );

        card.add(selection, "card2");

        choosetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosetxtActionPerformed(evt);
            }
        });

        choosebtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        choosebtn.setText("Choose");
        choosebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choosebtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        choosebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosebtnActionPerformed(evt);
            }
        });

        uploadbtn.setBackground(new java.awt.Color(0, 0, 255));
        uploadbtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        uploadbtn.setForeground(new java.awt.Color(255, 255, 255));
        uploadbtn.setText("Upload");
        uploadbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uploadbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uploadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Home");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("- You can calculate the complexity of");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Java / C++ code using this");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Desktop Application -");

        javax.swing.GroupLayout filechooseLayout = new javax.swing.GroupLayout(filechoose);
        filechoose.setLayout(filechooseLayout);
        filechooseLayout.setHorizontalGroup(
            filechooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filechooseLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(filechooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(filechooseLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(filechooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(filechooseLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(filechooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))))))
                .addGroup(filechooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filechooseLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(choosetxt)
                        .addGap(18, 18, 18)
                        .addComponent(choosebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filechooseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                        .addComponent(uploadbtn)
                        .addGap(325, 325, 325))))
        );
        filechooseLayout.setVerticalGroup(
            filechooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filechooseLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(filechooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filechooseLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(filechooseLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(filechooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(choosetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choosebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(uploadbtn)))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        card.add(filechoose, "filechoose");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Code Complexity");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("- You can calculate the complexity of");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Java / C++ code using this");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Desktop Application -");

        sizebtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sizebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/size.png"))); // NOI18N
        sizebtn.setText("Size, Variable, Method");
        sizebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        inheritancebtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        inheritancebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inheritance.png"))); // NOI18N
        inheritancebtn.setText("Inheritance");
        inheritancebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inheritancebtn.setPreferredSize(new java.awt.Dimension(265, 73));
        inheritancebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inheritancebtnActionPerformed(evt);
            }
        });

        couplingbtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        couplingbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/coupling.png"))); // NOI18N
        couplingbtn.setText("Coupling");
        couplingbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        couplingbtn.setPreferredSize(new java.awt.Dimension(265, 73));
        couplingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couplingbtnActionPerformed(evt);
            }
        });

        csbtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        csbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/control.png"))); // NOI18N
        csbtn.setText("Control Structure");
        csbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        csbtn.setPreferredSize(new java.awt.Dimension(265, 73));
        csbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csbtnActionPerformed(evt);
            }
        });

        overallbtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        overallbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        overallbtn.setText("Overall");
        overallbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        overallbtn.setPreferredSize(new java.awt.Dimension(265, 73));

        javax.swing.GroupLayout functionsLayout = new javax.swing.GroupLayout(functions);
        functions.setLayout(functionsLayout);
        functionsLayout.setHorizontalGroup(
            functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(functionsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(functionsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))))))
                .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(functionsLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(functionsLayout.createSequentialGroup()
                                .addComponent(sizebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(inheritancebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(functionsLayout.createSequentialGroup()
                                .addComponent(csbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(couplingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, functionsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(overallbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(315, 315, 315))))
        );
        functionsLayout.setVerticalGroup(
            functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionsLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(functionsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sizebtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inheritancebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(overallbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(couplingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(csbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(164, Short.MAX_VALUE))
                    .addGroup(functionsLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        card.add(functions, "functions");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(card, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(620, 620, 620))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choosetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choosetxtActionPerformed

    private void choosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosebtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        choosetxt.setText(filename);
    }//GEN-LAST:event_choosebtnActionPerformed

    private void uploadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbtnActionPerformed
                cardLayout.show(card, "functions");
    }//GEN-LAST:event_uploadbtnActionPerformed

    private void inheritancebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inheritancebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inheritancebtnActionPerformed

    private void couplingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couplingbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_couplingbtnActionPerformed

    private void csbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csbtnActionPerformed
        String data = "<html>Complexity of a program statement with a control structure is computed as follows: <br><br>"
        + "<b>Ccs = ( Wtcs * NC ) + Ccspps</b> <br><br>"
        + "Ccs   =  Complexity of a program statement with a control structure <br>"
        + "Wtcs   =  Weight due to control structure type <br>"
        + "NC =  Number of conditions in the control structure <br>"
        + "Ccspps = Control structure complexity of the previous program statement. Hence, always the value of Ccspps would be zero for control structures which reside at the first nesting level or outer most nesting level.   </html>";
        JOptionPane jo = new JOptionPane();
        jo.setMessage(data);
        jo.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = jo.createDialog(null, "Code Complexity due to Control Structure");
        dialog.setVisible(true);
    }//GEN-LAST:event_csbtnActionPerformed

    private void MultipleFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultipleFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MultipleFileActionPerformed

    private void singleFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleFileActionPerformed
            cardLayout.show(card, "filechoose");
    }//GEN-LAST:event_singleFileActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MultipleFile;
    private javax.swing.JPanel card;
    private javax.swing.JButton choosebtn;
    private javax.swing.JTextField choosetxt;
    private javax.swing.JButton couplingbtn;
    private javax.swing.JButton csbtn;
    private javax.swing.JPanel filechoose;
    private javax.swing.JPanel functions;
    private javax.swing.JButton inheritancebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton overallbtn;
    private javax.swing.JPanel selection;
    private javax.swing.ButtonGroup selectionButtonGroup;
    private javax.swing.JButton singleFile;
    private javax.swing.JButton sizebtn;
    private javax.swing.JButton uploadbtn;
    // End of variables declaration//GEN-END:variables
}
