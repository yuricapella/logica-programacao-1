package ArquivosAulas.Operadores;/*

Exercício 7: Determinar a Categoria de um Atleta com Base na Idade
Suponha que você queira determinar a categoria de um atleta com base
em sua idade:
● Se a idade for inferior a 18, a categoria é "Juvenil".
● Se a idade estiver entre 18 e 40 (inclusive), a categoria é
"Adulto".
● Se a idade for superior a 40, a categoria é "Master".
Usar apenas o operador ternário.

*/

public class OperadoresExercicio02 {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("Exercício 7: Determinar a Categoria de um Atleta com Base na Idade");
        int idade = 25, idade2 = 15, idade3 = 45;
        System.out.printf("A idade do atleta é: %d\nA categoria do atleta é: %s\n", idade, categoriaAtleta(idade));
        System.out.printf("A idade do atleta é: %d\nA categoria do atleta é: %s\n", idade2, categoriaAtleta(idade2));
        System.out.printf("A idade do atleta é: %d\nA categoria do atleta é: %s\n", idade3, categoriaAtleta(idade3));
        System.out.println("--------------------");
    }

    public static String categoriaAtleta(int idade) {
        String resultado = (idade < 18) ? "Juvenil"
                : (idade >= 18 && idade <= 40) ? "Adulto"
                : "Master";
        return resultado;
    }
}
