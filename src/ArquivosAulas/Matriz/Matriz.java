package ArquivosAulas.Matriz;/*
para mexer com matriz, tem que usar array
percorrer array simples é mais facil que uma lista
Array é mais leve
Quando lida com coleçoes em java, tem um aglomerado de dados juntos,isso são coleções
Conjunto de informações
Array de String, só pode strings e vice versa
Matriz = Array bidimensional
contar tamanho é 10, mas contar posição da 9, porque começa do 0
*/

public class Matriz {
    public static void main(String[] args) {

        String[] nomesArray = new String[5];
        //forma antiga para atribuir
        nomesArray[0] = "Meli";
        nomesArray[1] = "Ada";
        nomesArray[2] = "Alexandre";
        nomesArray[3] = "Carlos";
        nomesArray[4] = "Arthur";

        String[][] nomesMatriz = new String[5][5];
        //[]primeiro a linha, []segundo a coluna
        nomesMatriz[0][0] = "Meli";
        nomesMatriz[1][0] = "Ada";
        nomesMatriz[2][0] = "Alexandre";
        nomesMatriz[3][0] = "Carlos";
        nomesMatriz[4][0] = "Arthur";

        int[] nomesArray2 = {1, 2, 3, 4, 5};

        int[][] nomesMatriz2 = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        System.out.println(nomesMatriz2[4][2]);
        matrizNova();
        matrizNova2();
    }

    //    public static int matrizNova(){
//        int[][]matrizNova = new int[10][10];
//        matrizNova[1][3] = 55;
//        return 0;
//    }
    public static void matrizNova() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < matriz.length; i++) {
            // Começou aqui i = 0
            for (int z = 0; z < matriz[i].length; z++) {
                // i = 0      z = 0
                // i = 0      z = 1
                // i = 0      z = 2
                System.out.print(matriz[i][z] + " ");
            }
            System.out.println();

        }
    }
    public static void matrizNova2() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9, 10}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int z = 0; z < matriz[i].length; z++) {
                System.out.print(matriz[i][z] + " ");
            }
            System.out.println();

        }
    }
}
