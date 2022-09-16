public class Conta {
    private double saldo;
    public int agencia;
    private int numero;
    String titular;

    public Conta(int agencia, int numero) { // método construtor
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Conta criada com sucesso sua agência é: " + this.agencia);
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Seu saldo agora é de " + this.saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente " + this.saldo);
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println(
                    "Transferência realizada com sucesso para conta " + "Valor = " + valor);
            System.out.println("Seu saldo agora é de: " + this.saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou Conta inválida");
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int novoNumeroConta) {
        this.numero = novoNumeroConta;
    }
}

// as condições do método de preferência ficar geralmente no construtor
// justamente pra main não virar uma zona e termos uma classe padronizada
