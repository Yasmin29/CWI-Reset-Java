package CursoEmVideoPOOAula11A;

public class ProjetoPessoa {
    public static void main (String[] args){
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setSexo("f");
        p3.setSexo("m");
    }
}
