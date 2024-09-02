import java.util.Scanner;

public class ContadorDeA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string:");
        String input = scanner.nextLine();

        int count = 0;
        boolean existeA = false;

        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
                existeA = true;
            }
        }

        if (existeA) {
            System.out.println("A letra 'a' aparece " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }

        scanner.close();
    }
}