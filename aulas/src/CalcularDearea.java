import java.util.Scanner;

public class CalcularDearea {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----------Menu------------");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do cículo");
            System.out.println("3. Sair");
            System.out.println("Escolha umas das opção : ");
            escolha = entrada.nextInt();


            if (escolha == 1) {
                System.out.println("Digite o do lado quadrado: ");
                double lado = entrada.nextDouble();
                double areaQuadrada = lado * lado;
                System.out.println("Área do quadrdo é: " + areaQuadrada);
            } else if (escolha == 2) {
                System.out.println("Digite o raio do círculo: ");
                double raio = entrada.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("A área do círculo é: " + areaCirculo);
            } else if (escolha == 3){
                System.out.println("Programa encerrado");
            } else {
                System.out.println("Opção inválida. Por favor. Tente novamente.");
            }
        }
        entrada.close();
    }
}