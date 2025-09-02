import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma fruta:");
        System.out.println("1 - Maçã");
        System.out.println("2 - Banana");
        System.out.println("3 - Laranja");
        System.out.print("Sua escolha: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu Maçã.");
                break;
            case 2:
                System.out.println("Você escolheu Banana.");
                break;
            case 3:
                System.out.println("Você escolheu Laranja.");
                break;
            default:
                System.out.println("Escolha inválida.");
        }
        
        scanner.close();
    }
}