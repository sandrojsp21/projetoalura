import java.util.Scanner;

public class CompararNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Inserir o primeiro número inteiros: ");
        int numero_1 = entrada.nextInt();
        
        System.out.println("Inserir o segundo número inteiros: ");
        int numero_2 = entrada.nextInt();

        if (numero_1 == numero_2) {
            System.out.println("Os números são iguais." );
        }else {
            System.out.println("Os números são direntes.");
            if (numero_1 > numero_2) {
                System.out.println( "O primeioro número (" + numero_1 + ") é maior que o segundo numero (" + numero_2 + ").");
            } else {
                System.out.println("O segundo número (" + numero_2 + ") é maior que o primeiro número (" + numero_1 + ").");
            }
        }
        entrada.close();
   }
}