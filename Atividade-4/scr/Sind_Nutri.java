
import java.awt.List;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sind_Nutri extends javax.swing.JFrame {

    private DefaultTableModel tabela;
    public ListaRegistros listaRegistros;
    
    
    public Sind_Nutri() {
        initComponents();
        AtalhoAcessibilidade();
        iniciartabela();
        listaRegistros= new ListaRegistros(tabela);
    }
    
    public void AtalhoAcessibilidade(){
        bt_salvar.setMnemonic(KeyEvent.VK_S);
    }
    
    private void iniciartabela(){
        tabela = new DefaultTableModel(new Object[]{"Data", "Hora","Pressão sistólica","Pressão diastólica","Está em situação de estresse?"},0);
        tabela_tela.setModel(tabela);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        recebe_data = new javax.swing.JTextField();
        recebe_hora = new javax.swing.JTextField();
        recebe_pressaoS = new javax.swing.JTextField();
        recebe_pressaoD = new javax.swing.JTextField();
        bt_salvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_tela = new javax.swing.JTable();
        estresse_ = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de dados"));
        jPanel1.setToolTipText("Preencha os dados abaixo:");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setLabelFor(recebe_data);
        jLabel1.setText("Data");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setLabelFor(recebe_hora);
        jLabel2.setText("Hora");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setLabelFor(recebe_pressaoS);
        jLabel3.setText("Pressão sistólica");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setLabelFor(recebe_pressaoD);
        jLabel4.setText("Pressão diastólica");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        recebe_data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recebe_data.setToolTipText("Preencha com a data de hoje");
        recebe_data.setNextFocusableComponent(recebe_hora);
        jPanel1.add(recebe_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 150, -1));

        recebe_hora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recebe_hora.setToolTipText("Preencha com a hora de registro");
        recebe_hora.setNextFocusableComponent(recebe_pressaoS);
        jPanel1.add(recebe_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 150, -1));

        recebe_pressaoS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recebe_pressaoS.setToolTipText("Preencha com o valor registrado de pressão sistólica");
        recebe_pressaoS.setNextFocusableComponent(recebe_pressaoD);
        jPanel1.add(recebe_pressaoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 230, -1));

        recebe_pressaoD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recebe_pressaoD.setToolTipText("Preencha com o valor registrado de pressão diastólica");
        recebe_pressaoD.setNextFocusableComponent(estresse_);
        jPanel1.add(recebe_pressaoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 230, -1));

        bt_salvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_salvar.setText("Salvar");
        bt_salvar.setToolTipText("Clique para salvar os dados");
        bt_salvar.setNextFocusableComponent(recebe_data);
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabela_tela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabela_tela);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 600, 220));

        estresse_.setText("Está em situação de estresse?");
        estresse_.setToolTipText("Marque, caso esteja em situação de estresse.");
        estresse_.setNextFocusableComponent(bt_salvar);
        estresse_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estresse_ActionPerformed(evt);
            }
        });
        jPanel1.add(estresse_, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void estresse_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estresse_ActionPerformed
         
    }//GEN-LAST:event_estresse_ActionPerformed

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        
        String data = recebe_data.getText();
        String hora = recebe_hora.getText();
        String estresse;


        if (data.isEmpty() || hora.isEmpty() || recebe_pressaoS.getText().isEmpty() || recebe_pressaoD.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.");
        return;
        }
        
        int pressaoS, pressaoD;
        try {
            pressaoS = Integer.parseInt(recebe_pressaoS.getText());
            pressaoD = Integer.parseInt(recebe_pressaoD.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Pressão deve conter valores numéricos.");
                return;
            }
       
        
        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            JOptionPane.showMessageDialog(null, "A data deve estar no formato DD/MM/AAAA.");
            return;
        }
        if (!hora.matches("\\d{2}:\\d{2}")) {
             JOptionPane.showMessageDialog(null, "A hora deve estar no formato HH:mm.");
            return;
        }
              
        if(estresse_.isSelected()){
            estresse = "Sim";
        }else{
            estresse = "Não";
        }
               
        Registro registro = new Registro(data,hora,pressaoS,pressaoD,estresse);
        listaRegistros.Adicionar(registro);
               

        try {
                  FileWriter Writer = new FileWriter("C://Arquivos_TDS//Registros.txt");
                  Writer.write("Data: " + data + "\nHora: "+ hora + "\nPressão sistólica:" + pressaoS + 
                          "\nPressão diastólica:" + pressaoD + "\nEstresse: " + estresse);
                  Writer.close();
                                     
                   recebe_data.setText("");
                   recebe_hora.setText("");
                   recebe_pressaoS.setText("");
                   recebe_pressaoD.setText("");   
                   
                   tabela.fireTableDataChanged();
                   JOptionPane.showMessageDialog(null, "Registro realizado com sucesso!");
                
              }
              catch (IOException e) {
                  JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar!");
              } 
        
              
        
    }//GEN-LAST:event_bt_salvarActionPerformed
    
  
    
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
            java.util.logging.Logger.getLogger(Sind_Nutri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sind_Nutri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sind_Nutri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sind_Nutri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sind_Nutri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_salvar;
    private javax.swing.JCheckBox estresse_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField recebe_data;
    private javax.swing.JTextField recebe_hora;
    private javax.swing.JTextField recebe_pressaoD;
    private javax.swing.JTextField recebe_pressaoS;
    private javax.swing.JTable tabela_tela;
    // End of variables declaration//GEN-END:variables

   
}
