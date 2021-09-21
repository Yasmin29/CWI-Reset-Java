package CursoEmVideoPOOAula11B;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    //Métodos:
    public void fazerAniversario(){
        this.idade ++;
    }

    public String getNome() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String  toString() {
        return "Pessoa{" +
                "name='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
