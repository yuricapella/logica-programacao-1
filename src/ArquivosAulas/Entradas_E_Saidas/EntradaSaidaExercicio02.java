package ArquivosAulas.Entradas_E_Saidas;/*
Exercício 2: Verificar Dia da Semana
Peça ao usuário para inserir um número de 1 a 7 usando
Scanner, onde 1 representa "Domingo" e 7 representa
"Sábado".
Utilize o operador ternário para exibir o dia da semana
correspondente.
 */

import java.util.Scanner;


public class EntradaSaidaExercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        int numero = entrada.nextInt();
        entrada.close();

        String diaDaSemana = (numero == 1) ? "Domingo":
                             (numero == 2) ? "Segunda-feira":
                             (numero == 3) ? "Terça-feira":
                             (numero == 4) ? "Quarta-feira":
                             (numero == 5) ? "Quinta-feira":
                             (numero == 6) ? "Sexita-feira":
                             (numero == 7) ? "Sabado"      :
                                             "Número inválido!";
        System.out.println(diaDaSemana);
    }
}
