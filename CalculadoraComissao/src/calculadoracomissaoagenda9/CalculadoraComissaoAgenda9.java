package calculadoracomissaoagenda9;
import javax.swing.JOptionPane; //biblioteca JOptionPane
public class CalculadoraComissaoAgenda9 { //nome do programa
    public static void main(String[] args) {
        //declaração das variáveis
        String vendas, mensagem; 
        double valorTotalVendas, comissao = 0.0, bonus = 0.0, comissaoTotal;
        int quantidadeVendas;
        char continuar = 's';
        //loop do while
        do {//faça esses comandos           
            try { //tratamento de erros para o usuario não digitar letras ao inves de numeros
                vendas = JOptionPane.showInputDialog("Digite o valor total das vendas (em R$): "); //inserir o valor da venda
                valorTotalVendas = Double.parseDouble(vendas); //converter o valor de vendas em double e armazena
            } catch (NumberFormatException e) {
                //se o usuário não digitou um número exibe uma mensagem de erro
                JOptionPane.showMessageDialog(null, "Valor invalido. Digite apenas numeros.", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;//a instrução faz com que a execução pule para a próxima iteração do loop
            }            
            try { //tratamento de erros para o usuario não digitar letras ao inves de numeros
                String inputQuantidade = JOptionPane.showInputDialog("Digite a quantidade de vendas realizadas: ");//inserir a qtd de vendas realizadas
                quantidadeVendas = Integer.parseInt(inputQuantidade); //converte String para inteiro e armazena
            } catch (NumberFormatException e) {
                 //se o usuário não digitou um número exibe uma mensagem de erro
                JOptionPane.showMessageDialog(null, "Quantidade inválida. Digite apenas números inteiros.", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            //calculando a comissão com se e senão
            if (valorTotalVendas < 1000) { //se o valor total de vendas for menor que mil (1000)
                 comissao = valorTotalVendas * 0.05; //comissão de 5% - valor total de vendas vezes (*) 0.05
            } else if (valorTotalVendas >= 1000 && valorTotalVendas <= 5000) { // se o valor total de vendas estiver entre mil e cinco mil (1000 e 5000)
                 comissao = valorTotalVendas * 0.07; //comissão de 7% - valor total de vendas vezes (*) 0.07
            } else { //se não for nenhuma das opções que é acima de cinco mil (5000)
                 comissao = valorTotalVendas * 0.10; //comissão de 10% - valor total de vendas vezes (*) 0.10
            }
            //aplicando o bonus para acima de 10 vendas
            if (quantidadeVendas > 10) { //se a qtd de vendas for maior que dez (10)
                bonus = valorTotalVendas * 0.02; //calcula um bônus de 2% sobre o valor total das vendas
            }
            //somando a comissão base e o bônus (se houver)
            comissaoTotal = comissao + bonus;
                mensagem = "Resultado\n" +
                    String.format("Valor total das vendas: R$ %.2f\n", valorTotalVendas) + //exibe o valor total das vendas com duas casas decimais
                    "Quantidade de vendas realizadas: " + quantidadeVendas + "\n" +
                    String.format("Comissão: R$ %.2f\n", comissao); //exibe o valor da comissão com duas casas decimais
            //se houve bônus para adicioná-lo à mensagem.
            if (bonus > 0) { //se o bonus for maior que zero (0)
                mensagem += String.format("Bônus por quantidade de vendas: R$ %.2f\n", bonus); //exibe o valor do bônus com duas casas decimais
            }
            mensagem += String.format("Comissão total a receber: R$ %.2f\n", comissaoTotal); //exibe o valor total da comissão com duas casas decimais
            //resultado
            JOptionPane.showMessageDialog(null, mensagem, "Cálculo de Comissão", JOptionPane.INFORMATION_MESSAGE);
            //pergunta se quer realizar outro cálculo
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outro cálculo?", "Novo Cálculo", JOptionPane.YES_NO_OPTION);
            //se clicar no botão nao (JOptionPane.NO_OPTION)
            if (resposta == JOptionPane.NO_OPTION) {
                //define a variável como n para sair do loop
                continuar = 'n';
            }
        }//até... 
        while (continuar == 's'); //O loop continua enquanto a variável continuar for igual a s
        //exibe uma mensagem de encerramento
        JOptionPane.showMessageDialog(null, "Programa encerrado.", "Fim", JOptionPane.INFORMATION_MESSAGE);
    }
}