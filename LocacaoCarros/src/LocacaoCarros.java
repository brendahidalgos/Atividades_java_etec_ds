/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author brenda
 */
import java.util.Scanner;

public class LocacaoCarros {
    public static void main(String[] args) {
        
        //Declaração das variaveis
        String modeloCarro; //modelo do carro
        double valorDiaria; //valor da diária
        int qtdDias; //quantidade de dias
        double kmRodados; //km rodados
        double totalPagar; //custo total
        
        Scanner leitor = new Scanner(System.in); //biblioteca scanner

        // Entrada de dados
        System.out.print("Informe o modelo do carro: "); //Exibe a frase
        modeloCarro = leitor.nextLine(); //Digite o nome do modelo do carro

        System.out.print("Informe o valor da diaria (R$): "); //Exibe a frase
        valorDiaria = leitor.nextDouble(); //Digite o valor da diaria em reais

        System.out.print("Informe a quantidade de dias de locacao: "); //Exibe a frase
        qtdDias = leitor.nextInt(); //Digite a quantidade de dias utilizzados

        System.out.print("Informe a quantidade de Km percorridos: "); //Exibe a frase
        kmRodados = leitor.nextDouble(); //Digite o valor de km percorridos

        // Validação de entradas
        if ((valorDiaria <= 0)||(qtdDias <= 0)||(kmRodados <= 0)){ //se o valor da diaria for menor que 0(zero), ou a quantidade de dias menor que 0(zero), ou a km rodados for menor que 0(zero) - Existem 3 possibilidades de apresentar o erro, todas se for menor que 0(zero)
            System.out.println("Erro: Valores invalidos! Todos os valores devem ser maiores que zero."); //se algum valor for menor que 0 (zero), exibe essa mensagem de erro
        } else { //se não, começamos as contas
            
            // Cálculo do valor total
            totalPagar = ((valorDiaria * qtdDias)+(kmRodados * 0.20)); //Para definir o Custo Total primeiro devo multiplicar o valor da diária pela quantidade de dias, depois multiplicar a quantidade de km rodados com o valor de 0.20 para cada km rodado, por fim somar os dois valores.

            // Saída de dados
            System.out.println("Resumo da Locacao: "); //Exibe a frase
            System.out.println("Modelo do carro: " + modeloCarro); //Exibe o modelo do Carro
            System.out.println("Valor total a pagar: R$ " + totalPagar); //Exibe o valor tota a pagar de acordo com as informações apresentadas
        }
    }
    //acrescentando comentário
}
