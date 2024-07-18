
import java.util.Scanner;

public class JogoAdvinh {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroGerado = 56;
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número entre 0 e 100 ");
            numeroDigitado = entrada.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + "tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O numero digitado é menor que o número gerado.");
            }else {
                System.out.println("O número digitado é maior que o número gerado. ");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era : " + numeroGerado);
        }

    }
}
