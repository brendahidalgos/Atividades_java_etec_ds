package tabuadagiovannaagenda9;
public class TabuadaGiovannaAgenda9 { //nome do programa
    public static void main(String[] args) {
    int numero = 6;//inicia com uma variavel inteira com o valor 6 para começar
        while (numero <= 10) { //enquanto o valor de numero for menor ou igual a 10
            //exibe a tabuada do número atual
            System.out.println("<3 Tabuada do " + numero + " <3 "); 
            int multiplicador = 0; //variavel multiplicador com valor inteiro iniciando por zero (0)
            // loop while que continuará executando enquanto o valor de multiplicador for menor ou igual a 10
            while (multiplicador <= 10) { 
                //calcula o resultado da multiplicação entre o numero atual da tabuada e o multiplicador atual
                int resultado = numero * multiplicador; 
                //exibe a expressão da multiplicação e o seu resultado
                System.out.println(numero + " x " + multiplicador + " = " + resultado); 
                multiplicador++; //incrementa o valor da variável multiplicador em 1 para a próxima iteração
            }
            numero++; //incrementa o valor da variável numero em 1 após a conclusão da tabuada do número atual, para passar para a próxima tabuada
            System.out.println(); //exibe uma linha em branco no console para separar a exibição de cada tabuada, tornando a saída mais legível
        }
    }
}