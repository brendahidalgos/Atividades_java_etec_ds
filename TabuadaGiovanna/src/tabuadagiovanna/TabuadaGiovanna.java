package tabuadagiovanna;
public class TabuadaGiovanna {
    public static void main(String[] args) {
        for (int i = 6; i <= 10; i++) { //loop para os números de 6 a 10
            System.out.println("Tabuada do " + i + ":");
            for (int j = 0; j <= 10; j++) { //loop para os multiplicadores de 0 a 10
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); //linha em branco para separar as tabuadas
        }  } }
