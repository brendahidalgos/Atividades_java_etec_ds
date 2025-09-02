package lojaonline;
import java.util.Scanner;
public class Lojaonline {
    public static void main(String[] args) {
       //Declaração das variaveis
        double valorCompra;
        double descontoCinco;
        double descontoDez;
        double descontoQuinze;

        try (Scanner leitor = new Scanner(System.in)) {
            //Entrada de dados
            System.out.print("Digite o valor total da compra: R$ ");//Escreva o valor da compra
            valorCompra = leitor.nextDouble(); //Armazena o valor da compra
        }
        //Atribuição dos valores de desconto
        descontoCinco = valorCompra * 0.05;//multiplicando o valor da compra por 5% de desconto
        descontoDez = valorCompra * 0.10;//multiplicando o valor da compra por 10% de desconto
        descontoQuinze = valorCompra * 0.15;//multiplicando o valor da compra por 15% de desconto
        //Estrutura de decisão      
        if (valorCompra <= 0){ // Se o valor é zero ou negativo
            System.out.println("Valor de compra invalido. Por favor, insira um valor valido.");// exibe o erro
        } else if (valorCompra < 200.00){//Se o valor de compra for menor que 200
            System.out.println("Valor do desconto: 5%");// exibe valor de desconto aplicado
            System.out.printf("Valor descontado: R$ %.2f%n",descontoCinco);// exibe o valor do desconto 
            System.out.printf("Valor total a pagar: R$ %.2f%n", valorCompra - descontoCinco);// valor final a pagar - desconto de 5%
        } else if(valorCompra >= 200.00 && valorCompra < 300.00) {//se o valor da compra for maior ou igual a 200 E menor que 300
            System.out.println("Valor do desconto: 10%");// exibe valor de desconto aplicado
            System.out.printf("Valor descontado: R$ %.2f%n", descontoDez);// exibe o valor do desconto
            System.out.printf("Valor total a pagar: R$ %.2f%n",valorCompra - descontoDez);// valor final a pagar - desconto de 10%
        } else if(valorCompra >= 300){//se o valor de compra for maior ou igual a 300
            System.out.println("Valor do desconto: 15%");// exibe valor de desconto aplicado
            System.out.printf("Valor descontado: R$ %.2f%n",descontoQuinze);// exibe o valor do desconto
            System.out.printf("Valor total a pagar: R$ %.2f%n",valorCompra - descontoQuinze);// valor final a pagar - desconto de 15%
        }
    }
}