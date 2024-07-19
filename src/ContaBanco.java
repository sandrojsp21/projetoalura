import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 0.0;

        String nome;
        String tipoDeConta = "";

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        // Variável de controle para o loop do tipo de conta
        boolean tipoContaSelecionado = false;

        // Loop para garantir que uma escolha válida seja feita para o tipo de conta
        while (!tipoContaSelecionado) {
            System.out.println("-----------Menu------------");
            System.out.println();
            System.out.println("Escolha o tipo de conta:");
            System.out.println("1. Conta Poupança.");
            System.out.println("2. Conta Corrente.");
            System.out.println("3. Sair.");
            String escolha = entrada.nextLine();

            // Verificação da escolha do usuário
            switch (escolha) {
                case "1":
                    tipoDeConta = "Poupança";
                    System.out.println("Conta Poupança selecionada.");
                    tipoContaSelecionado = true; // Tipo de conta válido selecionado
                    break;
                case "2":
                    tipoDeConta = "Corrente";
                    System.out.println("Conta Corrente selecionada.");
                    tipoContaSelecionado = true; // Tipo de conta válido selecionado
                    break;
                case "3":
                    System.out.println("Saindo do programa.");
                    entrada.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }

        // Exibição dos dados do usuário
        String dadosUser = String.format("""
                Nome:               %s
                Tipo de conta:      %s
                Saldo        :      $%.2f
                """, nome, tipoDeConta, saldo);

        System.out.println(dadosUser);
        System.out.println("*************************************");

        int escolhaOperacao = 0;

        // Loop para operações bancárias
        while (escolhaOperacao != 4) {
            System.out.println("Operações");
            System.out.println();
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            escolhaOperacao = entrada.nextInt();

            switch (escolhaOperacao) {
                case 1:
                    System.out.printf("Seu saldo atual é: $%.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor a receber: ");
                    double valorReceber = entrada.nextDouble();
                    saldo += valorReceber;
                    System.out.printf("Valor recebido: $%.2f%n", valorReceber);
                    System.out.printf("Seu novo saldo é: $%.2f%n", saldo);
                    break;
                case 3:
                    System.out.print("Digite o valor a transferir: ");
                    double valorTransferir = entrada.nextDouble();
                    if (valorTransferir <= saldo) {
                        saldo -= valorTransferir;
                        System.out.printf("Valor transferido: $%.2f%n", valorTransferir);
                        System.out.printf("Seu novo saldo é: $%.2f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }

        entrada.close();
    }
}
