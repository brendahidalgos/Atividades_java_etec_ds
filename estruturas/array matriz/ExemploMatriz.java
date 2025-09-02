import java.util.Scanner;

public class ExemploMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] notasAlunos = new String[2][2]; // 2 alunos, 2 colunas (nome, nota)

        System.out.println("Digite o nome e a nota de 2 alunos:");
        for (int i = 0; i < 2; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            notasAlunos[i][0] = scanner.nextLine();
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notasAlunos[i][1] = scanner.nextLine();
        }

        System.out.println("\nNotas dos Alunos:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Aluno: " + notasAlunos[i][0] + ", Nota: " + notasAlunos[i][1]);
        }
        
        scanner.close();
    }
}