package guanabara.projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Renan");
        p2.setNome("Claudio");
        p3.setNome("Maria");
        p4.setNome("Renata");
        
        p1.setIdade(30);
        p2.setIdade(20);
        p3.setIdade(31);
        p4.setIdade(12);
        
        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("F");
        
        p2.setCurso("informatica");
        p3.setEspecialidade("tecnico de informatica");
        p4.setSetor("fiscalizacao");
        
                
        System.out.println(p3.getSalario());
        p3.receberAum(300f);
        System.out.println(p3.getSalario());
        
        
    }
}
