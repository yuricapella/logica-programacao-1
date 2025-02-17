package ArquivosAulas.Funcoes_Exercicios.Exercicio_05;

import java.util.Scanner;

public class ComEnumMetodos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano:");
        int ano = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o mes:");
        String mes = entrada.nextLine().toUpperCase();

        MesAno mesEnum = MesAno.valueOf(mes);
        int dia = mesEnum.getDias(ano);
        mes = mesEnum.validacaoNomenclatura(mes);

        String mensagemAnoBissexto = (mesEnum.verificaAnoBissexto(ano) ? "é bissexto" : "não é bissexto");

        System.out.printf("O ano %d %s e o mês de %s possui %d dias\n", ano, mensagemAnoBissexto, mes.toLowerCase(), dia);

        entrada.close();
    }

    public enum MesAno {
        JANEIRO(31),
        FEVEREIRO(28),
        MARCO(31),
        ABRIL(30),
        MAIO(31),
        JUNHO(30),
        JULHO(31),
        AGOSTO(31),
        SETEMBRO(30),
        OUTUBRO(31),
        NOVEMBRO(30),
        DEZEMBRO(31);

        private final int dias;

        MesAno(int dias) {
            this.dias = dias;
        }

        public int getDias(int ano){
            if (this == FEVEREIRO && verificaAnoBissexto(ano)){
                return 29;
            }
            return this.dias;
        }

        public static boolean verificaAnoBissexto(int ano){
            return (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0);
        }

        public static String validacaoNomenclatura(String mes){
            if(mes.equals("MARCO") || mes.equals("MARÇO")){
                mes = "MARCO";
            }
            return mes;
        }
    }
}
