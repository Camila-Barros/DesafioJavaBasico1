import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double saldo = 2500;
        int operacao = 0;

        String dados = """
                 
                 *********************************
                 DADOS INICIAIS DO CLIENTE:

                 Nome do cliente:  Camila Barros
                 Tipo de conta:    Corrente
                 Saldo inicial:    R$ 2500,00
                 *********************************
                """;
        System.out.println(dados);

        String menu = """
                              
                 OPERAÇÕES:
                 1- Consultar saldo
                 2- Receber valor
                 3- Transferir valor
                 4- Sair
                 
                 >>DIGITE A OPÇÃO DESEJADA:
                """;
        Scanner leitura = new Scanner(System.in);

        while(operacao != 4) {
            System.out.println(menu);
            operacao = leitura.nextInt();

            if (operacao == 1) {
                System.out.println("--------------------------------");
                System.out.println("SALDO ATUAL = R$ " + saldo);
                System.out.println("--------------------------------");

            } else if (operacao == 2) {
                System.out.println("Informe o valor a receber");
                double recebeValor = leitura.nextDouble();
                System.out.println("--------------------------------");
                //System.out.println("Saldo atual = R$ " + (saldo + recebeValor));
                System.out.println("SALDO ATUALIZADO = R$ " + (saldo += recebeValor));
                System.out.println("--------------------------------");

            } else if (operacao == 3) {
                System.out.println("Informe o valor a transferir");
                double transfereValor = leitura.nextDouble();
                if (transfereValor > saldo) {
                    System.out.println("-------------------------------------------------------");
                    System.out.println("SALDO INSUFICIENTE PARA REALIZAR ESSA TRANSFERÊNCIA.");
                    System.out.println("-------------------------------------------------------");
                } else {
                    System.out.println("--------------------------------");
                    //System.out.println("Saldo atual = R$ " + (saldo - transfereValor));
                    System.out.println("SALDO ATUALIZADO = R$ " + (saldo -= transfereValor));
                    System.out.println("--------------------------------");
                }

            } else if (operacao != 4) {
                System.out.println("--------------------------------");
                System.out.println("OPÇÃO INVALIDA");
                System.out.println("--------------------------------");

            } else if (operacao == 4) {
                System.out.println("SESSÃO ENCERRADA");
                break;
            }
        }
    }
}