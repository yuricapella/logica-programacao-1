package ArquivosAulas.Entradas_E_Saidas;

public class EntradaSaidaDesafio {
    public static void main(String[] args) {
        System.out.println(calcularDiasDeVida());
    }
    public static int calcularDiasDeVida() {
        /*
        Calculadora de dias
        Certo dia, Joãozinho chegou em casa e perguntou para sua mãe quantos dias ele tinha de vida. A mãe respondeu
        que esse era um dado que ela tinha que parar para fazer a conta. Para ajudar a mãe de Joãozinho, crie uma função que
        recebe a idade expressa em anos, meses e dias (os dados de entradas estarão contidos em um array de inteiros)
        e retorne a idade da pessoa expressa em dias.

        Considere o ano com 365 dias e o mês com total de 30 dias.

        Ex:
        Entrada: [5, 4, 14]
        Saída: 1959
         */
        int[] input = {5, 4, 14};
        final int DIAS_DO_ANO = 365;
        final int DIAS_DO_MES = 30;

        int totalDiasEmAnos = input[0] * DIAS_DO_ANO;
        int totalDiasEmMeses = input[1] * DIAS_DO_MES;
        int dias = input[2];
        int totalDias = totalDiasEmAnos + totalDiasEmMeses + dias;
        return totalDias;
    }

}
