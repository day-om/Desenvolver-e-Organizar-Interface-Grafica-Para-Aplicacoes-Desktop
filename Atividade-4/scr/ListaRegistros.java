
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ListaRegistros {
    private ArrayList<Registro> registros;
    private DefaultTableModel tabela;
    
    
    public ListaRegistros(DefaultTableModel tabela){
        this.registros = new ArrayList<>();
        this.tabela = tabela;
    }
    
    public void Adicionar (Registro registro){
        registros.add(registro); 
        tabela.addRow(new Object []{
            registro.getData(),
            registro.getHora(),
            registro.getPressaoS(),
            registro.getPressaoD(),
            registro.getEstresse()
            });
        
    }
    public ArrayList<Registro> getRegistro(){
        return registros;
    }
    
    public DefaultTableModel getTabela(){
        return tabela;
    }
    
}
