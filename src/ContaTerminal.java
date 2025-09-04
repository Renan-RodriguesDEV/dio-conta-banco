import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        try {
            System.out.println("Por favor, digite o número da Agência !");
            int numero = sc.nextInt();
            System.out.println("Por favor, digite o Nome da Agência !");
            String agencia = sc.next();
            System.out.println("Por favor, digite seu Nome !");
            String nomeCliente = sc.next();
            System.out.println("Por favor, digite seu Saldo !");
            double saldo = sc.nextFloat();
            Conta conta = new Conta(numero,agencia,nomeCliente,saldo);
            conta.show();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}