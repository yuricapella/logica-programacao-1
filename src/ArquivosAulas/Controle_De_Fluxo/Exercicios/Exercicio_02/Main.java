package ArquivosAulas.Controle_De_Fluxo.Exercicios.Exercicio_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a categoria desejada:  (ELETRONICO, VESTUARIO, ALIMENTO)");

        String categoriaEntrada = entrada.nextLine().toUpperCase();
        CategoriaProduto categoria = CategoriaProduto.valueOf(categoriaEntrada);

        String resultado = switch (categoria) {
            case ELETRONICO -> "Categoria: Eletrônico - Produtos como smartphones, televisores, etc.";
            case VESTUARIO -> "Categoria: Vestuário - Produtos como roupas, calçados, etc.";
            case ALIMENTO -> "Categoria: Alimento - Produtos como arroz, feijão, etc.";
            default -> {
                System.out.println("Categoria inválida.");
                yield "Categoria inválida.";
            }
        };
        System.out.println(resultado);

        entrada.close();
    }
}
