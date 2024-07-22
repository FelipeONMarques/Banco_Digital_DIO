import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import usuario.Cliente;


public class Main {
    public static void main(String[] args) {

        Cliente felipe = new Cliente();
        felipe.setNome("felipe");

        Conta cc = new ContaCorrente(felipe);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(felipe);
        cc.transferir(10, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}