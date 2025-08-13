package entradasaida;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário digite a temperatura em Celsius
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Converte para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Converte para Kelvin
        double kelvin = celsius + 273.15;

        // Exibe os resultados de forma clara
        System.out.println("\nResultados da Conversão:");
        System.out.println("Temperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        // Fecha o scanner
        scanner.close();
    }
}
