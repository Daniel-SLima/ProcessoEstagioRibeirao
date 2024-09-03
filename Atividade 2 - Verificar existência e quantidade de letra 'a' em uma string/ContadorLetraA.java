import java.util.Scanner;

public class ContadorLetraA {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe uma string: ");
            String entrada = scanner.nextLine();
            
            int quantidade = contarLetraA(entrada);
            if (quantidade > 0) {
                System.out.println("A letra 'a' aparece " + quantidade + " vezes na string.");
            } else {
                System.out.println("A letra 'a' nao aparece na string.");
            }
        }
    }

    public static int contarLetraA(String texto) {
        int contador = 0;
        for (char caractere : texto.toCharArray()) {
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
