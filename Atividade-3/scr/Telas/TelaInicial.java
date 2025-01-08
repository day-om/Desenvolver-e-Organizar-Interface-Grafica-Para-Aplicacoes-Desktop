
package Telas;

import Classes.Cadastro;
import Classes.ListaCadastros;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class TelaInicial extends javax.swing.JFrame {

    private DefaultTableModel tabela;
    public ListaCadastros listaCadastros;
    
    public TelaInicial() {
        initComponents();
        iniciartabela();
        listaCadastros = new ListaCadastros(tabela);
    }
    
    private void iniciartabela(){
        tabela = new DefaultTableModel(new Object[]{"Paciente", "Cpf", "Telefone", "Data", "Já era paciente?", "Consulta Realizada"},0);
        tabela_telaInicial.setModel(tabela);
    }
    
    public void finalizar(int index, Cadastro cadastro){
        listaCadastros.getCadastros().set(index, cadastro);
        tabela.setValueAt(cadastro.getNome(), index, 0);
        tabela.setValueAt(cadastro.getCpf(), index, 1);
        tabela.setValueAt(cadastro.getTelefone(), index, 2);
        tabela.setValueAt(cadastro.getData(), index, 3);
        tabela.setValueAt(cadastro.isPaciente()?"Sim" : "Não", index, 4);
        tabela.setValueAt(cadastro.isRealizada()? "Sim" : "Não", index, 5);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_novoCadastro = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_finalizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_telaInicial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Boas vindas ao Sistema de Agendamento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        bt_novoCadastro.setText("Novo Cadastro");
        bt_novoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(bt_novoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        bt_excluir.setText("Excluir Cadastro");
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });
        jPanel1.add(bt_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        bt_finalizar.setText("Finalizar");
        bt_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_finalizarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabela_telaInicial.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabela_telaInicial);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 500, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_novoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoCadastroActionPerformed
           Tela_cadastro cadastro = new Tela_cadastro(listaCadastros);
           cadastro.setVisible(true);
        
    }//GEN-LAST:event_bt_novoCadastroActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        int selecionada = tabela_telaInicial.getSelectedRow();
        if(selecionada != -1){
            listaCadastros.Remover(selecionada);
            tabela.removeRow(selecionada); 
        }else{
             JOptionPane.showMessageDialog(null, "Selecione o cadastro que deseja remover!");
        }
        
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_finalizarActionPerformed
        int selecionada= tabela_telaInicial.getSelectedRow();
        if(selecionada != -1){
            Cadastro cadastro = listaCadastros.getCadastros().get(selecionada);
            Tela_detalhes telaDetalhes = new Tela_detalhes(this,cadastro,selecionada);
            telaDetalhes.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Selecione o cadastro que deseja finalizar!");
        }
    }//GEN-LAST:event_bt_finalizarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_finalizar;
    private javax.swing.JButton bt_novoCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_telaInicial;
    // End of variables declaration//GEN-END:variables

    
}
