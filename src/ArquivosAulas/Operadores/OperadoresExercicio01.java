package ArquivosAulas.Operadores;/*
Exercício 6: Verificar o Maior de Três Números
Escreva um programa que aceite três números inteiros e determine o
maior entre eles usando apenas o operador ternário.
 */

public class OperadoresExercicio01 {

    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("Exercício 6: Verificar o Maior de Três Números");
        int a = 10, b = 20, c = 30;
        System.out.printf("Os números são: %d, %d e %d\nO numero maior é: %d\n", a, b, c, numeroMaior(a, b, c));
        System.out.println("--------------------");
    }

    public static int numeroMaior(int a, int b, int c) {
        return (a > b && a > c) ? a
                : (b > a && b > c) ? b
                : c;
    }
}
