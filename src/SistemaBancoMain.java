import java.util.Scanner;

public class SistemaBancoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        String dep = "n";
        ContaBanco c1 = new ContaBanco();

        do {
            System.out.println("======================================");
            System.out.println(" Sistema Bancário - escolha uma opção ");
            System.out.println("======================================");
            System.out.println("    0 - para sair");
            System.out.println("    1 - para depósito");
            System.out.println("    2 - para saque");
            System.out.println("    3 - para saldo");
            System.out.println(" ");
            System.out.println("    9 - abrir uma conta");
            System.out.println("======================================");
            System.out.println(" ");
            System.out.println(" Digite qual a sua opção: ");
            op = sc.nextInt();

            if (op == 9) {
                System.out.print(" Digite o número da conta: ");
                int numConta = sc.nextInt();
                sc.nextLine(); // comando para consumir o <enter> após o número da conta
                c1.setNumConta(numConta);
                System.out.print(" Digite o nome do cliente: ");
                String nomeCliente = sc.nextLine();
                c1.setNomeCliente(nomeCliente);
                System.out.println(" Deseja fazer o depósito? ");
                System.out.println(" Digite 's' para sim ou 'n' para não ");
                dep = sc.nextLine();

                if ((dep.equals("s")) || (dep.equals("S"))) {
                    System.out.println(" Digite um valor para depósito: ");
                    double valor = sc.nextDouble();
                    c1.depositar(valor);
                }
                System.out.println("---------------------------------------");
                System.out.println(" " + c1.toString());
                System.out.println("---------------------------------------");

            } else if (op == 1) {
                System.out.print(" Digite o número da conta do cliente: ");
                 int numConta = sc.nextInt();
                if (numConta == c1.getNumConta()) {
                    System.out.print(" Qual a valor que você deseja depositar: ");
                    double valor = sc.nextDouble();
                    c1.depositar(valor);
                    System.out.println("---------------------------------------");
                    System.out.println(" " + c1.toString());
                    System.out.println("---------------------------------------");


                } else {
                    System.out.println(" Número da conta não existe!");
                }
            } else if(op == 2) {
                System.out.println("Digite o número da conta do cliente: ");
                int numConta = sc.nextInt();
                if (numConta == c1.getNumConta()) {
                    System.out.println(" qual o valor que você deseja sacar: ");
                    double valor = sc.nextDouble();
                    c1.sacar(valor);
                    System.out.println("---------------------------------------");
                    System.out.println(" " + c1.toString());
                    System.out.println("---------------------------------------");
                } else {
                    System.out.println(" Número da conta não existe!");
                }
            } else if (op == 3) {
                System.out.println("Digite o número da conta do cliente: ");
                int numConta = sc.nextInt();
                if (numConta == c1.getNumConta()) {
                    System.out.println("---------------------------------------");
                    System.out.println(" " + c1.toString());
                    System.out.println("---------------------------------------");
                } else {
                    System.out.println(" Número da conta não existe!");
                }
            }
        } while(op != 0);


        sc.close();
    }
}
