package ArquivosAulas.Operadores;/*

Exercício 8: Verificar se um Ano é Bissexto
Um ano é considerado bissexto se:
● É divisível por 4, mas não por 100, ou
● É divisível por 400.
Escreva um programa que determine se um ano é bissexto ou não,
usando apenas o operador ternário.

*/

public class OperadoresExercicio03 {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("Exercício 8: Verificar se um Ano é Bissexto");
        int ano = 2020, ano2 = 2021;
        System.out.printf("O ano de %d é bissexto? %s\n", ano, (anoBissexto(ano)));
        System.out.printf("O ano de %d é bissexto? %s\n", ano2, (anoBissexto(ano2)));

    }

    public static String anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ? "Sim"
                : "Não";
    }



}
