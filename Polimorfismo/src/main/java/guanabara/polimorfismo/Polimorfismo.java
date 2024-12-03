package guanabara.polimorfismo;
public class Polimorfismo {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Cachorro c = new Cachorro();
        
        //sobreposicao
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        //sobrecarga
        c.reagir("Ola");
    }
}
