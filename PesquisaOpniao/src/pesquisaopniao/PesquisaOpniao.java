package pesquisaopniao;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PesquisaOpniao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //delcaração das variáveis
        String nome; //variavel para o nome do entrevistado
        int idade; //variavel para a idade do entrevistado
        int opiniao; //variavel para a opinião do entrevistado
        int excelente = 0; //variavel para contar quantas vezes execlente foi selecionado
        int ruim = 0; //variavel para contar quantas vezes ruim foi selecionado
        boolean nomeValido = false; //variavel para controlar a validade do nome 
        //inicio do for
        for (int i = 1; i <= 3; i++) { //criando a variavel I como numero inteiro sendo igual a 1, loop que se repete 50 vezes (i de 1 a 50) se I for menor ou igual a 50 faça:
            System.out.println("Entrevistado " + i + ":"); //imprime o número do entrevistado
            System.out.print("Nome: "); //nome do entrevistado
            nome = leitor.nextLine(); //armazena o nome
            System.out.print("Idade: "); //idade do entrevistado
            idade = leitor.nextInt(); //armazena a idade
            leitor.nextLine(); //quebra de linha deixada pelo nextInt()
            System.out.print("Opiniao (1-EXCELENTE, 2-BOM, 3-RUIM): "); //opinião do entrevistado
            opiniao = leitor.nextInt();//armazena a opinião
            leitor.nextLine(); //quebra de linha deixada pelo nextInt()
            //verifica a opinião e atualiza os contadores
            if (opiniao == 1) { //se a opinião for 1 (EXCELENTE)
                excelente++; //incrementa o contador de excelente
            } else if (opiniao == 3) { // Se a opinião for 3 (RUIM)
                ruim++; // Incrementa o contador de ruim
            }
        } //fim do for
        JOptionPane.showMessageDialog(null, "Resultado:");
        System.out.println("\nResultados da pesquisa:"); //exibe o resultado
        System.out.println("Quantidade de respostas EXCELENTE: " + excelente); //exibe o resultado de excelente
        System.out.println("Quantidade de respostas RUIM: " + ruim); //exibe o resultado de ruim
    }
}