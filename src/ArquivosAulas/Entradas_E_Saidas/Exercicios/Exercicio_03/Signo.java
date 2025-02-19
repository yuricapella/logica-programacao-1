package ArquivosAulas.Entradas_E_Saidas.Exercicios.Exercicio_03;

public class Signo {
    public static void exibirSigno(Meses mes, int dia) {
        String resultado = signoAquario(mes, dia) ? "Camus de Aquário" :
                           signoPeixes(mes, dia) ? "Afrodite de Peixes" :
                           signoAries(mes, dia) ? "Mu de Áries" :
                           signoTouro(mes, dia) ? "Aldebaran de Touro" :
                           signoGemeos(mes, dia) ? "Saga de Gêmeos" :
                           signoCancer(mes, dia) ? "Máscara da Morte de Câncer" :
                           signoLeao(mes, dia) ? "Aiolia de Leão" :
                           signoVirgem(mes, dia) ? "Shaka de Virgem" :
                           signoLibra(mes, dia) ? "Dohko de Libra" :
                           signoEscorpiao(mes, dia) ? "Milo de Escorpião" :
                           signoSagitario(mes, dia) ? "Aiolos de Sagitário" :
                           signoCapricornio(mes, dia) ? "Shura de Capricórnio":"";

        System.out.printf("%d de %s é o signo de: %s\n",dia,mes.toString().toLowerCase(),resultado);
    }

    private static boolean signoAquario(Meses mes, int dia) {
        return (mes == Meses.JANEIRO && dia >= 21) || (mes == Meses.FEVEREIRO && dia <= 18);
    }

    private static boolean signoPeixes(Meses mes, int dia) {
        return (mes == Meses.FEVEREIRO && dia >= 19) || (mes == Meses.MARCO && dia <= 20);
    }

    private static boolean signoAries(Meses mes, int dia) {
        return (mes == Meses.MARCO && dia >= 21) || (mes == Meses.ABRIL && dia <= 20);
    }

    private static boolean signoTouro(Meses mes, int dia) {
        return (mes == Meses.ABRIL && dia >= 21) || (mes == Meses.MAIO && dia <= 20);
    }

    private static boolean signoGemeos(Meses mes, int dia) {
        return (mes == Meses.MAIO && dia >= 21) || (mes == Meses.JUNHO && dia <= 20);
    }

    private static boolean signoCancer(Meses mes, int dia) {
        return (mes == Meses.JUNHO && dia >= 21) || (mes == Meses.JULHO && dia <= 22);
    }

    private static boolean signoLeao(Meses mes, int dia) {
        return (mes == Meses.JULHO && dia >= 23) || (mes == Meses.AGOSTO && dia <= 22);
    }

    private static boolean signoVirgem(Meses mes, int dia) {
        return (mes == Meses.AGOSTO && dia >= 23) || (mes == Meses.SETEMBRO && dia <= 22);
    }

    private static boolean signoLibra(Meses mes, int dia) {
        return (mes == Meses.SETEMBRO && dia >= 23) || (mes == Meses.OUTUBRO && dia <= 22);
    }

    private static boolean signoEscorpiao(Meses mes, int dia) {
        return (mes == Meses.OUTUBRO && dia >= 23) || (mes == Meses.NOVEMBRO && dia <= 21);
    }

    private static boolean signoSagitario(Meses mes, int dia) {
        return (mes == Meses.NOVEMBRO && dia >= 22) || (mes == Meses.DEZEMBRO && dia <= 21);
    }

    private static boolean signoCapricornio(Meses mes, int dia) {
        return (mes == Meses.DEZEMBRO && dia >= 22) || (mes == Meses.JANEIRO && dia <= 20);
    }

}
