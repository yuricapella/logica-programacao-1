package ArquivosAulas.Entradas_E_Saidas.Exercicios.Exercicio_03;

import java.util.Scanner;

public class Entrada {
    private static Scanner entrada = new Scanner(System.in);

    public static Meses obterMes() {
        System.out.println("Digite o mês: (janeiro, março ou marco, etc.)");
        String mes = entrada.nextLine().toUpperCase();

        while (true) {
            mes = corrigirMes(mes);
            try {
                Meses mesSelecionado = Meses.valueOf(mes);
                System.out.println("O mês de " + mesSelecionado.toString().toLowerCase() + " possui até " + diasNoMes(mesSelecionado) + " dias.");
                return mesSelecionado;
            } catch (IllegalArgumentException e) {
                System.out.println("Mês inválido. Tente novamente.");
                mes = entrada.nextLine().toUpperCase();
            }
        }
    }

    private static String corrigirMes(String mes) {
        return mes.equals("MARÇO") ? "MARCO" : mes;
    }

    public static int obterDia(Meses mes) {
        System.out.println("Digite o dia de nascimento: (5, 15, 23, etc)");

        int dia = -1;

        while (dia == -1) {
            if (!entrada.hasNextInt()) {
                System.out.println("Dia inválido. Tente novamente.");
                entrada.next();
            } else {
                dia = entrada.nextInt();
                entrada.nextLine();

                int diasValidos = diasNoMes(mes);
                if (dia < 1 || dia > diasValidos) {
                    System.out.println("Dia inválido para o mês informado.");
                    dia = -1;
                }
            }
        }
        return dia;
    }

    private static int diasNoMes(Meses mes) {
        int diasValidos = (mes == Meses.JANEIRO || mes == Meses.MARCO || mes == Meses.MAIO ||
                mes == Meses.JULHO || mes == Meses.AGOSTO || mes == Meses.OUTUBRO ||
                mes == Meses.DEZEMBRO) ? 31 :
                (mes == Meses.ABRIL || mes == Meses.JUNHO || mes == Meses.SETEMBRO ||
                        mes == Meses.NOVEMBRO) ? 30 :
                        (mes == Meses.FEVEREIRO) ? 28 : -1;
        return diasValidos;
    }

    public static Scanner getEntrada() {
        return entrada;
    }
}
