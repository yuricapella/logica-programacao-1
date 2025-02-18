package ArquivosAulas.Controle_De_Fluxo.Exercicios.Exercicio_01;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = 6;
        int b = 2;

        System.out.println("Digite uma Operação Matemática: (Operadores: +,-,/,*,%)");
        String operacao = entrada.nextLine();

        OperacaoMatematica simbolo = OperacaoMatematica.ofOperation(operacao);

        int resultado = switch (simbolo){
            case SUBTRACAO -> a - b;
            case SOMA -> a + b;
            case MULTIPLICACAO -> a * b;
            case DIVISAO -> a / b;
            case MODULO -> a % b;
            default -> 0;
        };
        System.out.printf("O resultado de %d %s %d é: %d",a,operacao,b,resultado);

        entrada.close();
    }
}
