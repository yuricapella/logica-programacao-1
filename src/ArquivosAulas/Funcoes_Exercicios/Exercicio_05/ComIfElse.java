package ArquivosAulas.Funcoes_Exercicios.Exercicio_05;

import java.util.Scanner;

public class ComIfElse {
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

        if (mesEnum.equals(MesAno.JANEIRO)
            || mesEnum.equals(MesAno.MARCO)
            || mesEnum.equals(MesAno.MAIO)
            || mesEnum.equals(MesAno.JULHO)
            || mesEnum.equals(MesAno.AGOSTO)
            || mesEnum.equals(MesAno.OUTUBRO)
            || mesEnum.equals(MesAno.DEZEMBRO)) {
            return 31;
        }else if (mesEnum.equals(MesAno.ABRIL)
            || mesEnum.equals(MesAno.JUNHO)
            || mesEnum.equals(MesAno.SETEMBRO)
            || mesEnum.equals(MesAno.NOVEMBRO)) {
            return 30;
        }else if (mesEnum.equals(MesAno.FEVEREIRO)) {
            if (anoBissexto(ano)){
                return 29;
            }else{
                return 28;
            }
        }
        return 0;
    }

}
