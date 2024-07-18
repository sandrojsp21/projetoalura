import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo. ");
        } else if (numero < 0){
            System.out.println("O número " + numero + " é negativo." );
        }else {
            System.out.println("O número " + numero + " é zero.");
        }
        entrada.close();
    }
}


