package somamatriz;
import java.util.InputMismatchException;//tratamento de erros do try-catch
import java.util.Scanner;//biblioteca scanner
public class SomaMatriz {
    public static void main(String[] args) {
        //declarando as variaveis
        int[][] matriz = new int[3][3];//matriz 3x3 com numeros inteiros
        int soma = 0;//soma
        int l, c; //variaveis l de linha e c de coluna        
        Scanner leitor = new Scanner(System.in); //bibliteca scanner        
        System.out.println("Escreva os elementos da matriz 3x3:"); //pedir ao usuario a digitação dos numeros
        for (l=0; l<3; l++) {//loop da matriz l (linha)-linha iniciando com 0
            for (c=0; c<3; c++) {//loop da matriz c (coluna)-coluna iniciando com 0, até menor que 3
                boolean entradaValida = false;//variável para verificar se a entrada do usuário é um número
                   while (!entradaValida) { //iniciando o tratamento de dados, caso o usuario digite letras ao inves de numeros inteiros
                    try {
                        System.out.printf("Elemento [%d][%d]: ", l, c);//exibe para digitar os numeros de linha e coluna
                        matriz[l][c] = leitor.nextInt();//le o numero e armazena
                        entradaValida = true; //se for numero e valido
                    } catch (InputMismatchException e) {//caso seja letras
                        System.out.println("Escreva um numero inteiro!!!");//exibe a mensagem de erro
                        leitor.next();//limpa o scanner para evitar um loop infinito
                    }
                }
                soma += matriz[l][c]; //adiciona o elemento a soma
            }
        }
        //resultado
        System.out.println("\nMatriz digitada:");//exibe a mensagem dos dados digitados
        for (l=0; l<3; l++) {//loop para exibir as linhas
            char letraLinha = (char)('A'+l); //acrescentar a letra A,B,C (maiusculas) em linhas
            for (c=0; c<3; c++) {//loop para exibir as colunas
                char letraColuna = (char)('a'+c); //acrescentar a letra a,b,c (minusculas) em colunas 
                System.out.print(letraLinha + "" + letraColuna + ": " + matriz[l][c] + "  ");//exibe os numeros separadamente
            }
            System.out.println();//pula linha
        }
        //resultado da soma
        System.out.println("\nSoma dos elementos: " + soma);
        leitor.close();//fecha o scanner
    }
}