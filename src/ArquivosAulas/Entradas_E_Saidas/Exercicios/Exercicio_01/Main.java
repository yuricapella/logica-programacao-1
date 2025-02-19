package ArquivosAulas.Entradas_E_Saidas.Exercicios.Exercicio_01;/*
Exercício 1: Identificar Número Primo
Peça ao usuário para inserir um número inteiro usando
Scanner. Utilize o operador ternário para determinar se o
número inserido é primo ou não, sem usar estruturas de
controle de fluxo.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        entrada.close();

        String resultado = (numero > 1 && verificaPrimo(numero,2)) ? "é primo" : "não é primo";

        System.out.println("O número " + numero + " " + resultado);
    }

    public static boolean verificaPrimo(int numero, int divisor) {
        return divisor == numero || (numero % divisor != 0 && verificaPrimo(numero, divisor + 1));
    }

}
