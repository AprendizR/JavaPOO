package guanabara.lutas;
public class Lutas {

    public static void main(String[] args) {
        Lutadores l[] = new Lutadores [6];
        l[0] = new Lutadores("Renan","Brazil", 24, 1.84f, 82f, 0, 0, 0 );
        l[1] = new Lutadores("Caixa", "Alemanha", 36, 2.01f, 110f, 0, 0, 0);
        l[2] = new Lutadores("Fausto", "Russo", 18, 1.67f, 70f, 0, 0, 0);
        l[3] = new Lutadores("Matador", "Estados Unidos", 28, 1.70f, 75f, 0, 0, 0);
        l[4] = new Lutadores("Felipe", "Brazil", 33, 1.94f, 101f, 0, 0, 0);
        l[5] = new Lutadores("Anderson", "Brazil", 21, 1.59f, 69f, 0, 0, 0);
        
        Luta UFC = new Luta();
        UFC.marcarLuta(l[1], l[4]);
        UFC.Lutar();
                       
    }
}
