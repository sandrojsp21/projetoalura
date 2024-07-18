import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine( );

        System.out.println("**************************");

        String dadosUser = String.format("""
                Nome:               Sandrp Júnior Santos Paiva
                Tipo de conta:      Corrente
                Saldo inicial:      $000000
                
                """);
        System.out.println(dadosUser);
        System.out.println("**************************");

        int escolha = 0;

        while (escolha != 4) {
            System.out.println("Operações");
            System.out.println( );
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            escolha = entrada.nextInt();

        }
    }
}
