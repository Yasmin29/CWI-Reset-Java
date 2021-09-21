package Modulo_3_CursoEmVideo;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("----------------------------------");
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo da conta: " + getTipo());
        System.out.println("Nome: " + getDono());
        System.out.println("Saldo da conta: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }

    public void abrirConta(String tipoConta){
        this.setTipo(tipoConta);
        this.setStatus(true);
        if(tipoConta == "cc") {
            saldo = 50.00;
        }
        else if (tipoConta == "cp"){
            saldo = 150.00;
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if(this.getSaldo() < 0 ) {
            System.out.println("Impossivel encerrar conta pois há débito.");
        }
        else if (this.getSaldo() > 0){
            System.out.println("Impossivel encerrar conta pois ainda tem dinheiro.");
        }else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    //Perguntar para o gui porque ele não põe o valor getStatus=true?
    public void depositar(double valor){
        if (this.getStatus()) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta de:" + this.getDono());
        }else {
            System.out.println("impossivel depositar");
        }
    }

    public void sacar(double valorSaque) {
        if (getStatus()) {
            if (getSaldo() >= valorSaque) {
                this.setSaldo(this.getSaldo() - valorSaque);
                System.out.println("Saque realizado na conta" + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensal(){
        double valorMensal = 0;
        if (getTipo() == "cc") {
            valorMensal = 12.00;
        } else if (getTipo() == "cp") {
            valorMensal = 20.00;
        }
        if (this.getStatus()) {
            setSaldo(getSaldo() - valorMensal);
            System.out.println("Mensalidade paga com sucesso por:" + getDono());
        } else {
            System.out.println("Impossivel pagar conta encerrada.");
        }
    }

    //metodo construtror
    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
}