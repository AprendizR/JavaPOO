package guanabara.lutas;
public class Lutadores {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
    //construtor

    public Lutadores(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe); //set porque atualizou pelo set e nao direto pelo atributo
        this.vitoria = vi;
        this.derrota = de;
        this.empate = em;
    }
        
    //metodos
    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitoria());
        System.out.println("Empatou: " + this.getEmpate());
        System.out.println("Perdeu: " + this.getDerrota());
    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("e um peso: " + this.getCategoria());
        System.out.println(this.getVitoria() + " vitorias");
        System.out.println(this.getEmpate() + " empates");
        System.out.println(this.getDerrota() + " derrotas");
    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";         
        }else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }else if (this.peso <=120.2 ){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vi) {
        this.vitoria = vi;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int de) {
        this.derrota = de;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int em) {
        this.empate = em;
    }
}