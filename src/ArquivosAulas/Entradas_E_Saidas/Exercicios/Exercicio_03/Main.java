package ArquivosAulas.Entradas_E_Saidas.Exercicios.Exercicio_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Meses mes = Entrada.obterMes();
        int dia = Entrada.obterDia(mes);
        Signo.exibirSigno(mes, dia);

        Entrada.getEntrada().close();
    }
}
