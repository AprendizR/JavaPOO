package guanabara.polimorfismo;
public class Canguru extends Mamifero {
    public void usarBolsa(){
        System.out.println("Usando a bolsa");
    }
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
}
