public class CriaConta {

  public static void main(String[] args) {
    Conta primeiraConta = new Conta(133, 1344);
    Conta segundaConta = new Conta(134, 1345);

    segundaConta.depositar(500);

    primeiraConta.transferir(900, segundaConta);

    // System.out.println("Seu saldo atual agora é: " + segundaConta.saldo);

  }

}
