package guanabara.projetopessoas;
public class Aluno extends Pessoa {
    //atributos
    private int mat;
    private String curso;
    
    //metodos
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada.");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
        
}
