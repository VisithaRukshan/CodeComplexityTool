/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Coupling.RecCallRec_same_file;
import Coupling.RegCallGlobal_same_file;
import Coupling.RegrCallReg_same_file;
import Coupling.codeLines;
import Coupling.Recurtion;
import Coupling.RecCallReg_same_file;
import Coupling.RegCallRec_same_file;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Vishu PC
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    CardLayout cardLayout;
    CardLayout cardLayout1;
         //coupling stuff//
      ArrayList<String> mymethod = new ArrayList<String>();
      ArrayList<String> methodSet = new ArrayList<String>();
      ArrayList<String> recursivelist = new ArrayList<String>();
      ArrayList<String> coupling_class = new ArrayList<>();
      ArrayList<String> Globalvariables = new ArrayList<>();
       ArrayList<String> MandV = new ArrayList<>();
       ArrayList<String> trash = new ArrayList<>();
      ArrayList<Integer> allc = new ArrayList<Integer>();
      ArrayList<Integer> gs = new ArrayList<Integer>();
     ///////////////////////////////////////////////////////////////  
   
    
    public Index() {
        initComponents();
        
        
        cardLayout = (CardLayout)(card.getLayout());
        cardLayout1 = (CardLayout)(subCard.getLayout());
     
        super.setLocationRelativeTo(null);
        
        String[] a = {"1", "2", "3", "4", "5"};
        JComboBox c = new JComboBox(a);
       
        //set jcombobox to all jtable
        jTable11.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(c));
      
        jTable13.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(c));
        jTable12.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(c));
        jTable14.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(c));
        jTable9.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(c));
    }
    //////////////////////////
     public void couplingtotextarea(){
         
    int aa = 2;
    int bb = 2;
    int cc = 3;
    int dd = 4;
    int ee = 3;
    int ff = 1;
    
     DefaultTableModel tb = (DefaultTableModel)jTable10.getModel();
     tb.setValueAt(aa, 0, 1);
     tb.setValueAt(bb, 1, 1);
     tb.setValueAt(cc, 2, 1);
     tb.setValueAt(dd, 3, 1);
     tb.setValueAt(ee, 4, 1);
     tb.setValueAt(ff, 5, 1);
     
    
    
        try {
            Scanner scanner = new Scanner(new File(choosetxt.getText()));
            int cout = 0;
            while (scanner.hasNextLine()) {
                
               String line = scanner.nextLine();
               mymethod.add(line);
               jTextArea4.setText(jTextArea4.getText() + "\n" + line  );
               cout++;
               String[] words = line.split("\n" ) ;
               couplingprint(words);  
            }
            String word = "";
            //int cc = 0;
            //method
        
           
           // System.out.println("cc = " + cc);
            jTextField7.setText(Integer.toString(cout));
            if(choosetxt.getText().contains("java")){
                    jTextField6.setText("Java");
            }
            else if(choosetxt.getText().contains("cpp")){
                    jTextField6.setText("C++");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
     ////method
     /////////////////////////////////////////////////////
     
     
     
     
     /////////////////////////////////////////////////////
    
//    public TableModel CouplingToTable(){
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.addColumn("Line No",allc.toArray());
//        model.addColumn("Class Name", mymethod.toArray());
//        model.addColumn("Nr");
//        model.addColumn("Nmcms");
//	model.addColumn("Nmcrms");
//	model.addColumn("Nrmcrms");
//	model.addColumn("Nrmcms");
//	model.addColumn("Nmrgvs");
//	model.addColumn("Nrmrgvs");
//	model.addColumn("Ccp");
//       
//        return model;
//}
    
    public void couplingprint(String[] word){
     String sentence = "";
                for ( int j = 0 ; j < word.length ; j++) {
                          sentence =  sentence+ " " + word[j];
                         
                     } 
                  
    }
    
    
    
    
    ///////////////////

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectionButtonGruop = new javax.swing.ButtonGroup();
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
        backbtnfile = new javax.swing.JButton();
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
        backbtnfunction = new javax.swing.JButton();
        multiFileChooser = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        choosebtn1 = new javax.swing.JButton();
        uploadbtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        choosetxtarea = new javax.swing.JTextArea();
        backbtnmulti = new javax.swing.JButton();
        CouplingFinal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        backbtnfunction1 = new javax.swing.JButton();
        tot = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MethodFinal = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        backbtnfunction2 = new javax.swing.JButton();
        InheritanceFinal = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        backbtnfunction3 = new javax.swing.JButton();
        FinalDueToAllFactor = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        javax.swing.JTable jTable4 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        backbtnfunction4 = new javax.swing.JButton();
        ControlStructureFinal = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        backbtnfunction5 = new javax.swing.JButton();
        SizeFinal = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        backbtnfunction6 = new javax.swing.JButton();
        VariablesFinal = new javax.swing.JPanel();
        backbtnfunction7 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        viewcs = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        viewcombobox1 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        backbtnviewcs = new javax.swing.JButton();
        viewoverall = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        viewcombobox2 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();
        backbtnoverall = new javax.swing.JButton();
        controlStructureCalculation = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        backbtnviewcs1 = new javax.swing.JButton();
        couplingCalculation = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        backbtnviewcs2 = new javax.swing.JButton();
        notyfy = new javax.swing.JLabel();
        inheritanceCalculation = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        backbtnviewcs3 = new javax.swing.JButton();
        threeInOne = new javax.swing.JPanel();
        backbtnviewcs4 = new javax.swing.JButton();
        subCard = new javax.swing.JPanel();
        sizeCalculation = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        methodCalculation = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        variableCalculation = new javax.swing.JPanel();
        jTextField14 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        size = new javax.swing.JRadioButton();
        method = new javax.swing.JRadioButton();
        variable = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Free_Sample_By_Wix.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(313, 80));

        card.setLayout(new java.awt.CardLayout());

        selection.setPreferredSize(new java.awt.Dimension(1100, 600));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Do you want to upload Single file or Multiple files ?");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        MultipleFile.setBackground(new java.awt.Color(204, 204, 204));
        MultipleFile.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        MultipleFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/multiple.png"))); // NOI18N
        MultipleFile.setText("Multiple File");
        MultipleFile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MultipleFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MultipleFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultipleFileActionPerformed(evt);
            }
        });

        singleFile.setBackground(new java.awt.Color(204, 204, 204));
        singleFile.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        singleFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/single.png"))); // NOI18N
        singleFile.setText("Single File");
        singleFile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        singleFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap(266, Short.MAX_VALUE)
                .addGroup(selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionLayout.createSequentialGroup()
                        .addGroup(selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(singleFile, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MultipleFile, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(427, 427, 427))))
        );
        selectionLayout.setVerticalGroup(
            selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(singleFile, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(MultipleFile, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        card.add(selection, "selection");

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

        backbtnfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnfileActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                        .addComponent(uploadbtn)
                        .addGap(325, 325, 325))))
            .addGroup(filechooseLayout.createSequentialGroup()
                .addComponent(backbtnfile)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        filechooseLayout.setVerticalGroup(
            filechooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filechooseLayout.createSequentialGroup()
                .addComponent(backbtnfile)
                .addGap(160, 160, 160)
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
                .addContainerGap(354, Short.MAX_VALUE))
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
        sizebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizebtnActionPerformed(evt);
            }
        });

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
        overallbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overallbtnActionPerformed(evt);
            }
        });

        backbtnfunction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnfunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnfunctionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout functionsLayout = new javax.swing.GroupLayout(functions);
        functions.setLayout(functionsLayout);
        functionsLayout.setHorizontalGroup(
            functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
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
                .addGap(76, 76, 76)
                .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(functionsLayout.createSequentialGroup()
                            .addComponent(sizebtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                            .addComponent(inheritancebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(functionsLayout.createSequentialGroup()
                            .addComponent(csbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(couplingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, functionsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(overallbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)))
                .addGap(49, 49, 49))
            .addGroup(functionsLayout.createSequentialGroup()
                .addComponent(backbtnfunction)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        functionsLayout.setVerticalGroup(
            functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, functionsLayout.createSequentialGroup()
                .addComponent(backbtnfunction)
                .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(functionsLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel9)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(functionsLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sizebtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inheritancebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(overallbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(functionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(couplingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(csbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(309, Short.MAX_VALUE))
        );

        card.add(functions, "functions");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Home");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("- You can calculate the complexity of");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Java / C++ code using this");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("Desktop Application -");

        choosebtn1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        choosebtn1.setText("Choose");
        choosebtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choosebtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        choosebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosebtn1ActionPerformed(evt);
            }
        });

        uploadbtn1.setBackground(new java.awt.Color(0, 0, 255));
        uploadbtn1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        uploadbtn1.setForeground(new java.awt.Color(255, 255, 255));
        uploadbtn1.setText("Upload");
        uploadbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uploadbtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uploadbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtn1ActionPerformed(evt);
            }
        });

        choosetxtarea.setColumns(20);
        choosetxtarea.setRows(5);
        choosetxtarea.setPreferredSize(new java.awt.Dimension(280, 94));
        jScrollPane1.setViewportView(choosetxtarea);

        backbtnmulti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnmultiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout multiFileChooserLayout = new javax.swing.GroupLayout(multiFileChooser);
        multiFileChooser.setLayout(multiFileChooserLayout);
        multiFileChooserLayout.setHorizontalGroup(
            multiFileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, multiFileChooserLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(multiFileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(multiFileChooserLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(multiFileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(multiFileChooserLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(multiFileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(choosebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, multiFileChooserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(uploadbtn1)
                .addGap(309, 309, 309))
            .addGroup(multiFileChooserLayout.createSequentialGroup()
                .addComponent(backbtnmulti)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        multiFileChooserLayout.setVerticalGroup(
            multiFileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(multiFileChooserLayout.createSequentialGroup()
                .addComponent(backbtnmulti)
                .addGap(150, 150, 150)
                .addGroup(multiFileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(multiFileChooserLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15))
                    .addComponent(choosebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(uploadbtn1)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        card.add(multiFileChooser, "multiFileChooser");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Line No", "Programme Statement", "Nr", "Nmcms", "Nmcrms", "Nrmcrms", "Nrmcms", "Nmrgvs", "Nmcmd ", "Nmcrmd ", "Nrmcrmd ", "Nmrgvd", "Nrmrgvs  ", "Nrmrgvd", "Cpp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setOpaque(false);
        jTable1.setRowHeight(25);
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Print PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Coupling");

        backbtnfunction1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnfunction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnfunction1ActionPerformed(evt);
            }
        });

        tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totActionPerformed(evt);
            }
        });

        jLabel3.setText("Total Code Complexcity Due to Coupling");

        javax.swing.GroupLayout CouplingFinalLayout = new javax.swing.GroupLayout(CouplingFinal);
        CouplingFinal.setLayout(CouplingFinalLayout);
        CouplingFinalLayout.setHorizontalGroup(
            CouplingFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CouplingFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CouplingFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CouplingFinalLayout.createSequentialGroup()
                        .addComponent(backbtnfunction1)
                        .addContainerGap(1036, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CouplingFinalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(CouplingFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CouplingFinalLayout.createSequentialGroup()
                    .addGroup(CouplingFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CouplingFinalLayout.createSequentialGroup()
                            .addGap(468, 468, 468)
                            .addComponent(jButton1))
                        .addGroup(CouplingFinalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(CouplingFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        CouplingFinalLayout.setVerticalGroup(
            CouplingFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CouplingFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtnfunction1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 428, Short.MAX_VALUE)
                .addGroup(CouplingFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204))
            .addGroup(CouplingFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CouplingFinalLayout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(jLabel16)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton1)
                    .addContainerGap(204, Short.MAX_VALUE)))
        );

        card.add(CouplingFinal, "couplingFinal");

        jButton2.setText("Print PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Line NO", "Program Statement", "Wmrt", "Npdtp", "Ncdtp", "Cm"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Methods");

        backbtnfunction2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnfunction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnfunction2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MethodFinalLayout = new javax.swing.GroupLayout(MethodFinal);
        MethodFinal.setLayout(MethodFinalLayout);
        MethodFinalLayout.setHorizontalGroup(
            MethodFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MethodFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtnfunction2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MethodFinalLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(MethodFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MethodFinalLayout.createSequentialGroup()
                    .addGroup(MethodFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MethodFinalLayout.createSequentialGroup()
                            .addGap(430, 430, 430)
                            .addComponent(jButton2))
                        .addGroup(MethodFinalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(596, Short.MAX_VALUE)))
        );
        MethodFinalLayout.setVerticalGroup(
            MethodFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MethodFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtnfunction2)
                .addGap(121, 121, 121)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
            .addGroup(MethodFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MethodFinalLayout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(jLabel18)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 521, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addContainerGap()))
        );

        card.add(MethodFinal, "methodFinal");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Count", "Class Name", "No of direct inheritance", "No of indirect inheritance", "Total inheritance", "Ci"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jButton3.setText("Print PDF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Inheritance");

        backbtnfunction3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnfunction3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnfunction3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InheritanceFinalLayout = new javax.swing.GroupLayout(InheritanceFinal);
        InheritanceFinal.setLayout(InheritanceFinalLayout);
        InheritanceFinalLayout.setHorizontalGroup(
            InheritanceFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InheritanceFinalLayout.createSequentialGroup()
                .addGroup(InheritanceFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InheritanceFinalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbtnfunction3))
                    .addGroup(InheritanceFinalLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(InheritanceFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InheritanceFinalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(InheritanceFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(InheritanceFinalLayout.createSequentialGroup()
                            .addGap(416, 416, 416)
                            .addComponent(jButton3))
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(586, Short.MAX_VALUE)))
        );
        InheritanceFinalLayout.setVerticalGroup(
            InheritanceFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InheritanceFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtnfunction3)
                .addGap(108, 108, 108)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
            .addGroup(InheritanceFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InheritanceFinalLayout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(jLabel20)
                    .addGap(299, 299, 299)
                    .addComponent(jButton3)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        card.add(InheritanceFinal, "inheritanceFinal");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Complexity due to all the factors");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable4.setAutoCreateRowSorter(true);
        jTable4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Line NO", "Program Statement", "Cs", "Cv", "Cm", "Ci", "Ccp", "Ccs", "TCps"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jButton4.setText("Print PDF");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        backbtnfunction4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnfunction4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnfunction4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FinalDueToAllFactorLayout = new javax.swing.GroupLayout(FinalDueToAllFactor);
        FinalDueToAllFactor.setLayout(FinalDueToAllFactorLayout);
        FinalDueToAllFactorLayout.setHorizontalGroup(
            FinalDueToAllFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinalDueToAllFactorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FinalDueToAllFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
                    .addGroup(FinalDueToAllFactorLayout.createSequentialGroup()
                        .addComponent(backbtnfunction4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(FinalDueToAllFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FinalDueToAllFactorLayout.createSequentialGroup()
                    .addGroup(FinalDueToAllFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FinalDueToAllFactorLayout.createSequentialGroup()
                            .addGap(482, 482, 482)
                            .addComponent(jButton4))
                        .addGroup(FinalDueToAllFactorLayout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jLabel22)))
                    .addContainerGap(532, Short.MAX_VALUE)))
        );
        FinalDueToAllFactorLayout.setVerticalGroup(
            FinalDueToAllFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FinalDueToAllFactorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtnfunction4)
                .addGap(101, 101, 101)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(FinalDueToAllFactorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FinalDueToAllFactorLayout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jLabel22)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 531, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addContainerGap()))
        );

        card.add(FinalDueToAllFactor, "finalDueAllFactor");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Control Structure");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Line NO", "Program Statement", "Wtcs", "Nc", "Ccpps", "Ccs"
            }
        ));
        jScrollPane6.setViewportView(jTable5);

        jButton5.setText("Print PDF");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        backbtnfunction5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnfunction5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnfunction5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlStructureFinalLayout = new javax.swing.GroupLayout(ControlStructureFinal);
        ControlStructureFinal.setLayout(ControlStructureFinalLayout);
        ControlStructureFinalLayout.setHorizontalGroup(
            ControlStructureFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlStructureFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlStructureFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbtnfunction5))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(ControlStructureFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ControlStructureFinalLayout.createSequentialGroup()
                    .addGroup(ControlStructureFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ControlStructureFinalLayout.createSequentialGroup()
                            .addGap(436, 436, 436)
                            .addComponent(jButton5))
                        .addGroup(ControlStructureFinalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(590, Short.MAX_VALUE)))
        );
        ControlStructureFinalLayout.setVerticalGroup(
            ControlStructureFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlStructureFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtnfunction5)
                .addGap(112, 112, 112)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
            .addGroup(ControlStructureFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ControlStructureFinalLayout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(jLabel24)
                    .addGap(308, 308, 308)
                    .addComponent(jButton5)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        card.add(ControlStructureFinal, "controlStuctureFinal");

        jButton6.setText("Print PDF");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Line NO", "Program Statement", "Nkw", "Nid", "Nop", "Nnv", "Nsl", "Cs"
            }
        ));
        jScrollPane7.setViewportView(jTable6);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Size");

        backbtnfunction6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnfunction6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnfunction6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SizeFinalLayout = new javax.swing.GroupLayout(SizeFinal);
        SizeFinal.setLayout(SizeFinalLayout);
        SizeFinalLayout.setHorizontalGroup(
            SizeFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SizeFinalLayout.createSequentialGroup()
                .addGroup(SizeFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SizeFinalLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SizeFinalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbtnfunction6)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(SizeFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SizeFinalLayout.createSequentialGroup()
                    .addGroup(SizeFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SizeFinalLayout.createSequentialGroup()
                            .addGap(436, 436, 436)
                            .addComponent(jButton6))
                        .addGroup(SizeFinalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(590, Short.MAX_VALUE)))
        );
        SizeFinalLayout.setVerticalGroup(
            SizeFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SizeFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtnfunction6)
                .addGap(152, 152, 152)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
            .addGroup(SizeFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SizeFinalLayout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jLabel26)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                    .addComponent(jButton6)
                    .addContainerGap()))
        );

        card.add(SizeFinal, "sizeFinal");

        backbtnfunction7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnfunction7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnfunction7ActionPerformed(evt);
            }
        });

        jButton7.setText("Print PDF");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Variables");

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Line NO", "Program Statement", "Wvs", "Npdtv", "Ncdtv", "Cv"
            }
        ));
        jScrollPane8.setViewportView(jTable7);

        javax.swing.GroupLayout VariablesFinalLayout = new javax.swing.GroupLayout(VariablesFinal);
        VariablesFinal.setLayout(VariablesFinalLayout);
        VariablesFinalLayout.setHorizontalGroup(
            VariablesFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VariablesFinalLayout.createSequentialGroup()
                .addGroup(VariablesFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VariablesFinalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbtnfunction7))
                    .addGroup(VariablesFinalLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(VariablesFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(VariablesFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VariablesFinalLayout.createSequentialGroup()
                    .addGap(418, 418, 418)
                    .addComponent(jButton7)
                    .addContainerGap(596, Short.MAX_VALUE)))
        );
        VariablesFinalLayout.setVerticalGroup(
            VariablesFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VariablesFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtnfunction7)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
            .addGroup(VariablesFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VariablesFinalLayout.createSequentialGroup()
                    .addGap(468, 468, 468)
                    .addComponent(jButton7)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        card.add(VariablesFinal, "variableFinal");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Code Complexity due to Control Structure");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText(" Java / C++ Files :");

        viewcombobox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        viewcombobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        viewcombobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcombobox1ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("No of  Lines :");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane9.setViewportView(jTextArea1);

        jButton8.setBackground(new java.awt.Color(0, 0, 255));
        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton8.setText("Calculate");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTable8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable8.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A conditional c.s - ‘if’ or ‘else-if’ condition", null},
                {"An iterative c.s - ‘for’, ‘while’, or ‘do-while’ loop", null},
                {"The ‘switch’ statement in a ‘switch-case’ c.s", null},
                {"Each ‘case’ statement in a ‘switch-case’ c.s", null}
            },
            new String [] {
                "Control Structure Type", "Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setAlignmentX(1);
        jTable8.setAlignmentY(1);
        jTable8.setRowHeight(27);
        jScrollPane10.setViewportView(jTable8);

        jButton9.setBackground(new java.awt.Color(0, 204, 0));
        jButton9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Save");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        backbtnviewcs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnviewcs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtnviewcs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnviewcsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewcsLayout = new javax.swing.GroupLayout(viewcs);
        viewcs.setLayout(viewcsLayout);
        viewcsLayout.setHorizontalGroup(
            viewcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewcsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
            .addGroup(viewcsLayout.createSequentialGroup()
                .addGroup(viewcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewcsLayout.createSequentialGroup()
                        .addComponent(backbtnviewcs)
                        .addGap(234, 234, 234)
                        .addGroup(viewcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(viewcsLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewcombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29)))
                    .addGroup(viewcsLayout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addComponent(jButton8))
                    .addGroup(viewcsLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewcsLayout.createSequentialGroup()
                        .addGap(503, 503, 503)
                        .addComponent(jButton9)))
                .addGap(308, 308, 308))
        );
        viewcsLayout.setVerticalGroup(
            viewcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewcsLayout.createSequentialGroup()
                .addGroup(viewcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewcsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29))
                    .addComponent(backbtnviewcs))
                .addGap(18, 18, 18)
                .addGroup(viewcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(viewcombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        card.add(viewcs, "viewcs");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Overall Code Complexity");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText(" Java / C++ Files :");

        viewcombobox2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        viewcombobox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("No of  Lines :");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane11.setViewportView(jTextArea2);

        jButton10.setBackground(new java.awt.Color(0, 0, 255));
        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Calculate");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        backbtnoverall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnoverall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnoverallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewoverallLayout = new javax.swing.GroupLayout(viewoverall);
        viewoverall.setLayout(viewoverallLayout);
        viewoverallLayout.setHorizontalGroup(
            viewoverallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewoverallLayout.createSequentialGroup()
                .addGroup(viewoverallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewoverallLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewoverallLayout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(jButton10))
                    .addGroup(viewoverallLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewcombobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewoverallLayout.createSequentialGroup()
                        .addComponent(backbtnoverall)
                        .addGap(345, 345, 345)
                        .addComponent(jLabel32)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        viewoverallLayout.setVerticalGroup(
            viewoverallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewoverallLayout.createSequentialGroup()
                .addGroup(viewoverallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backbtnoverall)
                    .addGroup(viewoverallLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel32)))
                .addGap(32, 32, 32)
                .addGroup(viewoverallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewcombobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton10)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        card.add(viewoverall, "viewoverall");

        jTextField4.setEditable(false);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Java/C++");

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane12.setViewportView(jTextArea3);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A conditional c.s - ‘if’ or ‘else-if’ condition", null},
                {"An iterative c.s - ‘for’, ‘while’, or ‘do-while’ loop", null},
                {"The ‘switch’ statement in a ‘switch-case’ c.s", null},
                {"Each ‘case’ statement in a ‘switch-case’ c.s", null}
            },
            new String [] {
                "Control Structure Type", "Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable9.setFocusable(false);
        jTable9.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable9.setRowHeight(25);
        jTable9.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jTable9.setShowVerticalLines(false);
        jTable9.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(jTable9);

        jButton11.setBackground(new java.awt.Color(0, 51, 255));
        jButton11.setText("Save");

        jButton12.setBackground(new java.awt.Color(0, 51, 255));
        jButton12.setText("Calculate");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("No of Lines");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Code Complexcity Due to Control Structure");

        backbtnviewcs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnviewcs1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtnviewcs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnviewcs1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlStructureCalculationLayout = new javax.swing.GroupLayout(controlStructureCalculation);
        controlStructureCalculation.setLayout(controlStructureCalculationLayout);
        controlStructureCalculationLayout.setHorizontalGroup(
            controlStructureCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlStructureCalculationLayout.createSequentialGroup()
                .addComponent(backbtnviewcs1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(controlStructureCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlStructureCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(controlStructureCalculationLayout.createSequentialGroup()
                            .addGroup(controlStructureCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane13)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(controlStructureCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(controlStructureCalculationLayout.createSequentialGroup()
                        .addGroup(controlStructureCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controlStructureCalculationLayout.createSequentialGroup()
                                .addGap(319, 319, 319)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controlStructureCalculationLayout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        controlStructureCalculationLayout.setVerticalGroup(
            controlStructureCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlStructureCalculationLayout.createSequentialGroup()
                .addGroup(controlStructureCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlStructureCalculationLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backbtnviewcs1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlStructureCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlStructureCalculationLayout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        card.add(controlStructureCalculation, "controlStructureCalculation");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Code Complexcity Due to Coupling");

        jTextField6.setEditable(false);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Java/C++");

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane14.setViewportView(jTextArea4);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A recursive call ", null},
                {"A regular method calling another regular method in the same file ", null},
                {"A regular method calling a recursive method in the same file", null},
                {"A recursive method calling another recursive method in the same file ", null},
                {"A recursive method calling a regular method in the same file ", null},
                {"A regular method referencing a global variable in the same file", null}

            },
            new String [] {
                "Coupling", "Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable10.setFocusable(false);
        jTable10.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable10.setRowHeight(25);
        jTable10.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jTable10.setShowVerticalLines(false);
        jTable10.getTableHeader().setReorderingAllowed(false);
        jScrollPane15.setViewportView(jTable10);

        jButton13.setBackground(new java.awt.Color(0, 51, 255));
        jButton13.setText("Save");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 51, 255));
        jButton14.setText("Calculate");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("No of Lines");

        backbtnviewcs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnviewcs2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtnviewcs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnviewcs2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout couplingCalculationLayout = new javax.swing.GroupLayout(couplingCalculation);
        couplingCalculation.setLayout(couplingCalculationLayout);
        couplingCalculationLayout.setHorizontalGroup(
            couplingCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(couplingCalculationLayout.createSequentialGroup()
                .addGroup(couplingCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(couplingCalculationLayout.createSequentialGroup()
                        .addComponent(backbtnviewcs2)
                        .addGroup(couplingCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(couplingCalculationLayout.createSequentialGroup()
                                .addGroup(couplingCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(couplingCalculationLayout.createSequentialGroup()
                                        .addGap(318, 318, 318)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(couplingCalculationLayout.createSequentialGroup()
                                        .addGap(317, 317, 317)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, couplingCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, couplingCalculationLayout.createSequentialGroup()
                                    .addGroup(couplingCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(21, 21, 21)
                                    .addGroup(couplingCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(couplingCalculationLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(notyfy, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        couplingCalculationLayout.setVerticalGroup(
            couplingCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(couplingCalculationLayout.createSequentialGroup()
                .addGroup(couplingCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(couplingCalculationLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backbtnviewcs2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(couplingCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(couplingCalculationLayout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(notyfy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        card.add(couplingCalculation, "couplingCalculation");

        jTextField8.setEditable(false);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Java/C++");

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane16.setViewportView(jTextArea5);

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {"A class inheriting from one user-defined class", null},
                {"A class inheriting from two user-defined classes", null},
                {"A class inheriting from three user-defined classes", null},
                {"A class inheriting from more than three user-defined classes", null}
            },
            new String [] {
                "Control Structure Type", "Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable11.setFocusable(false);
        jTable11.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable11.setRowHeight(25);
        jTable11.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jTable11.setShowVerticalLines(false);
        jTable11.getTableHeader().setReorderingAllowed(false);
        jScrollPane17.setViewportView(jTable11);

        jButton15.setBackground(new java.awt.Color(0, 51, 255));
        jButton15.setText("Save");

        jButton16.setBackground(new java.awt.Color(0, 51, 255));
        jButton16.setText("Calculate");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jTextField9.setEditable(false);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("No of Lines");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Code Complexcity Due to Inheritance");

        backbtnviewcs3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnviewcs3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtnviewcs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnviewcs3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inheritanceCalculationLayout = new javax.swing.GroupLayout(inheritanceCalculation);
        inheritanceCalculation.setLayout(inheritanceCalculationLayout);
        inheritanceCalculationLayout.setHorizontalGroup(
            inheritanceCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inheritanceCalculationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtnviewcs3)
                .addGroup(inheritanceCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inheritanceCalculationLayout.createSequentialGroup()
                        .addGroup(inheritanceCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inheritanceCalculationLayout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(inheritanceCalculationLayout.createSequentialGroup()
                                .addGap(317, 317, 317)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inheritanceCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(inheritanceCalculationLayout.createSequentialGroup()
                            .addGroup(inheritanceCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane17)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(inheritanceCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        inheritanceCalculationLayout.setVerticalGroup(
            inheritanceCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inheritanceCalculationLayout.createSequentialGroup()
                .addGroup(inheritanceCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inheritanceCalculationLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backbtnviewcs3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inheritanceCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inheritanceCalculationLayout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        card.add(inheritanceCalculation, "inheritanceCalculation");

        backbtnviewcs4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backbtnviewcs4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtnviewcs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnviewcs4ActionPerformed(evt);
            }
        });

        subCard.setLayout(new java.awt.CardLayout());

        jTextField12.setEditable(false);

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Java/C++");

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane20.setViewportView(jTextArea7);

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A keyword", null},
                {"An identifier", null},
                {"An operator", null},
                {"A numerical value", null},
                {"A string literal", null}

            },
            new String [] {
                "Control Structure Type", "Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable13.setFocusable(false);
        jTable13.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable13.setRowHeight(25);
        jTable13.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jTable13.setShowVerticalLines(false);
        jTable13.getTableHeader().setReorderingAllowed(false);
        jScrollPane21.setViewportView(jTable13);

        jButton19.setBackground(new java.awt.Color(0, 51, 255));
        jButton19.setText("Save");

        jButton20.setBackground(new java.awt.Color(0, 51, 255));
        jButton20.setText("Calculate");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jTextField13.setEditable(false);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("No of Lines");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Code Complexcity Due to Size");

        javax.swing.GroupLayout sizeCalculationLayout = new javax.swing.GroupLayout(sizeCalculation);
        sizeCalculation.setLayout(sizeCalculationLayout);
        sizeCalculationLayout.setHorizontalGroup(
            sizeCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sizeCalculationLayout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sizeCalculationLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(sizeCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sizeCalculationLayout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sizeCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(sizeCalculationLayout.createSequentialGroup()
                            .addGroup(sizeCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane21)
                                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(sizeCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(84, 84, 84))
        );
        sizeCalculationLayout.setVerticalGroup(
            sizeCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sizeCalculationLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sizeCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sizeCalculationLayout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        subCard.add(sizeCalculation, "sizeCalculation");

        jTextField10.setEditable(false);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Java/C++");

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane18.setViewportView(jTextArea6);

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A recursive call ", null},
                {"A regular method calling another regular method in the same file ", null},
                {"A regular method calling another regular method in a different file", null},
                {"A regular method calling a recursive method in the same file", null},
                {"A regular method calling a recursive method in a different file ", null},
                {"A recursive method calling another recursive method in the same file ", null},
                {"A recursive method calling another recursive method in a different file", null},
                {"A recursive method calling a regular method in the same file ", null},
                {"A recursive method calling a regular method in a different file", null},
                {"A regular method referencing a global variable in the same file", null},
                {"A regular method referencing a global variable in a different file ", null},
                {"A recursive method referencing a global variable in the same file ", null},
                {"A recursive method referencing a global variable in a different file ", null}
            },
            new String [] {
                "Control Structure Type", "Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable12.setFocusable(false);
        jTable12.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable12.setRowHeight(25);
        jTable12.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jTable12.setShowVerticalLines(false);
        jTable12.getTableHeader().setReorderingAllowed(false);
        jScrollPane19.setViewportView(jTable12);

        jButton17.setBackground(new java.awt.Color(0, 51, 255));
        jButton17.setText("Save");

        jButton18.setBackground(new java.awt.Color(0, 51, 255));
        jButton18.setText("Calculate");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("No of Lines");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Code Complexcity Due to Method");

        javax.swing.GroupLayout methodCalculationLayout = new javax.swing.GroupLayout(methodCalculation);
        methodCalculation.setLayout(methodCalculationLayout);
        methodCalculationLayout.setHorizontalGroup(
            methodCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(methodCalculationLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(methodCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(methodCalculationLayout.createSequentialGroup()
                        .addGroup(methodCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(methodCalculationLayout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(methodCalculationLayout.createSequentialGroup()
                                .addGap(317, 317, 317)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, methodCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(methodCalculationLayout.createSequentialGroup()
                            .addGroup(methodCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane19)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(methodCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        methodCalculationLayout.setVerticalGroup(
            methodCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(methodCalculationLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(methodCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(methodCalculationLayout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        subCard.add(methodCalculation, "methodCalculation");

        jTextField14.setEditable(false);

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Java/C++");

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jScrollPane22.setViewportView(jTextArea8);

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A recursive call ", null},
                {"A regular method calling another regular method in the same file ", null},
                {"A regular method calling another regular method in a different file", null},
                {"A regular method calling a recursive method in the same file", null},
                {"A regular method calling a recursive method in a different file ", null},
                {"A recursive method calling another recursive method in the same file ", null},
                {"A recursive method calling another recursive method in a different file", null},
                {"A recursive method calling a regular method in the same file ", null},
                {"A recursive method calling a regular method in a different file", null},
                {"A regular method referencing a global variable in the same file", null},
                {"A regular method referencing a global variable in a different file ", null},
                {"A recursive method referencing a global variable in the same file ", null},
                {"A recursive method referencing a global variable in a different file ", null}
            },
            new String [] {
                "Control Structure Type", "Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable14.setFocusable(false);
        jTable14.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable14.setRowHeight(25);
        jTable14.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jTable14.setShowVerticalLines(false);
        jTable14.getTableHeader().setReorderingAllowed(false);
        jScrollPane23.setViewportView(jTable14);

        jButton21.setBackground(new java.awt.Color(0, 51, 255));
        jButton21.setText("Save");

        jButton22.setBackground(new java.awt.Color(0, 51, 255));
        jButton22.setText("Calculate");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jTextField15.setEditable(false);

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("No of Lines");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Code Complexcity Due to Variables");

        javax.swing.GroupLayout variableCalculationLayout = new javax.swing.GroupLayout(variableCalculation);
        variableCalculation.setLayout(variableCalculationLayout);
        variableCalculationLayout.setHorizontalGroup(
            variableCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(variableCalculationLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(variableCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(variableCalculationLayout.createSequentialGroup()
                        .addGroup(variableCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(variableCalculationLayout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(variableCalculationLayout.createSequentialGroup()
                                .addGap(317, 317, 317)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, variableCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(variableCalculationLayout.createSequentialGroup()
                            .addGroup(variableCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane23)
                                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(variableCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        variableCalculationLayout.setVerticalGroup(
            variableCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(variableCalculationLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(variableCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(variableCalculationLayout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        subCard.add(variableCalculation, "variableCalculation");

        selectionButtonGruop.add(size);
        size.setText("Due To Size");
        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });

        selectionButtonGruop.add(method);
        method.setText("Due To Method");
        method.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                methodMouseClicked(evt);
            }
        });
        method.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                methodActionPerformed(evt);
            }
        });

        selectionButtonGruop.add(variable);
        variable.setText("Due To Variable");
        variable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout threeInOneLayout = new javax.swing.GroupLayout(threeInOne);
        threeInOne.setLayout(threeInOneLayout);
        threeInOneLayout.setHorizontalGroup(
            threeInOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(threeInOneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtnviewcs4)
                .addGap(180, 180, 180)
                .addComponent(size)
                .addGap(93, 93, 93)
                .addComponent(method)
                .addGap(74, 74, 74)
                .addComponent(variable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        threeInOneLayout.setVerticalGroup(
            threeInOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, threeInOneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(threeInOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backbtnviewcs4)
                    .addGroup(threeInOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(size)
                        .addComponent(method)
                        .addComponent(variable)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subCard, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        card.add(threeInOne, "threeInOne");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(card, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(716, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(card, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choosetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choosetxtActionPerformed
public static File f;
    private void choosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosebtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        choosetxt.setText(filename);
    }//GEN-LAST:event_choosebtnActionPerformed

    private void uploadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbtnActionPerformed
                cardLayout.show(card, "functions");
    }//GEN-LAST:event_uploadbtnActionPerformed

    private void inheritancebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inheritancebtnActionPerformed
        String data = "<html>Complexity of a program statement with a Inheritance is computed as follows: <br><br>"
        + "<b>Ccs = Inheritance complexity of a program statement of a class (Ci) = Weight assigned for that class due to its inheritance pattern(</b> <br><br> </html>";
        
        int t = JOptionPane.showConfirmDialog(null, data,  "Code Complexity due to Inheritance", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if(t == 0){
            cardLayout.show(card, "inheritanceCalculation");
        }
    }//GEN-LAST:event_inheritancebtnActionPerformed

    private void couplingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couplingbtnActionPerformed
        String data = "<html>Complexity of a program statement with a coupling is computed as follows: <br><br>"
        + "<b>Ccp = (Wr * Nr) + (Wmcms * Nmcms) + (Wmcmd * Nmcmd) + (Wmcrms * Nmcrms) + (Wmcrmd * Nmcrmd) + <br> (Wrmcrms * Nrmcrms) + (Wrmcrmd *Nrmcrmd) + (Wrmcms * Nrmcms) + (Wrmcmd * Nrmcmd) +  (Wmrgvs *Nmrgvs) +<br> (Wmrgvd * Nmrgvd) + (Wrmrgvs * Nrmrgvs) + (Wrmrgvd * Nrmrgvd) </b> <br><br>"
        +"Wr = Weight of a recursive call<br>"
        +"Nr = Number of recursive calls<br>"
        +"Wmcms = Weight of a regular method calling another regular method in the same file<br>"
        +"Nmcms = Number of calls from regular method(s) to other regular methods in the same file<br>"
        +"Wmcmd = Weight of a regular method calling another regular method in a different file<br>"
        +"Nmcmd = Number of calls from regular method(s) to other regular methods in different files<br>"
        +"Wmcrms = Weight of a regular method calling a recursive method in the same file<br>"
        +"Nmcrms = Number of calls from regular method(s) to recursive methods in the same file<br>"
        +"Wmcrmd = Weight of a regular method calling a recursive method in a different filem<br>"
        +"Nmcrmd = Number of calls from regular method(s) to recursive methods in different files<br>"
        +"Wrmcrms = Weight of a recursive method calling another recursive method in the same file<br>"
        +"Nrmcrms = Number of calls from recursive method(s) to other recursive methods in the same file<br>"
        +"Wrmcrmd = Weight of a recursive method calling another recursive method in a different file<br>"
        +"Nrmcrmd = Number of calls from recursive method(s) to other recursive methods in different files<br>"
        +"Wrmcms = Weight of a recursive method calling a regular method in the same file<br>"
        +"Nrmcms = Number of calls from recursive method(s) to regular methods in the same file<br>"
        +"Wrmcmd = Weight of a recursive method calling a regular method in a different file<br>"
        +"Nrmcmd = Number of calls from recursive method(s) to regular methods in different files<br>"
        +"Wmrgvs = Weight of a regular method referencing a global variable in the same file<br>"
        +"Nmrgvs = Number of references from regular method(s) to global variables in the same file<br>"
        +"Wmrgvd = Weight of a regular method referencing a global variable in a different file<br>"
        +"Nmrgvd = Number of references from regular method(s) to global variables in different files<br>"
        +"Wrmrgvs = Weight of a recursive method referencing a global variable in the same file<br>"
        +"Nrmrgvs = Number of references from recursive method(s) to global variables in the same file<br>"
        +"Wrmrgvd = Weight of a recursive method referencing a global variable in a different file<br>"
        +"Nrmrgvd = Number of references from recursive method(s) to global variable in different files</html>";

        int t = JOptionPane.showConfirmDialog(null, data,  "Code Complexity due to Coupling", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if(t == 0){
            cardLayout.show(card, "couplingCalculation");
            couplingtotextarea();
        }
   
    }//GEN-LAST:event_couplingbtnActionPerformed

    private void csbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csbtnActionPerformed
        String data = "<html>Complexity of a program statement with a control structure is computed as follows: <br><br>"
        + "<b>Ccs = ( Wtcs * NC ) + Ccspps</b> <br><br>"
        + "Ccs   =  Complexity of a program statement with a control structure <br>"
        + "Wtcs   =  Weight due to control structure type <br>"
        + "NC =  Number of conditions in the control structure <br>"
        + "Ccspps = Control structure complexity of the previous program statement. Hence, always the value of <br>Ccspps would be zero for control structures which reside at the first nesting level or outer most nesting level.   </html>";
        
        
        int y = JOptionPane.showConfirmDialog(null, data, "Code Complexity due to Control Structure", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (y ==0){
            cardLayout.show(card, "controlStructureCalculation");
        }
        
        
    }//GEN-LAST:event_csbtnActionPerformed

    private void MultipleFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultipleFileActionPerformed
            cardLayout.show(card, "multiFileChooser");
    }//GEN-LAST:event_MultipleFileActionPerformed

    private void singleFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleFileActionPerformed
            cardLayout.show(card, "filechoose");
    }//GEN-LAST:event_singleFileActionPerformed

    private void choosebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosebtn1ActionPerformed
//        JFileChooser chooser = new JFileChooser();
//        chooser.showOpenDialog(null);
//        f = chooser.getSelectedFile();
//        String filename = f.getAbsolutePath();
//        choosetxtarea.setText(filename);
    }//GEN-LAST:event_choosebtn1ActionPerformed

    private void uploadbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbtn1ActionPerformed
            cardLayout.show(card, "functions");
    }//GEN-LAST:event_uploadbtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            jTable1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void backbtnfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnfileActionPerformed
        cardLayout.show(card, "selection");
    }//GEN-LAST:event_backbtnfileActionPerformed

    private void backbtnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnmultiActionPerformed
        cardLayout.show(card, "selection");
    }//GEN-LAST:event_backbtnmultiActionPerformed

    private void backbtnfunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnfunctionActionPerformed
        cardLayout.show(card, "selection");
    }//GEN-LAST:event_backbtnfunctionActionPerformed

    private void overallbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overallbtnActionPerformed
        String data = "<html>Total complexity of a program statement (TCps) is computed as follows: <br><br>"
        + "<b>TCps = Cs + Cv + Cm + Ci + Ccp + Ccs</b> <br><br>"
        + "TCps = Total complexity of a program due to all factors <br>"
        + "Cs = Complexity of a program statement with a size <br>"
        + "Cv = Complexity of a program statement with a variable <br>"
        + "Cm = Complexity of a program statement with a method <br>"
        + "Ci = Complexity of a program statement with a inheritance <br>"
        + "Ccp = Complexity of a program statement with a coupling <br>"
        + "Ccs = Complexity of a program statement with a control structure  </html>";
        
        int t = JOptionPane.showConfirmDialog(null, data,  "Overall Code Complexity", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if(t == 0){
            cardLayout.show(card, "viewoverall");
        }
                
    }//GEN-LAST:event_overallbtnActionPerformed

    private void sizebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizebtnActionPerformed
        String data = "<html>Complexity of a program statement with a control structure is computed as follows: <br><br>"
        
        +"CS   = Complexity of a program statement due to its size <br>"
        +"Wkw  = Weight due to keywords or reserved words (class, public, void, true, else, default, return, null, break, this, etc.)<br>"
        +" Nkw = Number of keywords or reserved words in the program statement<br>" 
        +"Wid = Weight due to identifiers (names of classes, methods, objects, variables, arguments, and data structures) <br>" 
        +"Nid = Number of identifiers in the program statement<br>" 
        +"Wop = Weight due to operators <br>"
        +"Nop = Number of operators in the program statement<br>" 
        +"Wnv = Weight due to numerical values or numbers <br>"
        +"Nnv = Number of numerical values in the program statement<br>" 
        +"Wsl= Weight due to string literals (“ ” ,“Hi”, “Hello World”, “The factorial value of the entered number is”)<br>"
        +"Nsl = Number of string literals in the program statement </html>";

        int t = JOptionPane.showConfirmDialog(null, data,  "Overall Code Complexity", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if(t == 0){
            cardLayout.show(card, "threeInOne");
            size.doClick();
        }
        
    }//GEN-LAST:event_sizebtnActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void backbtnviewcsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnviewcsActionPerformed
        cardLayout.show(card, "functions");
    }//GEN-LAST:event_backbtnviewcsActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        cardLayout.show(card,"finalDueAllFactor");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void backbtnoverallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnoverallActionPerformed
        cardLayout.show(card, "functions");
    }//GEN-LAST:event_backbtnoverallActionPerformed

    private void viewcombobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcombobox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewcombobox1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        cardLayout.show(card, "controlStuctureFinal");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void backbtnviewcs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnviewcs1ActionPerformed
        cardLayout.show(card, "functions");
    }//GEN-LAST:event_backbtnviewcs1ActionPerformed

    private void backbtnviewcs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnviewcs2ActionPerformed
      cardLayout.show(card, "functions");
    }//GEN-LAST:event_backbtnviewcs2ActionPerformed

    private void backbtnviewcs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnviewcs3ActionPerformed
        cardLayout.show(card, "functions");
    }//GEN-LAST:event_backbtnviewcs3ActionPerformed

    private void backbtnviewcs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnviewcs4ActionPerformed
        cardLayout.show(card, "functions");
    }//GEN-LAST:event_backbtnviewcs4ActionPerformed

    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
       cardLayout1.show(subCard, "sizeCalculation");
    }//GEN-LAST:event_sizeActionPerformed

    private void methodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_methodActionPerformed
      cardLayout1.show(subCard, "methodCalculation");
    }//GEN-LAST:event_methodActionPerformed

    private void variableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variableActionPerformed
       cardLayout1.show(subCard, "variableCalculation");
    }//GEN-LAST:event_variableActionPerformed

    private void methodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_methodMouseClicked
      
    }//GEN-LAST:event_methodMouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       cardLayout.show(card, "couplingFinal");
    jTable1.getTableHeader().setBackground(Color.LIGHT_GRAY);
     //get current weight
    DefaultTableModel tb = (DefaultTableModel)jTable10.getModel();  
    int a1 = Integer.parseInt(tb.getValueAt(0, 1).toString());
    int b2 = Integer.parseInt(tb.getValueAt(1, 1).toString());
    int c3 = Integer.parseInt(tb.getValueAt(2, 1).toString());
    int d4 = Integer.parseInt(tb.getValueAt(3, 1).toString());
    int e5 = Integer.parseInt(tb.getValueAt(4, 1).toString());
    int f6 = Integer.parseInt(tb.getValueAt(5, 1).toString());
    
     
  
 
       
      //set new font for jtable 
      jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
      //Calling all method in coupling package
      //recursive call
         try {
            Recurtion.recursion();
             System.out.println("recursive call");
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        // regular method calling another regular method in the same file
        try {
            RegrCallReg_same_file.collectMethods();
            System.out.println(" regular method calling another regular method in the same file");
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            RegrCallReg_same_file.storeReRegMethods();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
            RegrCallReg_same_file.searchForMethods();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
            codeLines.readLines();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         //regular method calling a recursive method in the same file
         try {
            
           RegCallRec_same_file.collectMethods1();
             System.out.println("regular method calling a recursive method in the same file");
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            RegCallRec_same_file.storeReRegMethods1();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            RegCallRec_same_file.searchForMethods1();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //recursive method calling another recursive method in the same file
         try {
            
            RecCallRec_same_file.collectRecursiveMethods();
             System.out.println("recursive method calling another recursive method in the same file");
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           RecCallRec_same_file.searchForRecursiveInSameFile();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //recursive method calling a regular method in the same file
         try {
            RecCallReg_same_file.collectMethods();
             System.out.println("recursive method calling a regular method in the same file");
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            RecCallReg_same_file.storeReRegMethods();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
            RecCallReg_same_file.recursion();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         //regular method referencing a global variable in the same file
         try {
            RegCallGlobal_same_file.collectGloabalVaribales();
             System.out.println("regular method referencing a global variable in the same file");
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            RegCallGlobal_same_file.collectMethods();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
            RegCallGlobal_same_file.storeReRegMethods();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
            RegCallGlobal_same_file.searchForMethods();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
         
         
        //1
        ArrayList<Integer> regularCallregular;
        regularCallregular = RegrCallReg_same_file.countList;
        //2
        ArrayList<Integer> recursiveL;
        recursiveL = Recurtion.countList1;
        //3
        ArrayList<Integer> regularCallrecrsive;
        regularCallrecrsive = RegCallRec_same_file.countList2;
        //4
         ArrayList<Integer> recursiveCallrecursive;
        recursiveCallrecursive = RecCallRec_same_file.countList3;
        //5
        ArrayList<Integer> recursiveCallregular;
        recursiveCallregular = RecCallReg_same_file.countList4;
        //6
        ArrayList<Integer> regularCallglobal;
        regularCallglobal = RegCallGlobal_same_file.countList5;
        
        //Uploaded sourse code 
        ArrayList<String> programe_statement;
        programe_statement = codeLines.linesList;
       
        
       DefaultTableModel dtm1 = (DefaultTableModel)jTable1.getModel();

      
        Object rowData[] = new Object[16];
        for( int i = 0; i < programe_statement.size(); i++){
            
            rowData[0]=i+1;
            rowData[1] = programe_statement.get(i);
            rowData[2] = recursiveL.get(i);
            rowData[3] = regularCallregular.get(i);
            rowData[4] = regularCallrecrsive.get(i);
            rowData[5] = recursiveCallrecursive.get(i);
            rowData[6] = recursiveCallregular.get(i);
            rowData[7] = regularCallglobal.get(i);
            //calculate cpp value
            rowData[14] =(recursiveL.get(i)*a1 + regularCallregular.get(i)*b2 + regularCallrecrsive.get(i)*c3 + recursiveCallrecursive.get(i)*d4 + recursiveCallregular.get(i)*e5 + regularCallglobal.get(i)*f6);
           
            dtm1.addRow(rowData);
        }
        
        Integer count;
        Integer count10;
        Integer count11;
        Integer count12;
        Integer count13;
        Integer count14;
        
        count = Recurtion.recursiveCount;
        count10 = RegrCallReg_same_file.RegCallRegCount;
        count11 = RegCallRec_same_file.RegCallRecCount;
        count12 = RecCallRec_same_file.RecCallRecCount;
        count13 = RecCallReg_same_file.RecCallRegCount;
        count14 = RegCallGlobal_same_file.RegCallGlobalCount;
        
        int total_count = count*a1 + count10*b2 + count11*c3 + count12*d4 + count13*e5 + count14*f6;
         String total=Integer.toString(total_count);
         tot.setText(total);
        
       
//        dtm.addColumn("Line No");
//        dtm.addColumn("Class Name",programe_statement.toArray());
//        dtm.addColumn("Nr",recursiveL.toArray());
//        dtm.addColumn("Nmcms",regularCallregular.toArray());
//	dtm.addColumn("Nmcrms",regularCallrecrsive.toArray());
//	dtm.addColumn("Nrmcrms",recursiveCallrecursive.toArray());
//	dtm.addColumn("Nrmcms",recursiveCallregular.toArray());
//	dtm.addColumn("Nmrgvs",regularCallglobal.toArray());
//	dtm.addColumn("Nrmrgvs");
//	dtm.addColumn("Ccp");
//        dtm.addRow(rowData);
//        
//        
//        
//        
//        for(int t=0;t<jTable1.getColumnCount();t++){
//        
//            for(int r=0;r<jTable1.getRowCount();r++){
//            
//                
//                
//            
//            
//            }
//        }
    
 
       
       
       
       
       
       
       
       
       
       
       
       
       
       //////////////////
       
       
       
       
       
       
       
       
       
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        cardLayout.show(card, "inheritanceFinal");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        cardLayout.show(card, "sizeFinal");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        cardLayout.show(card, "methodFinal");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
       cardLayout.show(card, "variableFinal");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void backbtnfunction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnfunction1ActionPerformed
        cardLayout.show(card, "couplingCalculation");
    }//GEN-LAST:event_backbtnfunction1ActionPerformed

    private void backbtnfunction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnfunction2ActionPerformed
           cardLayout.show(card, "threeInOne");
    }//GEN-LAST:event_backbtnfunction2ActionPerformed

    private void backbtnfunction3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnfunction3ActionPerformed
        cardLayout.show(card, "inheritanceCalculation");
    }//GEN-LAST:event_backbtnfunction3ActionPerformed

    private void backbtnfunction4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnfunction4ActionPerformed
       cardLayout.show(card, "viewoverall");
    }//GEN-LAST:event_backbtnfunction4ActionPerformed

    private void backbtnfunction5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnfunction5ActionPerformed
        cardLayout.show(card, "controlStructureCalculation");
    }//GEN-LAST:event_backbtnfunction5ActionPerformed

    private void backbtnfunction6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnfunction6ActionPerformed
        cardLayout.show(card, "threeInOne");
    }//GEN-LAST:event_backbtnfunction6ActionPerformed

    private void backbtnfunction7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnfunction7ActionPerformed
       cardLayout.show(card, "threeInOne");
    }//GEN-LAST:event_backbtnfunction7ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void totActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totActionPerformed

   
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlStructureFinal;
    private javax.swing.JPanel CouplingFinal;
    private javax.swing.JPanel FinalDueToAllFactor;
    private javax.swing.JPanel InheritanceFinal;
    private javax.swing.JPanel MethodFinal;
    private javax.swing.JButton MultipleFile;
    private javax.swing.JPanel SizeFinal;
    private javax.swing.JPanel VariablesFinal;
    private javax.swing.JButton backbtnfile;
    private javax.swing.JButton backbtnfunction;
    private javax.swing.JButton backbtnfunction1;
    private javax.swing.JButton backbtnfunction2;
    private javax.swing.JButton backbtnfunction3;
    private javax.swing.JButton backbtnfunction4;
    private javax.swing.JButton backbtnfunction5;
    private javax.swing.JButton backbtnfunction6;
    private javax.swing.JButton backbtnfunction7;
    private javax.swing.JButton backbtnmulti;
    private javax.swing.JButton backbtnoverall;
    private javax.swing.JButton backbtnviewcs;
    private javax.swing.JButton backbtnviewcs1;
    private javax.swing.JButton backbtnviewcs2;
    private javax.swing.JButton backbtnviewcs3;
    private javax.swing.JButton backbtnviewcs4;
    private javax.swing.JPanel card;
    private javax.swing.JButton choosebtn;
    private javax.swing.JButton choosebtn1;
    private javax.swing.JTextField choosetxt;
    private javax.swing.JTextArea choosetxtarea;
    private javax.swing.JPanel controlStructureCalculation;
    private javax.swing.JPanel couplingCalculation;
    private javax.swing.JButton couplingbtn;
    private javax.swing.JButton csbtn;
    private javax.swing.JPanel filechoose;
    private javax.swing.JPanel functions;
    private javax.swing.JPanel inheritanceCalculation;
    private javax.swing.JButton inheritancebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton method;
    private javax.swing.JPanel methodCalculation;
    private javax.swing.JPanel multiFileChooser;
    private javax.swing.JLabel notyfy;
    private javax.swing.JButton overallbtn;
    private javax.swing.JPanel selection;
    private javax.swing.ButtonGroup selectionButtonGruop;
    private javax.swing.JButton singleFile;
    private javax.swing.JRadioButton size;
    private javax.swing.JPanel sizeCalculation;
    private javax.swing.JButton sizebtn;
    private javax.swing.JPanel subCard;
    private javax.swing.JPanel threeInOne;
    private javax.swing.JTextField tot;
    private javax.swing.JButton uploadbtn;
    private javax.swing.JButton uploadbtn1;
    private javax.swing.JRadioButton variable;
    private javax.swing.JPanel variableCalculation;
    private javax.swing.JComboBox<String> viewcombobox1;
    private javax.swing.JComboBox<String> viewcombobox2;
    private javax.swing.JPanel viewcs;
    private javax.swing.JPanel viewoverall;
    // End of variables declaration//GEN-END:variables
}
