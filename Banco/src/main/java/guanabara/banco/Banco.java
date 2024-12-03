package guanabara.banco;
public class Banco {

    public static void main(String[] args) {
        contaBanco c1 = new contaBanco();
        c1.setNumConta(1111);
        c1.setDono("Renan");
        c1.abrirConta("CC");
        c1.sacar(30);
        c1.estadoAtual();
        
        contaBanco c2 = new contaBanco();
        c2.setNumConta(2222);
        c2.setDono("Felipe");
        c2.abrirConta("CP");
        c2.depositar(1500);
        c2.sacar(300);
        c2.estadoAtual();
        
    }
}
