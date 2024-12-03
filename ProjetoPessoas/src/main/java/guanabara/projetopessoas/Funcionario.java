package guanabara.projetopessoas;
public class Funcionario extends Pessoa {
    //atributos
    private String setor;
    private boolean trabalhando;
    
    //metodos
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
