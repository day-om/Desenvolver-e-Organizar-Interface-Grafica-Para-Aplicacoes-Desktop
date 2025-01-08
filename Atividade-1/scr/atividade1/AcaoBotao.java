
package atividade1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

    class AcaoBotao implements ActionListener {
        
    private JTextField valor;
    
    public AcaoBotao(JTextField valor) {
    this.valor = valor;
}
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            double valorVenda = Double.parseDouble(valor.getText());
            
            if (valorVenda > 500){
                String descontoString = JOptionPane.showInputDialog(null, "Digite o percentual de desconto:");
                double  descontoDouble = Double.parseDouble(descontoString);
                
                double desconto = (descontoDouble / 100) * valorVenda;
                double valorFinal = valorVenda - desconto;
                
                 JOptionPane.showMessageDialog(null, "Esta venda recebeu um desconto de: R$" + desconto + "\n Valor final: R$ " + String.format("%.2f", valorFinal));
            }
            else{
                JOptionPane.showMessageDialog(null, "Esta venda não recebe desconto! \n O total a pagar é de: R$ " + valorVenda);
            }
            }
            catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
}
}
    }
