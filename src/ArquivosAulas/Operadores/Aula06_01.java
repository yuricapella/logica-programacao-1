package ArquivosAulas.Operadores;

public class Aula06_01 {
    public static void main(String[] args) {
        boolean eMaiorDeIdade = true; //1
        boolean eMenorDeIdade = false; //2
        System.out.println(eMaiorDeIdade && eMenorDeIdade);
        // print é 3
        // eMaiorDeIdade && é 4
        // eMenorDeIdade é 5

        //& 1 significa que ele vai testar as duas condições independente de passar a primeira
        //&& se a primeira for falsa a segunda nao é testada, 1 teste a menos caso tiver uma pergunta de prova
        //| esse também faz a mesma coisa
        //|| esse ja para se um for verdadeiro

        System.out.println(eMaiorDeIdade == true);
        // == é comparação de valores, em tipos primitivos

        String nome = "Yuri";
        String nomeCompleto = nome + " Capella";
        System.out.println(nome == nomeCompleto);
        // ele comparou a referencia na memoria e não o valor.
        nome = "Yuri"; //new Objeto Nome1
        nomeCompleto = "Yuri"; //new Objeto Nome1
        System.out.println(nome == nomeCompleto);
        // Por mais que esteja comparando referencias, vai dar true pois o java é inteligente e usa a mesma referencia para comparar as strings.
        //Nessa comparação ele viu que já existia o mesmo valor e referenciou para o mesmo objeto
        //A string é a unica que acontece isso, ela consegue perceber se tem igual e compartilha o espaço por tras dos panos
        // mas se fizer
        // String nome = new String("Yuri")
        // String nomeCompleto new String("Yuri")
        // vai dar false pois referenciou como objeto então estão em memorias diferentes
        //String só da new String se for valores diferenes.


        // os tipos primitivos não tem classe por isso são primitivos, não são objetos

        //Para comparar objetos se usa .equals
        System.out.println(nome.equals(nomeCompleto));

        String nome3 = new String("Yuri");
        String nome4 = new String("Yuri");
        System.out.println(nome3 == nome4);



    }
}
