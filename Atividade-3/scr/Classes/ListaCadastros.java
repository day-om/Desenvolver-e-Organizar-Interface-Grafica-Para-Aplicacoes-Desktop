
package Classes;



import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;




public class ListaCadastros {
    
    private ArrayList<Cadastro> cadastros;
    private DefaultTableModel tabela;
    
    public ListaCadastros(DefaultTableModel tabela){
        this.cadastros = new ArrayList<>();
        this.tabela = tabela;
    }
    
    public void Adicionar (Cadastro cadastro){
        cadastros.add(cadastro); 
        tabela.addRow(new Object []{
            cadastro.getNome(),
            cadastro.getCpf(),
            cadastro.getTelefone(),
            cadastro.getData(),
            cadastro.isPaciente()?"Sim" : "Não",
            cadastro.isRealizada()? "Sim" : "Não" 
            });
        
    }
    
    public void Remover(int index){
        cadastros.remove(index);
    }
    
    public ArrayList<Cadastro> getCadastros(){
        return cadastros;
    }
    
    public DefaultTableModel getTabela(){
        return tabela;
    }
}
