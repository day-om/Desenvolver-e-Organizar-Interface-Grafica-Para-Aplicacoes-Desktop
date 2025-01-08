
package Classes;


public class Cadastro {
    private String nome;
    private String cpf;
    private String telefone;
    private String data;
    private boolean paciente;
    private boolean realizada;
    private String receita_observacoes;
    
    public Cadastro(String nome,String cpf, String telefone, String data){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data = data;
        this.paciente = false;
        this.realizada = false;
       
        }

   
    public String getReceita_observacoes() {
        return receita_observacoes;
    }

    public void setReceita_observacoes(String receita_observacoes) {
        this.receita_observacoes = receita_observacoes;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isPaciente() {
        return paciente;
    }

    public void setPaciente(boolean paciente) {
        this.paciente = paciente;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    
    

    
    
    
}