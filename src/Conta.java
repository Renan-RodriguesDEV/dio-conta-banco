public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta(){
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Conta(int numero, String agencia, String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void show(){
        System.out.println("" +
                "Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + numero +", conta "+saldo+" e seu saldo "+saldo+" já está disponível para saque" +
                "");
    }
}
