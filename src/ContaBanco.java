public class ContaBanco {
    private int numConta;
    private String nomeCliente;
    private double saldo;

    public ContaBanco(){

    }

    public ContaBanco(int numConta, String nomeCliente, double saldo) {
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        return this.saldo += valor;
    }

    public double sacar(double valor) {
        return this.saldo -= valor;
    }

    public String toString() {
        return String.format("O nome do cliente é: %s "
                + " o número da conta do cliente é: %d "
                + " e o saldo da conta é: %.2f",
                getNomeCliente(), getNumConta(), getSaldo());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

}
