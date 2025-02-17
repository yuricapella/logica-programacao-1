package ArquivosAulas.Funcoes_Exercicios.Exercicio_05;

import java.util.Scanner;

public class ComSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano:");
        int ano = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Digite o mes:");
        String mes = entrada.nextLine().toUpperCase();

        if(mes.equals("MARCO") || mes.equals("MARÇO")){
            mes = "MARCO";
        }
        entrada.close();

        System.out.printf("A quantidade de dias no mês é: %d\nO ano é bissexto? %b\n",diasMes(mes,ano),anoBissexto(ano));
    }

    public enum MesAno {
        JANEIRO,
        FEVEREIRO,
        MARCO,
        ABRIL,
        MAIO,
        JUNHO,
        JULHO,
        AGOSTO,
        SETEMBRO,
        OUTUBRO,
        NOVEMBRO,
        DEZEMBRO
    }

    public static boolean anoBissexto(int ano){
        return (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0);
    }

    public static int diasMes(String mes, int ano){
        MesAno mesEnum = MesAno.valueOf(mes);
        switch (mesEnum){
            case JANEIRO:
            case MARCO:
            case MAIO:
            case JULHO:
            case AGOSTO:
            case OUTUBRO:
            case DEZEMBRO:
                return 31;
            case ABRIL:
            case JUNHO:
            case SETEMBRO:
            case NOVEMBRO:
                return 30;
            case FEVEREIRO:
                return (anoBissexto(ano) ? 29 : 28);
        }
        return 0;
    }
}
