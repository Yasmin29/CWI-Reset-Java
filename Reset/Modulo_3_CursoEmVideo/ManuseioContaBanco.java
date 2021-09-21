package Modulo_3_CursoEmVideo;

public class ManuseioContaBanco {
    public static void main(String[] args) {
        ContaBanco novaConta = new ContaBanco();
        novaConta.setNumConta(11111);
        novaConta.setDono("Jubileu");
        novaConta.abrirConta("cc");

        ContaBanco novaConta2 = new ContaBanco();
        novaConta2.setNumConta(2222);
        novaConta2.setDono("Creuza");
        novaConta2.abrirConta("cp");

        novaConta.depositar(100);
        novaConta2.depositar(500);
        novaConta2.sacar(1000);

        novaConta.estadoAtual();
        novaConta2.estadoAtual();



    }

}
