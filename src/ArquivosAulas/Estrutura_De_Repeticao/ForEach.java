package ArquivosAulas.Estrutura_De_Repeticao;

public class ForEach {
    public static void main(String[] args) {
        String[] nomes = {"João", "Maria", "José", "Pedro", "Paulo"};

        for (String nome : nomes) {
            if(nome.length() >= 5){
                break;
            }

        }

        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].length() >= 5){
                break;
            }
        }

        /*
        length é um atributo do array e por isso nao precisa colocar length() como no texto.length()
         */

        /*
        foreach é mais seguro, mais limpo
        for normal pode acontecer de uma condição quebrar o código.

        for (String nome : nomes)
        =
        for(int i = 0; i < nomes.length; i++){
            String nome = nomes[i];
        }

        Enquanto for (String nome : nomes) ja tem index e a lista pronta

        se eu fazer for(int i = -1; i < nomes.length; i++) assim o código quebra, pois não existe index -1
        ou for(int i = 0; i < 6; i++) o array só tem 5 posições, então no ultimo irá quebrar. por isso for each é mais seguro pois ele ja sabe o tamanho do array


         */



        String texto = "Aqui é um texto";
        for (char letra : texto.toCharArray()) {
            System.out.println(letra);
        }

        char[] arrayLetras = texto.toCharArray();

        /*
        toCharArray, transforma texto em
        ['A', 'q', 'u', 'i', ' ', 'é', ' ', 'u', 'm', ' ', 't', 'e', 'x', 't', 'o']
        o texto ainda continua normal, já que é imutavel

         for(index : array){
            System.out.println(array[index]);
         }
         int[] numeros = {1, 2, 3, 4, 5};
         for(int numero : numeros){
            System.out.println(numero);
         }

         */

    }
}
