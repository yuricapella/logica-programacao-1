package ArquivosAulas.Estrutura_De_Repeticao;

public class ForAntigo {
    public static void main(String[] args) {
        for (int count = 0; count <= 10; count++) {
            System.out.println(count);

            if(count > 5){
                continue; //parar por aqui e fazer de novo
            }
            System.out.println("chegou aqui");
        }
        System.out.println("encerrou!");

        int count = 0;
        String texto = "Aqui é um texto";
        String letrasJuntas = texto.replace(" ", "");

        //o garbage collector é inteligente, se o texto está sendo usado para criar uma nova variavel, ele pode em algum momento deletar o texto e deixar só letrasJuntas
        // também da: texto = texto.replace(" ", ""); aponta para outro objeto na memoria até o lixeiro deletar a informação antiga.

        //texto.replace(" ", ""); //não altera o texto, pois o texto é imutável, então tem que capturar o retorno, o print capturaria se colocasse print(texto.replace(" ", "")), mas se botar print(texto) em outra linha. não vai capturar

        System.out.println(letrasJuntas);

        //tudo que eu altero em uma string, tenho que usar uma nova string para capturar essa alteração.

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            System.out.println(texto.charAt(i));
            if(letra == 'u'){
                count++;
            }
        }
        System.out.println("Encerrou!Quantidade de letras 'u': " + count);
    }
}
/*
for(int i = 0; true){} - aqui roda que nem while(true), infinitamente
terminação é a condição que tem que ser false para ele terminar

 */
