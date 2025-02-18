package ArquivosAulas.Controle_De_Fluxo.Exercicios.Exercicio_03;

public class ConversorTemperatura {

    public static double converteTemperatura(UnidadeTemperatura unidadeAtual, UnidadeTemperatura unidadeDesejada, double temperatura) {
        if (unidadeAtual.equals(UnidadeTemperatura.CELSIUS)) {
            return converteCelsius(unidadeDesejada, temperatura);

        } else if (unidadeAtual.equals(UnidadeTemperatura.FAHRENHEIT)) {
            return converteFahrenheit(unidadeDesejada, temperatura);

        } else if (unidadeAtual.equals(UnidadeTemperatura.KELVIN)) {
            return converteKelvin(unidadeDesejada, temperatura);
        }

        throw new IllegalArgumentException("Unidade de temperatura não reconhecida.");
    }

    private static double converteCelsius(UnidadeTemperatura unidadeDesejada, double temperatura) {
        switch (unidadeDesejada) {
            case FAHRENHEIT:
                return (temperatura * 9 / 5) + 32;
            case KELVIN:
                return temperatura + 273.15;
            default:
                throw new IllegalArgumentException("Unidade de temperatura desejada não reconhecida para Celsius.");
        }
    }

    private static double converteFahrenheit(UnidadeTemperatura unidadeDesejada, double temperatura) {
        switch (unidadeDesejada) {
            case CELSIUS:
                return (temperatura - 32) * 5 / 9;
            case KELVIN:
                return (temperatura + 459.67) * 5 / 9;
            default:
                throw new IllegalArgumentException("Unidade de temperatura desejada não reconhecida para Fahrenheit.");
        }
    }

    private static double converteKelvin(UnidadeTemperatura unidadeDesejada, double temperatura) {
        switch (unidadeDesejada) {
            case CELSIUS:
                return temperatura - 273.15;
            case FAHRENHEIT:
                return (temperatura * 9 / 5) - 459.67;
            default:
                throw new IllegalArgumentException("Unidade de temperatura desejada não reconhecida para Kelvin.");
        }
    }
}