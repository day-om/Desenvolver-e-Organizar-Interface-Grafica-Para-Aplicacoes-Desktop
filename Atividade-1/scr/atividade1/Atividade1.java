
package atividade1;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Atividade1 {

    
    public static void main(String[] args) {
        
       JFrame janela = new JFrame();
       
       janela.setSize(500,300);
       janela.setTitle("MVP");
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       janela.setLayout(new FlowLayout());
       
       JLabel texto1 = new JLabel();
       texto1.setText("Digite o valor da venda: ");
       janela.add(texto1);
       
       JTextField valor = new JTextField(10);
       janela.add(valor);
       
       JButton botao = new JButton();
       botao.setText("Enviar");
       janela.add(botao);
       
       botao.addActionListener(new AcaoBotao(valor));
      
       
       janela.setVisible(true);
       
       
       
        
       
       
       
       
      
        
        
    }
    
}
