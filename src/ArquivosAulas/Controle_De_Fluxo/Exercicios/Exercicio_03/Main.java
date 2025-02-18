package ArquivosAulas.Controle_De_Fluxo.Exercicios.Exercicio_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try{
            System.out.println("Digite a unidade de temperatura atual (CELSIUS, FAHRENHEIT, KELVIN):");
            UnidadeTemperatura unidadeAtual = UnidadeTemperatura.valueOf(entrada.nextLine().toUpperCase());

            System.out.println("Digite a unidade de temperatura desejada (CELSIUS, FAHRENHEIT, KELVIN):");
            UnidadeTemperatura unidadeDesejada = UnidadeTemperatura.valueOf(entrada.nextLine().toUpperCase());

            System.out.println("Digite a temperatura atual: (30,20,-10 etc");
            double temperaturaAtual = entrada.nextDouble();

            double resultado = ConversorTemperatura.converteTemperatura(unidadeAtual, unidadeDesejada, temperaturaAtual);

            System.out.printf("Temperatura em %s: %.2f",unidadeDesejada,resultado);
        }catch (IllegalArgumentException e){
            System.out.println("Digite uma entrada válida!");
        }
        entrada.close();
    }
}
