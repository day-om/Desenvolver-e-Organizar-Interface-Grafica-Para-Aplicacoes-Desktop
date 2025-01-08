/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Classes.Cadastro;
import Classes.ListaCadastros;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tela_cadastro extends javax.swing.JFrame {

    public ListaCadastros listaCadastros;
    
    public Tela_cadastro(ListaCadastros listaCadastros) {
        initComponents();
        this.listaCadastros = listaCadastros;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        recebe_nome = new javax.swing.JTextField();
        recebe_cpf = new javax.swing.JTextField();
        recebe_telefone = new javax.swing.JTextField();
        recebe_data = new javax.swing.JTextField();
        e_paciente = new javax.swing.JCheckBox();
        bt_cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cadastrar Consulta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("CPF:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setText("Telefone:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setText("Data:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel1.add(recebe_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 400, -1));
        jPanel1.add(recebe_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 400, -1));
        jPanel1.add(recebe_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 400, -1));
        jPanel1.add(recebe_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 400, -1));

        e_paciente.setText("Já é Paciente.");
        jPanel1.add(e_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed

        String nome = recebe_nome.getText();
        String cpf = recebe_cpf.getText();
        String telefone = recebe_telefone.getText();
        String data = recebe_data.getText();
        
        if (nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || data.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
        return;
        }
        if(!nome.matches("[a-zA-Z]+")){
        JOptionPane.showMessageDialog(null, "No campo (NOME) insira apenas letras!"); 
        return; 
        }
        if (!cpf.matches("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}")) { 
        JOptionPane.showMessageDialog(null, "Formato de CPF inválido. Use os pontos e traço corretamente.");
        return;
        }
        if (!telefone.matches("\\d{10,11}")) {
        JOptionPane.showMessageDialog(null, "Telefone inválido. Insira apenas números com DDD.");
        return;
        }
        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
        JOptionPane.showMessageDialog(null, "A data deve estar no formato DD/MM/AAAA.");
        return;
        }
       
        Cadastro cadastro = new Cadastro(nome,cpf,telefone,data);
        listaCadastros.Adicionar(cadastro);
        
       JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        
        recebe_nome.setText("");
        recebe_cpf.setText("");
        recebe_telefone.setText("");
        recebe_data.setText("");
        
        this.dispose();
    }//GEN-LAST:event_bt_cadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 DefaultTableModel tabela = new DefaultTableModel(
                        new Object[]{"Paciente", "Cpf", "Telefone", "Data", "Já era paciente?", "Consulta Realizada"},
                        0
                );

                ListaCadastros listaCadastros = new ListaCadastros(tabela);

                new Tela_cadastro(listaCadastros).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JCheckBox e_paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField recebe_cpf;
    private javax.swing.JTextField recebe_data;
    private javax.swing.JTextField recebe_nome;
    private javax.swing.JTextField recebe_telefone;
    // End of variables declaration//GEN-END:variables
}
