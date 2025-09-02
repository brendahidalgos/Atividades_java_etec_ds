import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;

        do {
            System.out.print("Digite a senha (a senha é 'java'): ");
            senha = scanner.nextLine();
        } while (!senha.equals("java"));

        System.out.println("Senha correta! Acesso permitido.");
        scanner.close();
    }
}