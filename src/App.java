public class App {
    public static void main(String[] args) throws Exception {
    Cliente venilton = new Cliente("Venilton", "23211232123");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        
    }
}
