package Main;

/**
 * @author Mari
 */
public class Main { // eu 

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        double a = entrada.lerNumeroDouble("Digite um valor para A");
        double b = entrada.lerNumeroDouble("Digite um valor para B");

        Processamento processamento = new Processamento();
        Double soma = processamento.getSoma(a, b);

        Saida saida = new Saida();
        saida.imprimirNumeroDouble("Resultado da soma", soma);

    }

}
