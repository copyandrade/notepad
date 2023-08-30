package textEditor;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class TelaMain extends javax.swing.JFrame {

    private boolean verifySave = false;
    private boolean verifyMode = false;
    private String path;
    private String nameFile;
    private String newFile;
    
    public TelaMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        panelMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMain = new javax.swing.JTextArea();
        labelCaracteres = new javax.swing.JLabel();
        btnNewFile = new javax.swing.JButton();
        btnSaveFile = new javax.swing.JButton();
        labelFont = new javax.swing.JLabel();
        comboFont = new javax.swing.JComboBox<>();
        labelFontSize = new javax.swing.JLabel();
        SpinnerFontSize = new javax.swing.JSpinner();
        btnTextColor = new javax.swing.JButton();
        btnDarkMode = new javax.swing.JButton();
        jComboBoxCase = new javax.swing.JComboBox<>();
        jComboBoxStyles = new javax.swing.JComboBox<>();
        menuMain = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenu();
        menuFile1 = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notepad");

        panelMain.setBackground(new java.awt.Color(204, 204, 204));

        txtMain.setColumns(20);
        txtMain.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtMain.setLineWrap(true);
        txtMain.setRows(5);
        txtMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMainKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtMain);

        labelCaracteres.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        labelCaracteres.setText("Caracteres: ");

        btnNewFile.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        btnNewFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/page_add.png"))); // NOI18N
        btnNewFile.setText("New File");
        btnNewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewFileActionPerformed(evt);
            }
        });

        btnSaveFile.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        btnSaveFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bullet_disk.png"))); // NOI18N
        btnSaveFile.setText("Save File");
        btnSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFileActionPerformed(evt);
            }
        });

        labelFont.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        labelFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/font.png"))); // NOI18N
        labelFont.setText("Font ");

        comboFont.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        comboFont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JetBrains Mono", "Arial", "Cambria", "Dialog" }));
        comboFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFontActionPerformed(evt);
            }
        });

        labelFontSize.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        labelFontSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/font_add.png"))); // NOI18N
        labelFontSize.setText("Font Size");

        SpinnerFontSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerFontSizeStateChanged(evt);
            }
        });

        btnTextColor.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        btnTextColor.setText("Text Color");
        btnTextColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTextColorActionPerformed(evt);
            }
        });

        btnDarkMode.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        btnDarkMode.setText("Dark Mode");
        btnDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarkModeActionPerformed(evt);
            }
        });

        jComboBoxCase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lower case", "Upper case" }));
        jComboBoxCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCaseActionPerformed(evt);
            }
        });

        jComboBoxStyles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Italic", "Bold" }));
        jComboBoxStyles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStylesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addComponent(btnDarkMode, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCase, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxStyles, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(btnNewFile, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSaveFile, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelFont, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboFont, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelFontSize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpinnerFontSize, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTextColor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewFile)
                    .addComponent(btnSaveFile)
                    .addComponent(labelFont)
                    .addComponent(comboFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFontSize)
                    .addComponent(SpinnerFontSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTextColor))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCaracteres)
                    .addComponent(btnDarkMode)
                    .addComponent(jComboBoxCase, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxStyles, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        menuFile.setText("File");
        menuMain.add(menuFile);

        menuAbout.setText("Edit");
        menuMain.add(menuAbout);

        menuFile1.setText("About");
        menuMain.add(menuFile1);

        setJMenuBar(menuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMainKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMainKeyReleased
        labelCaracteres.setText("Caracteres: " + txtMain.getText().length());
        SpinnerFontSize.setValue(txtMain.getFont().getSize());
    }//GEN-LAST:event_txtMainKeyReleased

    private void btnNewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewFileActionPerformed
        txtMain.setText(null);
        labelCaracteres.setText("Caracteres: 0");
    }//GEN-LAST:event_btnNewFileActionPerformed

    private void btnSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFileActionPerformed
        if (verifySave == false) {
            
            path = JOptionPane.showInputDialog("Enter where you want save your file: ");
            nameFile = JOptionPane.showInputDialog("Enter name File: ");
            newFile = path + "\\" + nameFile;
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
                bw.write(txtMain.getText());
                verifySave = true;
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } else {
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
                bw.write(txtMain.getText());
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSaveFileActionPerformed

    private void comboFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFontActionPerformed
        txtMain.setFont(new Font(comboFont.getSelectedItem().toString(),Font.PLAIN,txtMain.getFont().getSize()));
    }//GEN-LAST:event_comboFontActionPerformed

    private void SpinnerFontSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerFontSizeStateChanged
        String fontName = txtMain.getFont().getFontName();
        int fontStyle = txtMain.getFont().getStyle();
        txtMain.setFont(new Font(fontName,fontStyle,(int)SpinnerFontSize.getValue()));
    }//GEN-LAST:event_SpinnerFontSizeStateChanged

    private void btnTextColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTextColorActionPerformed
        JColorChooser colorChooser = new JColorChooser();
        Color color = JColorChooser.showDialog(null, "Pick a Color", Color.BLACK);
        txtMain.setForeground(color);
    }//GEN-LAST:event_btnTextColorActionPerformed

    private void btnDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkModeActionPerformed
        if (verifyMode == false) {
            txtMain.setBackground(Color.DARK_GRAY);
            txtMain.setForeground(Color.WHITE);
            panelMain.setBackground(Color.DARK_GRAY);
            labelFont.setForeground(Color.WHITE);
            labelFontSize.setForeground(Color.WHITE);
            btnDarkMode.setText("Light Mode");
            verifyMode = true;
        } else {
            txtMain.setBackground(Color.WHITE);
            txtMain.setForeground(Color.BLACK);
            panelMain.setBackground(Color.LIGHT_GRAY);
            labelFont.setForeground(Color.BLACK);
            labelFontSize.setForeground(Color.BLACK);
            btnDarkMode.setText("Dark Mode");
            verifyMode = false;
        }
    }//GEN-LAST:event_btnDarkModeActionPerformed

    private void jComboBoxCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCaseActionPerformed
        String a = jComboBoxCase.getSelectedItem().toString();
        
        if(a.equals("Upper case")){
            txtMain.setText(txtMain.getText().toUpperCase());
        }
        else{
            txtMain.setText(txtMain.getText().toLowerCase());
        }
    }//GEN-LAST:event_jComboBoxCaseActionPerformed

    private void jComboBoxStylesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStylesActionPerformed
        String a = jComboBoxStyles.getSelectedItem().toString();
        
        if(a.equals("Italic")){
            txtMain.setFont(new Font(comboFont.getSelectedItem().toString(),Font.ITALIC,txtMain.getFont().getSize()));
        }
        else{
            txtMain.setFont(new Font(comboFont.getSelectedItem().toString(),Font.BOLD,txtMain.getFont().getSize()));
        }
    }//GEN-LAST:event_jComboBoxStylesActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerFontSize;
    private javax.swing.JButton btnDarkMode;
    private javax.swing.JButton btnNewFile;
    private javax.swing.JButton btnSaveFile;
    private javax.swing.JButton btnTextColor;
    private javax.swing.JComboBox<String> comboFont;
    private javax.swing.JComboBox<String> jComboBoxCase;
    private javax.swing.JComboBox<String> jComboBoxStyles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelCaracteres;
    private javax.swing.JLabel labelFont;
    private javax.swing.JLabel labelFontSize;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuFile1;
    private javax.swing.JMenuBar menuMain;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextArea txtMain;
    // End of variables declaration//GEN-END:variables
}
