package guanabara.lutas;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovado;
    
    //Metodos
    public void marcarLuta(Lutadores l1, Lutadores l2){
        if (l1.getCategoria().equals(l2.getCategoria())&& l1 != l2) {
            this.aprovado = true;
            this.desafiante = l1;
            this.desafiado = l2;            
        } else {
            this.aprovado = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    public void Lutar(){
        if (this.aprovado) {
            System.out.println("Desafiado");
            this.desafiado.apresentar();
            System.out.println("Desafiante");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: //empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //ganhou desafiado
                    System.out.println(this.desafiado.getNome() + " ganhou a luta");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();                    
                    break;
                case 2: //ganhou desafiante
                    System.out.println(this.desafiante.getNome() + " ganhou a luta");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
                        
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
    
    //Metodos especiais

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
