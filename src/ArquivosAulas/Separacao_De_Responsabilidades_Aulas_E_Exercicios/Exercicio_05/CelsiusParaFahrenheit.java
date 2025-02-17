package ArquivosAulas.Separacao_De_Responsabilidades_Aulas_E_Exercicios.Exercicio_05;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        /*
        Exercício 5: Converta graus Celsius para Fahrenheit
        Elabore um programa em Java que peça ao usuário para inserir uma
        temperatura em graus Celsius. Desenvolva um método que converta essa
        temperatura para Fahrenheit e mostre o resultado.
        Fórmula:
        (Celsius * 9 / 5) + 32
         */

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");

        double temperaturaEmCelsius = entrada.nextDouble();
        entrada.close();

        System.out.printf("A temperatura em Fahrenheit é: %.2f",calcularFahrenheit(temperaturaEmCelsius));
    }

    public static double calcularFahrenheit(double temperaturaEmCelsius) {
        return (temperaturaEmCelsius * 9 / 5) + 32;
    }
}
