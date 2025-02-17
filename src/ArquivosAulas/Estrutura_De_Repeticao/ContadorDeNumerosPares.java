package ArquivosAulas.Estrutura_De_Repeticao;

public class ContadorDeNumerosPares {
    public static void main(String[] args) {
        int[] numerosAleatorios = {8, 153, 191, 197, 122, 41, 179, 163, 150, 0, 115, 113, 100, 36, 74, 36, 72, 96, 13, 89};

        int contador = 0;
        for(int numero : numerosAleatorios){
            if(numero % 2 == 0){
                System.out.println(numero);
                contador++;
            }
        }
        System.out.println("Quantidade de números pares: " + contador);
    }
}
