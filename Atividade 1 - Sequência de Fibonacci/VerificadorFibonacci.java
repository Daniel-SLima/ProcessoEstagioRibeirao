import java.util.Scanner;

public class VerificadorFibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe um numero: ");
            int numero = scanner.nextInt();
            
            if (pertenceFibonacci(numero)) {
                System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci.");
            } else {
                System.out.println("O numero " + numero + " nao pertence a sequencia de Fibonacci.");
            }
        }
    }

    public static boolean pertenceFibonacci(int numero) {
        int a = 0, b = 1, c = 0;
        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == numero || numero == 0;
    }
}
