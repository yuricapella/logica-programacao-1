package ArquivosAulas.Matriz;/*
Exercício 1: Criar e preencher uma matriz 2x3
Exercicio 2: Somar todos os elementos da matriz,
se for decimais faça a soma dos numeros, se for String concatene (juntar) os textos
 */


import java.util.Random;


public class MatrizExercicio {
    public static void main(String[] args) {
        minhaSolucaoInt();
        System.out.println("--------------------------");
        minhaSolucaoString();
        //exemploProfessor();

    }
    public static void minhaSolucaoInt() {
        int[][] matriz = new int[2][3];
        Random numeroAleatorio = new Random();
        int total = 0;

        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[a].length; b++) {
                matriz[a][b] = numeroAleatorio.nextInt(10);
                total += matriz[a][b];
                System.out.print(matriz[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println("Soma dos numeros da matriz: " + total);
    }

    public static void minhaSolucaoString() {
        String[][] matrizApresentacao = {
                {"Meu","nome", "é"},
                {"Yuri","Capella","Dos Santos"}
        };

        Random random = new Random();

        String[][] matrizAleatoria = new String[matrizApresentacao.length][matrizApresentacao[0].length];
        StringBuilder resultado = new StringBuilder();

        for (int a = 0; a < matrizAleatoria.length; a++) {
            for (int b = 0; b < matrizAleatoria[a].length; b++) {
                matrizAleatoria[a][b] = matrizApresentacao[random.nextInt(matrizApresentacao.length)][random.nextInt(matrizApresentacao[0].length)];
                System.out.print(matrizAleatoria[a][b] + "|");
                resultado.append(matrizAleatoria[a][b]).append(" ");
            }
            System.out.println();
        }
        System.out.println("Strings concatenadas: " + resultado.toString().trim());
    }

    public static void exemploProfessor(){
        /*
        For each é bom para percorrer
        For classico é bom para atribuir
         */
        int[][] matriz = new int[2][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j * 55;
            }
        }

        for(int[] linha : matriz){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }
}
