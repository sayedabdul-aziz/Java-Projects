/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_calc;

import jdk.nashorn.internal.ir.ContinueNode;

/**
 *
 * @author Dell
 */
public class My_Calculator extends javax.swing.JFrame {

    /**
     * Creates new form My_Calculator
     */
    public My_Calculator() {
        initComponents();
        TxtAll.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp32 = new javax.swing.JButton();
        jp33 = new javax.swing.JButton();
        jp34 = new javax.swing.JButton();
        jp35 = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        TxtAll = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        P_Zero = new javax.swing.JButton();
        P_Equ = new javax.swing.JButton();
        P_Dvi = new javax.swing.JButton();
        P_Po = new javax.swing.JButton();
        P2 = new javax.swing.JButton();
        P1 = new javax.swing.JButton();
        P_Multi = new javax.swing.JButton();
        P3 = new javax.swing.JButton();
        P5 = new javax.swing.JButton();
        P4 = new javax.swing.JButton();
        P_Sub = new javax.swing.JButton();
        P6 = new javax.swing.JButton();
        PClear = new javax.swing.JButton();
        P_Off = new javax.swing.JButton();
        ps = new javax.swing.JButton();
        P8 = new javax.swing.JButton();
        P7 = new javax.swing.JButton();
        P_Plas = new javax.swing.JButton();
        P9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jp32.setBackground(new java.awt.Color(153, 153, 153));
        jp32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jp32.setForeground(new java.awt.Color(255, 255, 255));
        jp32.setText("=");

        jp33.setBackground(new java.awt.Color(153, 153, 153));
        jp33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jp33.setForeground(new java.awt.Color(255, 255, 255));
        jp33.setText("=");

        jp34.setBackground(new java.awt.Color(153, 153, 153));
        jp34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jp34.setForeground(new java.awt.Color(255, 255, 255));
        jp34.setText("=");

        jp35.setBackground(new java.awt.Color(153, 153, 153));
        jp35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jp35.setForeground(new java.awt.Color(255, 255, 255));
        jp35.setText("=");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        TxtAll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtAll.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtAll.setText("0");
        TxtAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAllActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("French Script MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Designed by Sayed AbdUlaziz");

        P_Zero.setBackground(new java.awt.Color(204, 204, 204));
        P_Zero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P_Zero.setForeground(new java.awt.Color(0, 51, 153));
        P_Zero.setText("0");
        P_Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_ZeroActionPerformed(evt);
            }
        });

        P_Equ.setBackground(new java.awt.Color(204, 204, 204));
        P_Equ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P_Equ.setForeground(new java.awt.Color(0, 51, 153));
        P_Equ.setText("=");
        P_Equ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_EquActionPerformed(evt);
            }
        });

        P_Dvi.setBackground(new java.awt.Color(204, 204, 204));
        P_Dvi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P_Dvi.setForeground(new java.awt.Color(0, 51, 153));
        P_Dvi.setText("÷");
        P_Dvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_DviActionPerformed(evt);
            }
        });

        P_Po.setBackground(new java.awt.Color(204, 204, 204));
        P_Po.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P_Po.setForeground(new java.awt.Color(0, 51, 153));
        P_Po.setText(".");
        P_Po.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_PoActionPerformed(evt);
            }
        });

        P2.setBackground(new java.awt.Color(204, 204, 204));
        P2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P2.setForeground(new java.awt.Color(0, 51, 153));
        P2.setText("2");
        P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2ActionPerformed(evt);
            }
        });

        P1.setBackground(new java.awt.Color(204, 204, 204));
        P1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P1.setForeground(new java.awt.Color(0, 51, 153));
        P1.setText("1");
        P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ActionPerformed(evt);
            }
        });

        P_Multi.setBackground(new java.awt.Color(204, 204, 204));
        P_Multi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P_Multi.setForeground(new java.awt.Color(0, 51, 153));
        P_Multi.setText("x");
        P_Multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_MultiActionPerformed(evt);
            }
        });

        P3.setBackground(new java.awt.Color(204, 204, 204));
        P3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P3.setForeground(new java.awt.Color(0, 51, 153));
        P3.setText("3");
        P3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3ActionPerformed(evt);
            }
        });

        P5.setBackground(new java.awt.Color(204, 204, 204));
        P5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P5.setForeground(new java.awt.Color(0, 51, 153));
        P5.setText("5");
        P5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P5ActionPerformed(evt);
            }
        });

        P4.setBackground(new java.awt.Color(204, 204, 204));
        P4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P4.setForeground(new java.awt.Color(0, 51, 153));
        P4.setText("4");
        P4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4ActionPerformed(evt);
            }
        });

        P_Sub.setBackground(new java.awt.Color(204, 204, 204));
        P_Sub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P_Sub.setForeground(new java.awt.Color(0, 51, 153));
        P_Sub.setText("-");
        P_Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_SubActionPerformed(evt);
            }
        });

        P6.setBackground(new java.awt.Color(204, 204, 204));
        P6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P6.setForeground(new java.awt.Color(0, 51, 153));
        P6.setText("6");
        P6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P6ActionPerformed(evt);
            }
        });

        PClear.setBackground(new java.awt.Color(204, 204, 204));
        PClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PClear.setForeground(new java.awt.Color(0, 51, 153));
        PClear.setText("Clear");
        PClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PClearActionPerformed(evt);
            }
        });

        P_Off.setBackground(new java.awt.Color(255, 0, 51));
        P_Off.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        P_Off.setForeground(new java.awt.Color(255, 255, 255));
        P_Off.setText("Off");
        P_Off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_OffActionPerformed(evt);
            }
        });

        ps.setBackground(new java.awt.Color(204, 204, 204));
        ps.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ps.setForeground(new java.awt.Color(0, 51, 153));
        ps.setText("+/-");
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });

        P8.setBackground(new java.awt.Color(204, 204, 204));
        P8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P8.setForeground(new java.awt.Color(0, 51, 153));
        P8.setText("8");
        P8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P8ActionPerformed(evt);
            }
        });

        P7.setBackground(new java.awt.Color(204, 204, 204));
        P7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P7.setForeground(new java.awt.Color(0, 51, 153));
        P7.setText("7");
        P7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P7ActionPerformed(evt);
            }
        });

        P_Plas.setBackground(new java.awt.Color(204, 204, 204));
        P_Plas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P_Plas.setForeground(new java.awt.Color(0, 51, 153));
        P_Plas.setText("+");
        P_Plas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_PlasActionPerformed(evt);
            }
        });

        P9.setBackground(new java.awt.Color(204, 204, 204));
        P9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P9.setForeground(new java.awt.Color(0, 51, 153));
        P9.setText("9");
        P9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Simple Calculator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(89, 89, 89))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(P_Equ, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P_Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P_Po, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ps, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(P_Dvi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P_Multi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P_Sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P_Plas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(TxtAll, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(P_Off, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(TxtAll, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ps, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Off, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Plas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(P_Dvi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Po, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Equ, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAllActionPerformed
       
            
        
    }//GEN-LAST:event_TxtAllActionPerformed

    private void P_EquActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_EquActionPerformed
     try{
       num2 = Double.parseDouble(TxtAll.getText());
       switch(ope){
           case '+':
               result = num1 + num2 ;    break;
           case '-':
               result = num1 - num2 ;    break;
           case '*':
               result = num1 * num2 ;    break;
           case '/':
               result = num1 / num2 ;    break;

       }
        TxtAll.setText(String.format("%.0f", result));
     }catch(Exception e){
        TxtAll.setText("Syntax Error ..!");
     }
        
    }//GEN-LAST:event_P_EquActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void P_OffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_OffActionPerformed
        System.exit(0);
    }//GEN-LAST:event_P_OffActionPerformed
     private void setAll(String s){
        if(TxtAll.getText().equals("0")){
          TxtAll.setText("");
        }
         String st = TxtAll.getText() + s;
         TxtAll.setText(st);
     }
    private void P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ActionPerformed
        setAll("1");
    }//GEN-LAST:event_P1ActionPerformed

    private void P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2ActionPerformed
         setAll("2");
    }//GEN-LAST:event_P2ActionPerformed

    private void P3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3ActionPerformed
         setAll("3");
    }//GEN-LAST:event_P3ActionPerformed

    private void P4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4ActionPerformed
         setAll("4");
    }//GEN-LAST:event_P4ActionPerformed

    private void P5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P5ActionPerformed
          setAll("5");
    }//GEN-LAST:event_P5ActionPerformed

    private void P6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P6ActionPerformed
          setAll("6");
    }//GEN-LAST:event_P6ActionPerformed

    private void P7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P7ActionPerformed
          setAll("7");
    }//GEN-LAST:event_P7ActionPerformed

    private void P8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P8ActionPerformed
          setAll("8");
    }//GEN-LAST:event_P8ActionPerformed

    private void P9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P9ActionPerformed
          setAll("9");
    }//GEN-LAST:event_P9ActionPerformed

    private void P_PoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_PoActionPerformed
          setAll(".");
    }//GEN-LAST:event_P_PoActionPerformed

    private void P_ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_ZeroActionPerformed
          setAll("0");
    }//GEN-LAST:event_P_ZeroActionPerformed

    private void PClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PClearActionPerformed
       TxtAll.setText("");
    }//GEN-LAST:event_PClearActionPerformed
     double num1;
     double num2;
     double result;
     char ope;
    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        if(!TxtAll.getText().equals("")){
        double num = Double.parseDouble(TxtAll.getText());
        num *= (-1);
        TxtAll.setText(String.valueOf(num));
         }
    }//GEN-LAST:event_psActionPerformed
      private void ope(char oper){
             num1 = Double.parseDouble(TxtAll.getText());
             TxtAll.setText("");
             ope = oper;
         
         }
             
    private void P_PlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_PlasActionPerformed
       if(!TxtAll.getText().equals("")){
        ope('+');
       }
    }//GEN-LAST:event_P_PlasActionPerformed

    private void P_SubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_SubActionPerformed
       if(!TxtAll.getText().equals("")){
        ope('-');
       }
    }//GEN-LAST:event_P_SubActionPerformed

    private void P_MultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_MultiActionPerformed
        if(!TxtAll.getText().equals("")){
        ope('*');
       }
    }//GEN-LAST:event_P_MultiActionPerformed

    private void P_DviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_DviActionPerformed
       if(!TxtAll.getText().equals("")){
        ope('/');
       }
    }//GEN-LAST:event_P_DviActionPerformed

    
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
            java.util.logging.Logger.getLogger(My_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(My_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(My_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(My_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new My_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton P1;
    private javax.swing.JButton P2;
    private javax.swing.JButton P3;
    private javax.swing.JButton P4;
    private javax.swing.JButton P5;
    private javax.swing.JButton P6;
    private javax.swing.JButton P7;
    private javax.swing.JButton P8;
    private javax.swing.JButton P9;
    private javax.swing.JButton PClear;
    private javax.swing.JButton P_Dvi;
    private javax.swing.JButton P_Equ;
    private javax.swing.JButton P_Multi;
    private javax.swing.JButton P_Off;
    private javax.swing.JButton P_Plas;
    private javax.swing.JButton P_Po;
    private javax.swing.JButton P_Sub;
    private javax.swing.JButton P_Zero;
    private javax.swing.JTextField TxtAll;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton jp32;
    private javax.swing.JButton jp33;
    private javax.swing.JButton jp34;
    private javax.swing.JButton jp35;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JButton ps;
    // End of variables declaration//GEN-END:variables
}