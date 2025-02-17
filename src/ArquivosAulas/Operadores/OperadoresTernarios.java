package ArquivosAulas.Operadores;

public class OperadoresTernarios {
    public static void main(String[] args) {
        boolean maiorDeIdade = true;

        String resultado = null;
        if (maiorDeIdade) {
            resultado = "Maior de idade";
        }else {
            resultado = "Menor de idade";
        }
        System.out.println(resultado);

        //ternario é um condicional if else inline, em linha
        //a boa prática é ser uma comparação simples e não complicar.


        maiorDeIdade = false;
        resultado = maiorDeIdade ? "Maior de idade" : "Menor de idade";
        //                       if                 else
        System.out.println(resultado);

        int contador = 0;

        //Aqui contador++ vai printar 0, pois vai printar e só depois do print vai adicionar
        System.out.println(contador++);
        System.out.println(contador);

        int contador2 = 0;
        //Aqui primeiro ele acrescenta ++ e depois printa
        System.out.println(++contador2);


    }
}
