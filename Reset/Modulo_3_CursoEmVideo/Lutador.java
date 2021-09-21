package Modulo_3_CursoEmVideo;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Método contrutor:
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Métodos:
    public void apresentar () {
        System.out.println("Lutador " + getNome() +", vindo do(a)" + getNacionalidade() + ",com " + getIdade() + " anos, "
                + getAltura() + " de altura,pesando " + getPeso() + "Kg. Com" + getVitorias() + " vitórias, " +
                getDerrotas() + " derrotas e " + getEmpates() + " empates.");
    }
    public void status(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Peso: " + getPeso());
        System.out.println("Vitórias:" + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }
    public void ganharLuta(){
        this.vitorias += 1;
    }
    public void perderLuta(){
        this.derrotas += 1;
    }
    public void empatarLuta(){
        this.empates += 1;

    }

    //Métodos especiais
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
        setCategoria();
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2) {
            categoria = "Abaixo do peso.Categoria Inválida";
        }
        else if (peso <= 73.3){
            categoria = "Categoria Leve";
        }
        else if(peso <= 83.9) {
            categoria = "Categoria Média";
        }
        else if(peso <= 120.2) {
            categoria = "Categoria Pesado";
        }else{
            categoria = "Acima do peso. Categoria Inválida";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas(){
        return this.derrotas;
    }

    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }
    
}

