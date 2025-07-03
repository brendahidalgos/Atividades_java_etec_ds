package controleipva;  //declara o pacote onde a classe ControleIPVA reside, organizando as classes em grupos.
import javax.swing.JOptionPane; //importa a classe JOptionPane, que permite criar caixas de diálogo para interação com o usuário.
public class ControleIPVA { //define a classe principal ControleIPVA, onde o programa começa a ser executado.
   
    public static void main(String[] args) {
        //declarando variáveis
        String dataPagamento;
        int finalPlaca;
            
        try { //bloco try-catch para lidar com possíveis erros na conversão da entrada do usuário
            String input = JOptionPane.showInputDialog("Digite o numero final da placa do veiculo:"); //entrada do valor final da placa
            finalPlaca = Integer.parseInt(input); //converte a entrada para inteiro

            //inicando estrutura de decisão case (caso)
            switch (finalPlaca) {//caso o final da placa seja:
                case 1: //final 1
                    dataPagamento = "30/04"; //data de pagamento
                    break; //pausa
                case 2: //final 2
                    dataPagamento = "31/05"; //data de pagamento
                    break; //pausa
                case 3: //final 3
                    dataPagamento = "30/06"; //data de pagamento
                    break; //pausa
                case 4: //final 4
                    dataPagamento = "31/07"; //data de pagemento
                    break; //pausa
                case 5: //final 5
                    dataPagamento = "31/08"; //data de pagemento
                    break; //pausa
                case 6: //final 6
                    dataPagamento = "30/09"; //data de pagamento
                    break; //pausa
                case 7: //final 7
                    dataPagamento = "31/10";//data de pagamento
                    break; //pausa
                case 8: //final 8
                    dataPagamento = "30/11";//data de pagamento
                    break; //pausa
                case 9: //final 9 ou
                case 0: //final 0
                    dataPagamento = "31/12";//data de pagamento
                    break; //pausa
                default: //caso o número final da placa não corresponda a nenhum dos casos anteriores
                    dataPagamento = null;
                    break; //pausa
            }
           if (dataPagamento != null) { //se a data de pagamento não for nula (ou seja, um valor válido foi atribuído)
                JOptionPane.showMessageDialog(null, "O pagamento do IPVA do veiculo deve ser feito ate " + dataPagamento + "."); //exibe a data de pagamento
            } else { //caso contrário (a data de pagamento é nula)
                JOptionPane.showMessageDialog(null, "O numero final da placa informado e invalido."); //exibe uma mensagem de erro
            }
        } catch (NumberFormatException e) { //captura a exceção se a entrada do usuário não for um número inteiro
            JOptionPane.showMessageDialog(null, "Entrada invalida. Digite um numero inteiro.","E R R O", JOptionPane.ERROR_MESSAGE);//exibe uma mensagem de erro
        }
    }
}