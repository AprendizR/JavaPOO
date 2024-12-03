package guanabara.biblioteca;
public class Biblioteca {

    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro[] l = new Livro [3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Aprendendo java", "Guanabara", 300, p[0]);
        l[1] = new Livro("Constelacao", "Renan", 235, p[1]);
        l[2] = new Livro("Acordo", "Joao Cleber", 131, p[1]);
        
        
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
    }
}
