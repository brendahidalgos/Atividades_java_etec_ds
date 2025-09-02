package estruturas.registro;

import java.util.Scanner;

public class ExemploRegistroCorrigido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        // Esta linha extra é a solução!
        // Ela consome a quebra de linha que sobrou do nextInt()
        scanner.nextLine(); 

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        
        // Cria uma instância da classe Pessoa (o "registro")
        Pessoa pessoa = new Pessoa(nome, idade);

        System.out.println("\nDados da pessoa cadastrada:");
        pessoa.exibirDados();
        
        scanner.close();
    }
}