package ArquivosAulas.Controle_De_Fluxo.Exercicios.Exercicio_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a categoria desejada:  (ELETRONICO, VESTUARIO, ALIMENTO)");

        String categoriaEntrada = entrada.nextLine().toUpperCase();
        String resultado = "";

        try{
            CategoriaProduto categoria = CategoriaProduto.valueOf(categoriaEntrada);
            resultado = switch (categoria) {
                case ELETRONICO -> "Categoria: Eletrônico - Produtos como smartphones, televisores, etc.";
                case VESTUARIO -> "Categoria: Vestuário - Produtos como roupas, calçados, etc.";
                case ALIMENTO -> "Categoria: Alimento - Produtos como arroz, feijão, etc.";
            };
        }catch(IllegalArgumentException erro){
            resultado = "Categoria inválida.";
        }

        System.out.println(resultado);
        entrada.close();
    }
}
